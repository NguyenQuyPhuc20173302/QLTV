/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Detail;

/**
 *
 * @author Doan Thien Duc
 */
public class DetailData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static boolean addNewDetail(Detail b){
        String sql = "insert into tblDetailBill values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, b.getIdBill());
            ps.setString(2, b.getIdBook());
            ps.setString(3, b.getNgayTra());
            ps.setString(5, b.getTinhTrang());
            ps.setString(4 ,b.getTienPhat());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã mượn thành công!" , "Thông báo", 1);
            return true;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Mượn sách không thành công" , "Thông báo", 1);
            return false;
        }
    }
}
