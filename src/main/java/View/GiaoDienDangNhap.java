package View;

import Controller.LoadDatabase;
import Model.TaiKhoan;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class GiaoDienDangNhap extends javax.swing.JFrame {
    
    TaiKhoan taiKhoan = new TaiKhoan();
    public GiaoDienDangNhap() {
        initComponents();
    }
    public void showHomeGUI(){
        String tenDN = tfTaiKhoan.getText();
        String pass = password.getText();
        if(tenDN.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LoadDatabase.loadTableTaiKhoan();
        LoadDatabase.loadTablePhanQuyen();
        int index = -1;
        for (TaiKhoan tk : Controller.controller.arrayListTaiKhoan) {
            if (tenDN.equals(tk.getTenDangNhap().trim())) {
                index = Controller.controller.arrayListTaiKhoan.indexOf(tk);
            }
        }
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            TaiKhoan tk = Controller.controller.arrayListTaiKhoan.get(index);
            if (tk.getMatKhau().equals(pass)) {
                taiKhoan = tk;

                if ((tk.getMaNDN().equals("SV")|| tk.getMaNDN().equals("GV") || tk.getMaNDN().equals("AD")) && tk.isTrangThaiXoa() == false) {
                    this.dispose();
                    HomePage home = new HomePage();
                    home.setVisible(true);
                    home.setExtendedState(MAXIMIZED_BOTH);

                } else {
                    JOptionPane.showMessageDialog(null, "Tài khoản không được cấp quyền truy cập", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sai mật khẩu", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btOut = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        cbHienMK = new javax.swing.JCheckBox();
        btDangNhap = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 435));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Đăng nhập");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 78));

        btOut.setBackground(new java.awt.Color(209, 232, 195));
        btOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-x-30.png")); // NOI18N
        btOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btOut.setBorderPainted(false);
        btOut.setFocusPainted(false);
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });
        jPanel1.add(btOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel23.setText("MoliSM");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Student Management");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mật khẩu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        tfTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 540, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tài khoản");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 540, 40));

        cbHienMK.setText("Hiện mật khẩu");
        cbHienMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienMKActionPerformed(evt);
            }
        });
        jPanel1.add(cbHienMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        btDangNhap.setBackground(new java.awt.Color(76, 124, 97));
        btDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btDangNhap.setText("Đăng nhập");
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 210, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-cat-64.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed

    private void cbHienMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienMKActionPerformed
        if (cbHienMK.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }  
    }//GEN-LAST:event_cbHienMKActionPerformed

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        this.showHomeGUI();
    }//GEN-LAST:event_btDangNhapActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.showHomeGUI();
        }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GiaoDienDangNhap gddn = new GiaoDienDangNhap();
                gddn.setVisible(true);
                gddn.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangNhap;
    private javax.swing.JButton btOut;
    private javax.swing.JCheckBox cbHienMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField tfTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
