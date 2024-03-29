/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static controller.IOFile.exportExcel;
import controller.ReaderData;
import controller.UpdateTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Reader;

/**
 *
 * @author ABC
 */
public class jfTTDocGia extends javax.swing.JFrame implements ActionListener{
    public static String sql2 = "SELECT * FROM tblReader order by IDReader asc";
    /**
     * Creates new form jfTTDocGia
     */
    public jfTTDocGia() {
        initComponents();
        setLocationRelativeTo(null);
        btnBack.addActionListener(this);
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnTimKiem.addActionListener(this);
        btnDelete.addActionListener(this);
        btnXuatFile.addActionListener(this);
        btnNhapFile.addActionListener(this);
        UpdateTable.LoadData(sql2, tblReader);
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
//      ProcessCrt(false);
        
    }
//    public void ProcessCrt(boolean b) {
//        this.btnAdd.setEnabled(b);
//        this.btnDelete.setEnabled(b);
//        this.btnUpdate.setEnabled(b);
//    }

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
        txtKeyWord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReader = new javax.swing.JTable();
        btnXuatFile = new javax.swing.JButton();
        btnNhapFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN KHÁCH HÀNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Từ khóa:");

        txtKeyWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyWordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên độc giả:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SĐT:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ngày sinh:");

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setText("Thêm");

        btnUpdate.setBackground(new java.awt.Color(255, 153, 51));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 51));
        btnDelete.setText("Xóa");

        btnReset.setBackground(new java.awt.Color(255, 153, 51));
        btnReset.setText("Làm mới");

        btnTimKiem.setBackground(new java.awt.Color(204, 255, 204));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblReader.setBackground(new java.awt.Color(204, 255, 204));
        tblReader.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReaderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReader);

        btnXuatFile.setBackground(new java.awt.Color(255, 153, 51));
        btnXuatFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXuatFile.setText("Xuất File");

        btnNhapFile.setBackground(new java.awt.Color(255, 153, 51));
        btnNhapFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhapFile.setText("Nhập File");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtAddress)
                            .addComponent(txtName)
                            .addComponent(txtID)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnXuatFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNhapFile)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199)
                .addComponent(btnBack)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNhapFile)
                            .addComponent(btnXuatFile)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnReset))))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblReaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReaderMouseClicked

        try{
            int row = this.tblReader.getSelectedRow();
            String IDrow = (this.tblReader.getModel().getValueAt(row, 0)).toString();
            String sql3 = "SELECT * FROM tblReader where IDReader='"+IDrow+"'";
            ResultSet rs = UpdateTable.ShowTextField(sql3);
            if(rs.next()) {
                this.txtID.setText(rs.getString("IDReader"));
                this.txtName.setText(rs.getString("Name"));
                this.txtAddress.setText(rs.getString("Address"));
                this.txtPhoneNumber.setText(rs.getString("PhoneNumber"));
                this.txtDOB.setText(rs.getString("DateOfBirth"));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblReaderMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtKeyWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyWordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_A || evt.getKeyCode() == KeyEvent.VK_S || evt.getKeyCode() == KeyEvent.VK_Q || evt.getKeyCode() == KeyEvent.VK_W || evt.getKeyCode() == KeyEvent.VK_E || evt.getKeyCode() == KeyEvent.VK_R || evt.getKeyCode() == KeyEvent.VK_T || evt.getKeyCode() == KeyEvent.VK_Y || evt.getKeyCode() == KeyEvent.VK_U || evt.getKeyCode() == KeyEvent.VK_I || evt.getKeyCode() == KeyEvent.VK_O || evt.getKeyCode() == KeyEvent.VK_P || evt.getKeyCode() == KeyEvent.VK_D ||
                evt.getKeyCode() == KeyEvent.VK_F || evt.getKeyCode() == KeyEvent.VK_G || evt.getKeyCode() == KeyEvent.VK_H || evt.getKeyCode() == KeyEvent.VK_J ||
                evt.getKeyCode() == KeyEvent.VK_K || evt.getKeyCode() == KeyEvent.VK_L || evt.getKeyCode() == KeyEvent.VK_Z || evt.getKeyCode() == KeyEvent.VK_X || evt.getKeyCode() == KeyEvent.VK_C || evt.getKeyCode() == KeyEvent.VK_V || evt.getKeyCode() == KeyEvent.VK_B ||
                evt.getKeyCode() == KeyEvent.VK_M || evt.getKeyCode() == KeyEvent.VK_ENTER ||evt.getKeyCode() == KeyEvent.VK_SPACE){
            this.btnTimKiem.doClick();
        }
    }//GEN-LAST:event_txtKeyWordKeyPressed

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
            java.util.logging.Logger.getLogger(jfTTDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfTTDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfTTDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfTTDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfTTDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNhapFile;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReader;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKeyWord;
    private javax.swing.JTextField txtName;
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
        if(e.getSource().equals(btnNhapFile))
            btnNhapFileClick();
    }
    public void btnBackClick(){
        new jfHome().setVisible(true);
        this.dispose();
    }
    public void btnAddClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã độc giả không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã độc giả không được lớn hơn 10 ký tự", "thông báo", 2);
        else {
            Reader b = new Reader(this.txtID.getText(), this.txtName.getText(), this.txtAddress.getText(),this.txtPhoneNumber.getText(),this.txtDOB.getText());
            ReaderData.addNewReader(b);
            UpdateTable.LoadData(sql2, tblReader);
        }
    }    
    public void btnUpdateClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã độc giả không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã độc giả không được lớn hơn 10 ký tự", "thông báo", 2);
        else {
            Reader s = new Reader(this.txtID.getText(), this.txtName.getText(), this.txtAddress.getText(),this.txtPhoneNumber.getText(),
            this.txtDOB.getText());
            ReaderData.updateReader(s);
            UpdateTable.LoadData(sql2, tblReader);
        }
    }
    public void btnDeleteClick(){
        if (this.txtID.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã độc giả không thể bỏ trống", "thông báo", 2);
        else if(this.txtID.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã độc giả không được lớn hơn 10 ký tự", "thông báo", 2);
        else{
            ReaderData.deleteReader(txtID.getText());
            UpdateTable.LoadData(sql2, tblReader);
        }
        }
    
    public void btnResetClick(){
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtDOB.setText("");
    }
    public void btnTimKiemClick(){
        if(txtKeyWord.getText().length() == 0){
            String sql3 = "SELECT * FROM tblReader";
            UpdateTable.LoadData(sql3, tblReader);
        }
        else{
            String sqlDG2 =
                    "SELECT * from tblReader WHERE "
            + "IDReader             like N'%"+this.txtKeyWord.getText()+"%' "
            + "or Address              like N'%"+this.txtKeyWord.getText()+"%'"
            + "or PhoneNumber          like N'%"+this.txtKeyWord.getText()+"%'"
            + "or Name                 like N'%"+this.txtKeyWord.getText()+"%'"
            + "or DateOfBirth             like N'%"+this.txtKeyWord.getText()+"%'";
            UpdateTable.LoadData(sqlDG2, tblReader);
        }
    }
    public void btnXuatFileClick(){
        exportExcel(tblReader);
    }
    public void btnNhapFileClick(){
        
    }
}
