/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Reader;
import java.sql.SQLException;

/**
 *
 * @author ABC
 */
public class ReaderData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    public static void addNewReader(Reader b) {
        String sql = "insert into tblReader values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, b.getIdR());
            ps.setString(2, b.getName());
            ps.setString(3, b.getAddress());
            ps.setString(4, b.getPhoneNumber());
            ps.setString(5, b.getDateOfBirth());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm độc giả thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Độc giả không được thêm" , "Thông báo", 1);
        }
    }
    
    public static boolean updateReader(Reader kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE tblReader SET Name=?, Address = ?,"
                    + "PhoneNumber = ?,DateOfBirth=? where IDReader = ?");
            ps.setString(5, kh.getIdR());
            ps.setString(1, kh.getName());
            ps.setString(2, kh.getAddress());
            ps.setString(3, kh.getPhoneNumber());
            ps.setString(4, kh.getDateOfBirth());
            ;          
            JOptionPane.showMessageDialog(null, " thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thành công!" , "Thông báo", 1);
            return false;
        }
    }
    
    public static boolean deleteReader(String idReader) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM tblReader WHERE IDReader = ?");
            ps.setString(1, idReader);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    }
                


