/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author imdah
 */

    public class DbHelper {
    private String userName="root";
    private String password= "1234";
    private String dbUrl ="jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException{
    
    
        return DriverManager.getConnection(dbUrl,userName,password);
    
    
    }
    
    public void showErrorMessage(SQLException exception) {
        System.out.println("Eroor : " + exception.getMessage());
        System.out.println("Error Code : " + exception.getErrorCode());
        
    
    }
    
}
    

