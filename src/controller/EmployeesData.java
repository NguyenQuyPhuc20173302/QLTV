
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import model.Employees;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class EmployeesData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    public static void addNewEmployees(Employees b) {
        String sql = "insert into tblEmployees values(?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, b.getIdE());
            ps.setString(2, b.getPassword());
            ps.setString(3, b.getName());
            ps.setString(4, b.getAddress());
            ps.setString(5, b.getPhoneNumber());
            ps.setString(6, b.getDateOfBirth());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Không được thêm" , "Thông báo", 1);
        }
    }
    
    public static boolean updateEmployees(Employees kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE tblEmployees SET Password=?,Name=?,Address = ?,"
                    + "PhoneNumber= ?,DateOfBirth=? where IDEmployees=?");
            ps.setString(6, kh.getIdE());
            ps.setString(1, kh.getPassword());
            ps.setString(2, kh.getName());
            ps.setString(3, kh.getAddress());
            ps.setString(4, kh.getPhoneNumber());
            ps.setString(5, kh.getDateOfBirth());
            JOptionPane.showMessageDialog(null, " thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thành công!" , "Thông báo", 1);
            return false;
        }
    }
    
    public static boolean deleteEmployees(String idEmployees) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM tblEmployees WHERE IDEmployees = ?");
            ps.setString(1, idEmployees);
            JOptionPane.showMessageDialog(null, "xóa thành công!" , "Thông báo", 1);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Không thành công!" , "Thông báo", 1);
            return false;
        }
    }
    public static Employees login(String tk, String mk){   
        Employees kh =null;
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM tblEmployees where IDEmployees = ? and Password= ?");         
            ps.setString(1, tk);
            ps.setString(2, mk);
            rs = ps.executeQuery();
            while(rs.next()){
               kh = new Employees();             
               kh.setName(rs.getString("Name"));
               kh.setAddress(rs.getString("Address"));
               kh.setPhoneNumber(rs.getString("PhoneNumber")); 
               kh.setDateOfBirth(rs.getString("DateOfBirth"));
            }          
        } catch (Exception e) {
            return kh = null ;
        }
        
        return kh ;
    }
    
    

}
