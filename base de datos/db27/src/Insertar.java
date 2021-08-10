import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insertar {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";

        try{
            Connection con = DriverManager.getConnection(jdbcUrl);
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO departments (department_name, location_id) VALUES ('Asistencial', 1700)";
            int rows = stmt.executeUpdate(sql);
            if (rows>0){System.out.println("deparment created-----");}
            con.close();

        } catch (Exception e){
            System.out.println("error: " + e.getMessage());

        }
    }
}
