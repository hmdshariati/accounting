/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hamid
 */
public class SqliteConn {
    public static Connection DbConnector(){
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
}
