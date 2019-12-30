/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ABC
 */
public class Reader {
    private String idR;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    public Reader() {
    }
    public Reader(String idR, String name, String address,String phoneNumber , String dob) {
        this.idR = idR;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dob;
    }
    public String getIdR() {
        return idR;
    }

    public void setIdR(String idR) {
        this.idR = idR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}
