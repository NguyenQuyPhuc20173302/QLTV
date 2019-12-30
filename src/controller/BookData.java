/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Book;

/**
 *
 * @author ABC
 */
public class BookData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    public static void addNewBook(Book b){
        String sql = "insert into tblBook values(?,?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, b.getIdB());
            ps.setString(2, b.getName());
            ps.setString(3, b.getKindOfBook());
            ps.setString(4, b.getAuthor());
            ps.setString(5,b.getPublishingCompany());
            ps.setString(6, b.getQuanlity());
            ps.setString(7, b.getPrice());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm sách thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Sách không được thêm" , "Thông báo", 1);
        }
    }
    public static boolean updateBook(Book kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE tblBook SET Name=?, KindOfBook = ?,"
                    + "Author = ?,PublishingCompany=?, Quanlity=?,Price=? where IDBook = ?");
            ps.setString(7, kh.getIdB());
            ps.setString(1, kh.getName());
            ps.setString(2, kh.getKindOfBook());
            ps.setString(3, kh.getAuthor());
            ps.setString(4, kh.getPublishingCompany());
            ps.setString(5, kh.getQuanlity());
            ps.setString(6, kh.getPrice());          
            JOptionPane.showMessageDialog(null, "Sửa thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa không thành công!" , "Thông báo", 1);
            return false;
        }
    }
    
    public static boolean deleteBook(String idBook) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM tblBook WHERE IDBook = ?");
            ps.setString(1, idBook);
            JOptionPane.showMessageDialog(null, "Xóa thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa hông thành công!" , "Thông báo", 1);
            return false;
        }
    }

}
