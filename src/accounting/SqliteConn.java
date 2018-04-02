/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.h2.jdbcx.JdbcDataSource;

/**
 *
 * @author hamid
 */
public class SqliteConn {
/*    public static Connection DbConnector(){
        try{
            Connection conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:database0.sqlite");  
            System.out.println(conn);
            return conn;
        }catch( ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return null;
    }   
*/   
    public static Connection getH2Connection(){
        Connection conn = null;
        try {
            JdbcDataSource ds = new JdbcDataSource();
            ds.setURL("jdbc:h2:./database/test");
            ds.setUser("test");
            ds.setPassword("test");
            conn = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
