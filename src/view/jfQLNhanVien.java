/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Connect;
import controller.EmployeesData;
import static controller.IOFile.exportExcel;
import controller.UpdateTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Employees;

/**
 *
 * @author ABC
 */
public class jfQLNhanVien extends javax.swing.JFrame implements ActionListener{
    public static String sql3 = "SELECT * FROM tblEmployees order by IDEmployees asc";
    private String stb;
    public static PreparedStatement ps4;

    /**
     * Creates new form jfQLNhanVien
     */
    public jfQLNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        btnBack.addActionListener(this);
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnTimKiem.addActionListener(this);
        btnDelete.addActionListener(this);
        btnXuatFile.addActionListener(this);
        

        UpdateTable.LoadData(sql3, tblEmployees);
        this.setResizable(false);
        JLabel jl = new JLabel();
        add(jl);
        jl.setSize(1000, 600);

        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Nguye\\Documents\\NetBeansProjects\\Quanlythuvien20173302\\src\\model\\Capture.PNG"));
            int x = jl.getSize().width;
            int y = jl.getSize().height;

            ImageIcon icon = new ImageIcon(image.getScaledInstance(x, y, image.SCALE_SMOOTH));
            jl.setIcon(icon);
        } catch (IOException ex) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKeyWord = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnXuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Từ khóa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số ĐT:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ngày sinh:");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 102, 0));
        btnAdd.setText("Thêm");

        btnUpdate.setBackground(new java.awt.Color(255, 102, 0));
        btnUpdate.setText("Sửa");

        btnDelete.setBackground(new java.awt.Color(255, 102, 0));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 102, 0));
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblEmployees.setBackground(new java.awt.Color(204, 255, 204));
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnTimKiem.setBackground(new java.awt.Color(204, 255, 204));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnXuatFile.setBackground(new java.awt.Color(255, 153, 0));
        btnXuatFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXuatFile.setText("Xuất File");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass)
                            .addComponent(txtName)
                            .addComponent(txtAddress)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDOB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(317, 317, 317)
                                .addComponent(btnBack)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXuatFile)
                                .addGap(251, 251, 251))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnXuatFile))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        try{
            int row = this.tblEmployees.getSelectedRow();
            String IDrow = (this.tblEmployees.getModel().getValueAt(row, 0)).toString();
            String sql8 = "SELECT * FROM tblEmployees where IDEmployees='"+IDrow+"'";
            ResultSet rs = UpdateTable.ShowTextField(sql8);
            if(rs.next()) {
                this.txtID.setText(rs.getString("IDEmployees"));
                this.txtPass.setText(rs.getString("Password"));
                this.txtName.setText(rs.getString("Name"));
                this.txtAddress.setText(rs.getString("Address"));
                this.txtPhoneNumber.setText(rs.getString("PhoneNumber"));
                this.txtDOB.setText(rs.getString("DateOfBirth"));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfQLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfQLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfQLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfQLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfQLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKeyWord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnBack))
            btnBackClick();
        if(e.getSource().equals(btnTimKiem))
            btnTimKiemClick();
        if(e.getSource().equals(btnAdd))
            btnAddClick();
        if(e.getSource().equals(btnUpdate))
            btnUpdateClick();
        if(e.getSource().equals(btnReset))
            btnResetClick();
        if(e.getSource().equals(btnDelete))
            btnDeleteClick();   
        if(e.getSource().equals(btnXuatFile))
            btnXuatFileClick();
        
            
    }
    public void btnBackClick(){
        new jfHome().setVisible(true);
        this.dispose();
    }
    public void btnAddClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã  không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã không được lớn hơn 10 ký tự", "thông báo", 2);
        else {
            Employees b = new Employees(this.txtID.getText(), this.txtPass.getText(), this.txtName.getText(),this.txtAddress.getText(),this.txtPhoneNumber.getText(),this.txtDOB.getText());
            EmployeesData.addNewEmployees(b);
            UpdateTable.LoadData(sql3, tblEmployees);
        }
    }
    public void btnUpdateClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã không được lớn hơn 10 ký tự", "thông báo", 2);
        else {
            Employees s = new Employees(this.txtID.getText(), this.txtPass.getText(), this.txtName.getText(),this.txtAddress.getText(),
            this.txtPhoneNumber.getText(),this.txtDOB.getText());
            EmployeesData.updateEmployees(s);
            UpdateTable.LoadData(sql3, tblEmployees);
        }
    }
    public void btnDeleteClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã không được lớn hơn 10 ký tự", "thông báo", 2);
        else{
            EmployeesData.deleteEmployees(txtID.getText());
            UpdateTable.LoadData(sql3, tblEmployees);
        }
    }
    public void btnResetClick(){
        txtID.setText("");
        txtPass.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtDOB.setText("");
    }
    public void btnTimKiemClick(){
        if(txtKeyWord.getText().length() == 0){
            String sql3 = "SELECT * FROM tblEmployees";
            UpdateTable.LoadData(sql3, tblEmployees);
        }
        else{
            String sqlNV2 =
                    "SELECT * from tblEmployees WHERE "
            + "IDEmployees             like N'%"+this.txtKeyWord.getText()+"%' "
            + "or Address              like N'%"+this.txtKeyWord.getText()+"%'"
            + "or PhoneNumber          like N'%"+this.txtKeyWord.getText()+"%'"
            + "or Name                 like N'%"+this.txtKeyWord.getText()+"%'"
            + "or Password             like N'%"+this.txtKeyWord.getText()+"%'";
            UpdateTable.LoadData(sqlNV2, tblEmployees);
        }
    }
    public void btnXuatFileClick(){
        exportExcel(tblEmployees);
    }
    
     
    public void btnNhapFileClick(){
//        JFileChooser fileChooser = new JFileChooser();
//        int returnValue = fileChooser.showOpenDialog(null);
//        //Neu file duoc chon
//        if(returnValue==JFileChooser.APPROVE_OPTION) {
//        File selectedFile = fileChooser.getSelectedFile();
//        stb=selectedFile.getPath();
////        }
//        EmployeesData.readExcel();
    }
}
