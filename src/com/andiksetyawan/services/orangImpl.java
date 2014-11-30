/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andiksetyawan.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.andiksetyawan.entity.orang;

/**
 *
 * @author Andik S
 */
public class orangImpl implements orangServIntf{

    private Connection connection;
    private PreparedStatement statement;

    public orangImpl() throws SQLException {
        connection = database.getConnection();
    }

    
//    public orangImpl(Connection connection) {
//        this.connection = connection;
//    }
    
    String insert = "insert into orang (nama) values(?)";
    
    @Override
    public boolean insertOrang(orang o) {
        statement = null;
        try {            
            statement =  connection.prepareStatement(insert);
            statement.setString(1, o.getNama());            
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {            
            //System.out.println("eror :"+e.getMessage());
            return false;
        } finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(orangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
