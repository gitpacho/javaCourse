import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection con = DriverManager.getConnection(jdbcUrl);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM departments WHERE department_id = 12";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("--Department deleted--");
            } else {
                System.out.println("--Department dont exists--");
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}