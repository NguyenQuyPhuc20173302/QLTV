/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ABC
 */
public class Book {
    private String idB;
    private String name;
    private String kindOfBook;
    private String author;
    private String publishingCompany;
    private String quanlity;
    private String price;

    public Book() {
    }

    public Book(String idB, String name, String kindOfBook, String author, String publishingCompany, String quanlity, String price) {
        this.idB = idB;
        this.name = name;
        this.kindOfBook = kindOfBook;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.quanlity = quanlity;
        this.price = price;
    }

    public String getIdB() {
        return idB;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfBook() {
        return kindOfBook;
    }

    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(String quanlity) {
        this.quanlity = quanlity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    

    
}
