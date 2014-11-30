/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andiksetyawan.controllers;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.andiksetyawan.models.orangModel;
import com.andiksetyawan.views.orangView;

/**
 *
 * @author Andik S
 */
public class orangControlel {
    private orangModel model;
    
    public orangControlel(orangModel model) {
        this.model = model;
    }

    public void setModel(orangModel model) {
        this.model = model;
    }
    
    
    public void reset(orangView view){
        model.resetOrang();
    }
    public void insert(orangView view) throws SQLException{
        String nama = view.getTextNama().getText();        
        model.setNama(nama);
            
           // model.insertOrang();
            
            if(model.insertOrang()==true){
                System.out.println("insert sukses");
                model.resetOrang();
            }else{
                System.out.println("gagal");
            }
            
        
       
    }
}
