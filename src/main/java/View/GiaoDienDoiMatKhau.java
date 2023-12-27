package View;

import Controller.UpdateData;
import Model.TaiKhoan;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GiaoDienDoiMatKhau extends javax.swing.JFrame {

    public GiaoDienDoiMatKhau() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbHien = new javax.swing.JCheckBox();
        btXacNhan = new javax.swing.JButton();
        oldPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        retypePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        btOut.setBackground(new java.awt.Color(209, 232, 195));
        btOut.setIcon(new javax.swing.ImageIcon("D:\\Java\\student-management\\student-management\\Image\\icons8-cat-64.png")); // NOI18N
        btOut.setBorder(null);
        btOut.setBorderPainted(false);
        btOut.setFocusPainted(false);
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 124, 97));
        jLabel1.setText("ĐỔI MẬT KHẨU");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu cũ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mật khẩu mới:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nhập lại mật khẩu:");

        cbHien.setText("Hiện mật khẩu");
        cbHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienActionPerformed(evt);
            }
        });

        btXacNhan.setBackground(new java.awt.Color(76, 124, 97));
        btXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btXacNhan.setText("Xác nhận");
        btXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXacNhanActionPerformed(evt);
            }
        });

        oldPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        newPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        retypePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(retypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbHien)
                .addGap(18, 18, 18)
                .addComponent(btXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage home = new HomePage();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed

    private void cbHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienActionPerformed
        if (cbHien.isSelected()) {
            oldPassword.setEchoChar((char) 0);
            newPassword.setEchoChar((char) 0);
            retypePassword.setEchoChar((char) 0);
        } else {
            oldPassword.setEchoChar('*');
            newPassword.setEchoChar('*');
            retypePassword.setEchoChar('*');
        }  
    }//GEN-LAST:event_cbHienActionPerformed
    public static boolean arePasswordsMatching(String newPassword, String retypePassword) {
        return newPassword.equals(retypePassword);
    }
    private void btXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXacNhanActionPerformed
        String newPass = (String) newPassword.getText();
        String retypePass = (String) retypePassword.getText();
        if (newPass.length() < 6) {
            JOptionPane.showMessageDialog(null, "Mật khẩu phải dài hơn 5 ký tự!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(arePasswordsMatching(newPass, retypePass)){
            //viet cau truy van updatePassword roi cho hien Joptionpan la doi mat khau thanh cong
            if(Controller.controller.taiKhoan.getMatKhau().equals(oldPassword.getText())){
                try {
                    UpdateData.changePassword(Controller.controller.taiKhoan, newPass);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GiaoDienDoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Nhập sai mật khẩu cũ! Vui lòng thử lại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp! Vui lòng thử lại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        GiaoDienDangNhap dn = new GiaoDienDangNhap();
        dn.setVisible(true);
        dn.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GiaoDienDoiMatKhau dmk = new GiaoDienDoiMatKhau();
                dmk.setVisible(true);
                dmk.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOut;
    private javax.swing.JButton btXacNhan;
    private javax.swing.JCheckBox cbHien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JPasswordField retypePassword;
    // End of variables declaration//GEN-END:variables
}
