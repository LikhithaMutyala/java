import java.sql.*;

public class UpdateDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/laikya", "root", "Laikya@777");

            Statement st = con.createStatement();

            // Example: Update department location where did = 1
            int rows = st.executeUpdate(
                "UPDATE Department SET dlocation = 'Hyderabad' WHERE did = 1");

            if (rows > 0) {
                System.out.println("Record Updated Successfully");
            } else {
                System.out.println("No Record Found");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}