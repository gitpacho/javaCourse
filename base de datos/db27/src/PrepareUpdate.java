import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareUpdate {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Integer locId = 1800;
            Integer depId = 7;
            Connection con = DriverManager.getConnection(jdbcUrl);
            String sql = "UPDATE departments SET location_id = ? WHERE department_id = ?";
            PreparedStatement pStmt = con.prepareStatement(sql);
            pStmt.setInt(1, locId);
            pStmt.setInt(2, depId);

            int rows = pStmt.executeUpdate();
            if (rows > 0) {
                System.out.println("--Department updated WHIT PSTMT--");
            } else{
                System.out.println("--DEPARMT NO updated");
            }

            pStmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERRor");
        }
    }
}
