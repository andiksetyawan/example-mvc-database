/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andiksetyawan.services;

import com.andiksetyawan.entity.orang;

/**
 *
 * @author Andik S
 */
public interface orangServIntf {
    public boolean insertOrang(orang orang);
    //kenapa saya memakai boolean ? 
    //karena ntr berfungsi sebagai status pengiriman data ,apkah berhasil atau gagal    
}
