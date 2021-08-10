import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStmt {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            String depName = "Limpieza";
            Integer locID = 2980;            
            Connection con = DriverManager.getConnection(jdbcUrl);
            String sql = "INSERT INTO departments (department_name, location_id) VALUES (?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, depName);
            pstmt.setInt(2, locID);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("--Department crated WHIT PSTMT--");
            } else{
                System.out.println("--DEPARMT NO CREATED");
            }
        } catch (Exception e) {
            System.out.println("ERROR");            

        } 
    }
}