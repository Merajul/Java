
package cbrs;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBconnect {
    
    public static Connection connection() {
        Connection con = null;
        try {
            //Driver load
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //connection string
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "bubt", "123");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: "+e);
        }
        return con;
    }
    
}
