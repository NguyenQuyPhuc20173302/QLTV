/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.UpdateTable.ps;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author Doan Thien Duc
 */
public class BillData {
    public static boolean kiemTra;
    public static void addNewBill(Bill b){
        kiemTra=true;
        String sql = "insert into tblBill values(?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, b.getIdBill());
            ps.setString(2, b.getIdReader());
            ps.setString(3, b.getIdEmployees());
            ps.setString(4,b.getNgayMuon());
            ps.setString(5, b.getNgayHen());
            ps.setString(6, b.getTienCoc());
            ps.execute();
        } catch(Exception e) {
            kiemTra=false;
            JOptionPane.showMessageDialog(null, "Mã đơn đã tồn tại" , "Thông báo", 1);
        }
    }
    public static boolean updateBill(Bill kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE tblBook SET IDReader=?,"
                    + "IDEmployees = ?,NgayMuon=?, NgayHen=?,TienCoc=? where IDBill = ?");
            ps.setString(1, kh.getIdBill());
            ps.setString(1, kh.getIdReader());
            ps.setString(2, kh.getIdEmployees());
            ps.setString(3, kh.getNgayMuon());
            ps.setString(4, kh.getNgayHen());
            ps.setString(5, kh.getTienCoc());       
            JOptionPane.showMessageDialog(null, "Sửa thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa không thành công!" , "Thông báo", 1);
            return false;
        }
    }
    
    public static boolean deleteBill(String idBill) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM tblBill WHERE IDBill = ?");
            ps.setString(1, idBill);
            JOptionPane.showMessageDialog(null, "Xóa thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa hông thành công!" , "Thông báo", 1);
            return false;
        }
    }
}
