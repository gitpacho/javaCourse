import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
    String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";

    try{
        Connection con = DriverManager.getConnection(jdbcUrl);
        String sql = "SELECT * FROM departments";
        Statement stm = con.createStatement();
        ResultSet resultado = stm.executeQuery(sql);
        int space = 20;

        while (resultado.next()){
            String IdDept = resultado.getString("department_id");
            String NombreDep = resultado.getString("department_name");
            String IdLoc = resultado.getString("location_id");
            String fila = IdDept + ": " + NombreDep + " " + IdLoc;
            System.out.println(fila);
        }

    } catch (SQLException e) {
        System.out.println("se ha producido error: " + e.getMessage());
    }
}
}