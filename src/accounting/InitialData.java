/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamid
 */
public class InitialData {
    
    public static final String PEOPLE_TABLE = "People";
    
    public static void main(String args[]){
        InitialData initialData = new InitialData();
        initialData.createTables();
        initialData.addMockData();
    }
    
    public void createTables(){
        Connection conn = Conn.getH2Connection();
        try {
            //String query = "DROP TABLE IF EXISTS " + PEOPLE_TABLE;
            //conn.createStatement().execute(query);
            String query = "CREATE TABLE IF NOT EXISTS " + PEOPLE_TABLE + " (" +
                    "id int primary key," +
                    "username varchar(255)," +
                    "password varchar(255)" +
                    ")";
            
            conn.createStatement().execute(query);
            String query2 = "insert into " + PEOPLE_TABLE+ " values (1,'test1','test');";
            conn.createStatement().execute(query2);
        } catch (SQLException ex) {
            Logger.getLogger(InitialData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addMockData() {
        
    }
}
