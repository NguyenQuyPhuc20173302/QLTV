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
public class Bill {
    private String idBill;
    private String idReader;
    private String idEmployees;
    private String ngayMuon;
    private String ngayHen;
    private String tienCoc;

    public Bill() {
    }

    public Bill(String idBill, String idReader, String idEmployees, String ngayMuon, String ngayHen, String tienCoc) {
        this.idBill = idBill;
        this.idReader = idReader;
        this.idEmployees = idEmployees;
        this.ngayMuon = ngayMuon;
        this.ngayHen = ngayHen;
        this.tienCoc = tienCoc;
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getIdReader() {
        return idReader;
    }

    public void setIdReader(String idReader) {
        this.idReader = idReader;
    }

    public String getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(String idEmployees) {
        this.idEmployees = idEmployees;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayHen() {
        return ngayHen;
    }

    public void setNgayHen(String ngayHen) {
        this.ngayHen = ngayHen;
    }

    public String getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(String tienCoc) {
        this.tienCoc = tienCoc;
    }

    
}
