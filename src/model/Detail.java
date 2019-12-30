/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Doan Thien Duc
 */
public class Detail {
    private String idBill;
    private String idBook;
    private String ngayTra;
    private String tienPhat;
    private String tinhTrang;

    public Detail() {
    }

    public Detail(String idBill, String idBook, String ngayTra, String tienPhat, String tinhTrang) {
        this.idBill = idBill;
        this.idBook = idBook;
        this.ngayTra = ngayTra;
        this.tienPhat = tienPhat;
        this.tinhTrang = tinhTrang;
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(String tienPhat) {
        this.tienPhat = tienPhat;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
}
