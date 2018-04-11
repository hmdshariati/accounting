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
    
    public static final String Products_TABLE = "Products";
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
            String query = "CREATE TABLE IF NOT EXISTS  Products (" 
                    +"ID int  primary key,"
                    + "QTY int,"
                    + "ISBN13 varchar(13),"
                    + "ISBN10 varchar(10),"
                    + "title varchar(1000),"
                    + "BookCode int," 
                    + "Unit int,"
                    + "eric int,"
                    + "netprc int,"
                    + "AUTHOR char,"
                    + "INV_COD char,"
                    + "DISP_COD int,"
                    + "SUB_COD int,"
                    + "YEAR date, " 
                    + "CUR_LISTPRICE int,"
                    + "CUR_SALE_PRICE int," 
                    + "CUR_COD int,"
                    + "RIAL_LISTPRICE int,"
                    + "RIALI_SALEPRICE int,"
                    + "INIT_QTY int," 
                    +"SUB_COD1 int,"
                    + "SUB_COD2 int,"
                    + "PUBLISHER char); "
                    +"CREATE TABLE IF NOT EXISTS  Anbar (ID int primary key,productID int ,Loc int); "
                    +"CREATE TABLE IF NOT EXISTS  People ("
                    + "ID int primary key,"
                    + "fname varchar(255),"
                    + "lname varchar(255),"
                    + "nationCode varchar(10),"
                    + "peopleType int,"
                    + "username char,"
                    + "password char);"
                    
                    + "CREATE TABLE IF NOT EXISTS  Factors ("
                    + "ID int primary key,"
                    + "cashType int,"
                    + "peopleID int,"
                    + "total int," 
                    + "factorDate date,"
                    + "factorNo int,"
                    + "password char,"
                    + "prices int);"
                    
                    + "CREATE TABLE IF NOT EXISTS FactorsDetails (" 
                    + "ID int primary key,"
                    + "FactorID int,"
                    + "AnbarID int,"
                    + "Disc int);";
            
            
            
            conn.createStatement().execute(query);
            String query2 = "insert into " + PEOPLE_TABLE+ "(ID,username,password) values (1,'test1','test');";
            conn.createStatement().execute(query2);
        } catch (SQLException ex) {
            Logger.getLogger(InitialData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addMockData() {
        
    }
}
