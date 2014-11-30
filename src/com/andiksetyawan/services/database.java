/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andiksetyawan.services;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andik S
 */
public class database {
    private static Connection connection;
    public static Connection getConnection(){
        try {
            MysqlDataSource source = new MysqlDataSource();        
            source.setURL("jdbc:mysql://localhost:3306/mvc");
            source.setUser("root");
            source.setPassword("");
            connection = source.getConnection();
           
        } catch (SQLException ex) {
            System.out.println("gagal menghubungkan ke database");
            //Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection;
    }
    
    
}
