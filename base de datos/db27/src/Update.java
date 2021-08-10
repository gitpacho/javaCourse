import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {

        // para actualizar un registro
        //

        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection con = DriverManager.getConnection(jdbcUrl);
            Statement stmt = con.createStatement();
            String sql = "UPDATE departments SET location_id = 1700 WHERE department_id = 5";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("--REGISTRO ACTUALIZADO--");
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: ");           
        }
    }
}

