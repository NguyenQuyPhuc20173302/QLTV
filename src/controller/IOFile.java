/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.jfMuonSach;

/**
 *
 * @author Doan Thien Duc
 */
public class IOFile {
    public static void Report(){
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setSize(500, 500);
            if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String content = jfMuonSach.phieu;
                jfc.setDialogTitle("Save File");
                FileOutputStream fos = new FileOutputStream(jfc.getSelectedFile());
                fos.write(content.getBytes());
                fos.flush();
                fos.close();
                JOptionPane.showMessageDialog(null, "Lưu thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void exportExcel(JTable table) {
       JFileChooser chooser = new JFileChooser();
       int i = chooser.showSaveDialog(chooser);
       if (i == JFileChooser.APPROVE_OPTION) {
       File file = chooser.getSelectedFile();
       try {
         FileWriter out = new FileWriter(file + ".xls");
         BufferedWriter bwrite = new BufferedWriter(out);
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         // ten Cot
         for (int j = 0; j < table.getColumnCount(); j++) {
         bwrite.write(model.getColumnName(j) + "\t");
         } 
         bwrite.write("\n");
   // Lay du lieu dong
         for (int j = 0; j < table.getRowCount(); j++) {
           for (int k = 0; k < table.getColumnCount(); k++) {
            bwrite.write(model.getValueAt(j, k) + "\t");
            }
         bwrite.write("\n");
         }
         bwrite.close();
         JOptionPane.showMessageDialog(null, "Lưu file thành công!");
         } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
       }
    }
}
