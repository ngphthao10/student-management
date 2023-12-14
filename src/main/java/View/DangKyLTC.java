package View;

import Controller.LoadDatabase;
import Controller.controller;
import Model.DangKy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DangKyLTC extends javax.swing.JFrame {

    /**
     * Creates new form DangKyLTC
     * @param tenKhoa
     */
    public DangKyLTC(String tenKhoa) {
        initComponents();
        LoadDatabase loadData = new LoadDatabase();
        setLocationRelativeTo(null);
        
        try {
            loadData.fillSubComboBoxMaLTC(cmbMaLTC, tenKhoa);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DangKyLTC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfMaSV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btDangKy = new javax.swing.JButton();
        btHuyDangKy = new javax.swing.JButton();
        btNhapMoi = new javax.swing.JButton();
        cmbMaLTC = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Mã sinh viên");

        tfMaSV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Mã lớp tín chỉ");

        btDangKy.setBackground(new java.awt.Color(76, 124, 97));
        btDangKy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btDangKy.setText("Đăng ký");
        btDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKyActionPerformed(evt);
            }
        });

        btHuyDangKy.setBackground(new java.awt.Color(76, 124, 97));
        btHuyDangKy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuyDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btHuyDangKy.setText("Hủy đăng ký");
        btHuyDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyDangKyActionPerformed(evt);
            }
        });

        btNhapMoi.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoi.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoi.setText("Nhập mới");
        btNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapMoiActionPerformed(evt);
            }
        });

        cmbMaLTC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(cmbMaLTC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHuyDangKy)
                    .addComponent(btNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btDangKy))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btHuyDangKy)
                    .addComponent(cmbMaLTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btNhapMoi)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Đăng ký lớp tín chỉ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKyActionPerformed
        if(evt.getSource() == btDangKy) {
            if (tfMaSV.getText().equals("") || cmbMaLTC.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn phải điền đầy đủ thông tin!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            addDangKy();
        }
    }//GEN-LAST:event_btDangKyActionPerformed

    private void btHuyDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyDangKyActionPerformed
        if (evt.getSource() == btHuyDangKy) {
            if (tfMaSV.getText().equals("") || cmbMaLTC.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn phải điền đầy đủ thông tin!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            deleteDangKy();
        }
    }//GEN-LAST:event_btHuyDangKyActionPerformed

    private void btNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiActionPerformed
        if (evt.getSource() == btNhapMoi) {
            tfMaSV.setText("");
            cmbMaLTC.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btNhapMoiActionPerformed
    
    public void addDangKy() {
        try {
            DangKy dk = new DangKy(
                tfMaSV.getText(), Integer.parseInt(cmbMaLTC.getSelectedItem().toString())
            );
            
            LoadDatabase.loadTableDangKy();
            for (DangKy dkItem: controller.arrayListDangKy) {
                if (dkItem.getMaLTC() == dk.getMaLTC() && dkItem.getMaSV().equals(dk.getMaSV())) {
                    JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký lớp tín chỉ này!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            Controller.InsertData.insertDangKy(dk);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DangKyLTC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteDangKy() {
        DangKy dk = new DangKy(
            tfMaSV.getText(), Integer.parseInt(cmbMaLTC.getSelectedItem().toString())
        );
        LoadDatabase.loadTableDangKy();
        for (DangKy dkItem: controller.arrayListDangKy) {
            if (dkItem.getMaLTC() == dk.getMaLTC() && dkItem.getMaSV().equals(dk.getMaSV())) {
                try {
                    Controller.DeleteData.deleteDangKy(dk.getMaLTC(), dk.getMaSV());
                    LoadDatabase.loadTableDangKy();
                    return;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DangKyLTC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Bạn chưa đăng ký lớp tín chỉ này!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
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
            java.util.logging.Logger.getLogger(DangKyLTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyLTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyLTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyLTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new DangKyLTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKy;
    private javax.swing.JButton btHuyDangKy;
    private javax.swing.JButton btNhapMoi;
    private javax.swing.JComboBox<String> cmbMaLTC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfMaSV;
    // End of variables declaration//GEN-END:variables
}
