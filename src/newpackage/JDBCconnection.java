/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author azure Tran
 */
public class JDBCconnection {
    public static Connection getJDBCconnection(){
    final String url="jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433";final String user="sa";final String password="123456";
    try{
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    return  DriverManager.getConnection(url,user,password);
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    
    
    
    }
    catch(Exception e){
        e.printStackTrace();
    
    
    }
    
     return null;
    }
   
}
