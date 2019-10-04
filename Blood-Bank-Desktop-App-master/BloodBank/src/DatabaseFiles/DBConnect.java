package DatabaseFiles;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConnect {

    private Statement stmt = null;
    private Connection connection;

    public DBConnect() {
    }

    public Connection connectToDB() throws SQLException, ClassNotFoundException {
        try {

            System.out.println("awwwwwwwwwwwwwwwwwwwwwwwwwwwwww...");
            Class.forName("oracle.jdbc.driver.OracleDriver");

//creating connecti








on
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@103.66.177.142:1521:orcl", "bloodbank", "bloodbank123");

            Statement se = con.createStatement();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        return connection;
    }

    public void disconnectFromDB() {

        try {
            // if (rs != null){rs.close();}
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }

    public boolean insertDataToDB(String query) {
        try {
            java.sql.Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Insert Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
