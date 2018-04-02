/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.sql.*;




/**
 *
 * @author hamid
 */
public class LoginModel {
    Connection connection;
    public LoginModel(){
//        connection =  SqliteConn.DbConnector();
        connection =  SqliteConn.getH2Connection();
        if (connection != null){
            System.out.println("success");
        }else{
            System.out.println("not success");
        }
    }
    public boolean isLogin(String username, String password) throws SQLException {
        PreparedStatement selectUser = null;
        ResultSet resultSet = null;
        String query = "select * from People where username = ? and password = ? ";
        try {
            System.out.println(resultSet);
            selectUser = connection.prepareStatement(query);
            selectUser.setString(1, username);
            selectUser.setString(2, password);
            System.out.println(selectUser);
            resultSet = selectUser.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                System.out.println(resultSet);  
                return false;
            }
        } catch (SQLException e){
            return false;
        } finally {

			if (selectUser != null) {
				selectUser.close();
			}

			if (resultSet != null) {
				resultSet.close();
			}

		}
        
    }
}
