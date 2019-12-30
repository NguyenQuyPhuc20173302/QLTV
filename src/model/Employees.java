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
public class Employees {
    private String idE;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private String password;

    public Employees() {
    }
    public Employees(String idE, String pass, String name, String address,String phoneNumber , String dob) {
        super();
        this.idE = idE;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dob;
        this.password=pass;
    }
    public String getIdE() {
        return idE;
    }

    public void setIdE(String id) {
        this.idE = idE;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}
