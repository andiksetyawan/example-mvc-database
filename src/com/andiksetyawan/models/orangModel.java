/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andiksetyawan.models;

import java.sql.SQLException;
import com.andiksetyawan.entity.orang;
import com.andiksetyawan.services.orangImpl;
import com.andiksetyawan.services.orangServIntf;

/**
 *
 * @author Andik S
 */
public class orangModel {
    private String nama;
    private orangModelListener modelListener;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnchange();
    }

    public orangModelListener getModelListener() {
        return modelListener;
    }

    public void setModelListener(orangModelListener modelListener) {
        this.modelListener = modelListener;
    }    
    protected void fireOnchange(){
        if(modelListener!=null){
            modelListener.onChange(this);
        }
    }   
    public void resetOrang(){
        setNama("");
    }
    public boolean insertOrang() throws SQLException{
        orangImpl impl = new orangImpl();
        orang o = new orang();
        o.setNama(nama);
        //impl.insertOrang(o);
        return impl.insertOrang(o);
    }
}
