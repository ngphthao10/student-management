package View;

import Model.TaiKhoan;

public class GiaoDienThongTinTaiKhoan extends javax.swing.JFrame {

    public GiaoDienThongTinTaiKhoan() {
        initComponents();
        showInformation();
    }

    public void showInformation(){
        TaiKhoan tkhoan = Controller.controller.taiKhoan;
        lbMaTK.setText(tkhoan.getMaTK());
        lbTenND.setText(tkhoan.getTenNguoiDung());
        lbTenDN.setText(tkhoan.getTenDangNhap());
        lbTT.setOpaque(tkhoan.isTrangThaiXoa());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbMaSV2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbHoTen2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbMaTK1 = new javax.swing.JLabel();
        lbTenND1 = new javax.swing.JLabel();
        lbTT1 = new javax.swing.JLabel();
        lbTenDN1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(460, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        btOut.setBackground(new java.awt.Color(209, 232, 195));
        btOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-cat-64.png")); // NOI18N
        btOut.setBorder(null);
        btOut.setBorderPainted(false);
        btOut.setFocusPainted(false);
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Thông tin tài khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOut)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbMaSV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMaSV2.setForeground(new java.awt.Color(76, 124, 97));
        lbMaSV2.setText("Mã tài khoản:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(76, 124, 97));
        jLabel21.setText("Tên đăng nhập:");

        lbHoTen2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbHoTen2.setForeground(new java.awt.Color(76, 124, 97));
        lbHoTen2.setText("Tên người dùng");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(76, 124, 97));
        jLabel22.setText("Trạng thái tài khoản:");

        lbMaTK1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaTK1.setText("Mã nhóm người dùng:");

        lbTenND1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTenND1.setText("Mã nhóm người dùng:");

        lbTT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTT1.setText("Mã nhóm người dùng:");

        lbTenDN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTenDN1.setText("Mã nhóm người dùng:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMaSV2)
                    .addComponent(lbHoTen2)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaTK1)
                    .addComponent(lbTT1)
                    .addComponent(lbTenDN1)
                    .addComponent(lbTenND1))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaSV2)
                    .addComponent(lbMaTK1))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoTen2)
                    .addComponent(lbTenND1))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lbTenDN1))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lbTT1))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        this.dispose();  
    }//GEN-LAST:event_btOutActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienThongTinTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GiaoDienThongTinTaiKhoan gdtttk = new GiaoDienThongTinTaiKhoan();
                gdtttk.setLocationRelativeTo(null);
                gdtttk.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbHoTen1;
    private javax.swing.JLabel lbHoTen2;
    private javax.swing.JLabel lbMaSV1;
    private javax.swing.JLabel lbMaSV2;
    private javax.swing.JLabel lbMaTK;
    private javax.swing.JLabel lbMaTK1;
    private javax.swing.JLabel lbTT;
    private javax.swing.JLabel lbTT1;
    private javax.swing.JLabel lbTenDN;
    private javax.swing.JLabel lbTenDN1;
    private javax.swing.JLabel lbTenND;
    private javax.swing.JLabel lbTenND1;
    // End of variables declaration//GEN-END:variables
}
