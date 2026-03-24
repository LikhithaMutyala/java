import java.sql.*;
import java.util.Scanner;

public class DeleteDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/laikya", "root", "Laikya@777");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter dept id to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM Department WHERE dept_id = ?");

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("No Record Found with given ID");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}