/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.ds;

/**
 *
 * @author CARLOS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CARLOS
 */
public class AccesoDB {
    public Connection getConnection(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/repartos",
                                           "root","moxi");
        }catch (Exception e){
            System.out.println(e);
        }
        return cn;
    }
    public AccesoDB(){
        
    }
}