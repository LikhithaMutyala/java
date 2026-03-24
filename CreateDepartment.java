import java.sql.*;

public class CreateDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kavya", "root", "Kavya@03");

            Statement st = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Department (" +
                         "did INT PRIMARY KEY, " +
                         "dname VARCHAR(50), " +
                         "dlocation VARCHAR(50))";

            st.executeUpdate(sql);
            System.out.println("table created");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
