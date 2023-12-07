package View;

import javax.swing.ButtonGroup;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btCTDT = new javax.swing.JButton();
        btDSKN = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btPCGD = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btTTGV = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnThongTin = new javax.swing.JMenu();
        mnDoiMK = new javax.swing.JMenu();
        mnDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 38, 131, 24));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Trang chủ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 351, 49));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("XX1 - Ten người dùng");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 241, -1));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 80));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-cat-64.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 80));

        jPanel2.setBackground(new java.awt.Color(209, 232, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCTDT.setBackground(new java.awt.Color(76, 124, 97));
        btCTDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCTDT.setForeground(new java.awt.Color(255, 255, 255));
        btCTDT.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-elective-48.png")); // NOI18N
        btCTDT.setText(" Chương trình đào tạo  ");
        btCTDT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btCTDT.setHideActionText(true);
        btCTDT.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCTDT.setPreferredSize(new java.awt.Dimension(70, 30));
        btCTDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCTDTActionPerformed(evt);
            }
        });
        jPanel2.add(btCTDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 80));

        btDSKN.setBackground(new java.awt.Color(76, 124, 97));
        btDSKN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDSKN.setForeground(new java.awt.Color(255, 255, 255));
        btDSKN.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-department-48.png")); // NOI18N
        btDSKN.setText(" Danh sách khoa, ngành");
        btDSKN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btDSKN.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDSKN.setPreferredSize(new java.awt.Dimension(70, 30));
        btDSKN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSKNActionPerformed(evt);
            }
        });
        jPanel2.add(btDSKN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 80));

        jButton8.setBackground(new java.awt.Color(76, 124, 97));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-report-card-48.png")); // NOI18N
        jButton8.setText(" Chi tiết bảng điểm        ");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 80));

        btPCGD.setBackground(new java.awt.Color(76, 124, 97));
        btPCGD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btPCGD.setForeground(new java.awt.Color(255, 255, 255));
        btPCGD.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-assignment-48.png")); // NOI18N
        btPCGD.setText(" Phân công giảng dạy    ");
        btPCGD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btPCGD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btPCGD.setPreferredSize(new java.awt.Dimension(70, 30));
        btPCGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPCGDActionPerformed(evt);
            }
        });
        jPanel2.add(btPCGD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 80));

        jButton10.setBackground(new java.awt.Color(76, 124, 97));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-register-48.png")); // NOI18N
        jButton10.setText(" Đăng ký lớp tín chỉ       ");
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton10.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 80));

        jButton11.setBackground(new java.awt.Color(76, 124, 97));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-class-48.png")); // NOI18N
        jButton11.setText(" Thông tin lớp học        ");
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton11.setPreferredSize(new java.awt.Dimension(70, 30));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 80));

        jButton12.setBackground(new java.awt.Color(76, 124, 97));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-student-48.png")); // NOI18N
        jButton12.setText(" Thông tin sinh viên     ");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton12.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 290, 80));

        btTTGV.setBackground(new java.awt.Color(76, 124, 97));
        btTTGV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTTGV.setForeground(new java.awt.Color(255, 255, 255));
        btTTGV.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-teacher-48.png")); // NOI18N
        btTTGV.setText(" Thông tin giảng viên   ");
        btTTGV.setToolTipText("");
        btTTGV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btTTGV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btTTGV.setPreferredSize(new java.awt.Dimension(70, 30));
        btTTGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTTGVActionPerformed(evt);
            }
        });
        jPanel2.add(btTTGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 290, 80));

        jButton14.setBackground(new java.awt.Color(76, 124, 97));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-exit-48 (1).png")); // NOI18N
        jButton14.setText(" Thoát                             ");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton14.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 290, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 730));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\6_innovation01 (1).jpg")); // NOI18N
        jPanel3.add(jLabel7);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 1220, 730));

        jMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-menu-16.png")); // NOI18N
        jMenu.setText("Menu");

        mnThongTin.setText("Thông tin tài khoản");
        jMenu.add(mnThongTin);

        mnDoiMK.setText("Đổi mật khẩu");
        jMenu.add(mnDoiMK);

        mnDangXuat.setText("Đăng xuất");
        jMenu.add(mnDangXuat);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCTDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCTDTActionPerformed
        ChuongTrinhDaoTao ctdt = new ChuongTrinhDaoTao();
        ctdt.setExtendedState(MAXIMIZED_BOTH);
        ctdt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCTDTActionPerformed

    private void btDSKNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSKNActionPerformed
        DanhSachKhoaNganh dskn = new DanhSachKhoaNganh();
        dskn.setExtendedState(MAXIMIZED_BOTH);
        dskn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDSKNActionPerformed

    private void btPCGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPCGDActionPerformed
        PhanCongGiangDay pcgd = new PhanCongGiangDay();
        pcgd.setExtendedState(MAXIMIZED_BOTH);
        pcgd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPCGDActionPerformed

    private void btTTGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTTGVActionPerformed
        ThongTinGiangVien ttgv = new ThongTinGiangVien();
        ttgv.setExtendedState(MAXIMIZED_BOTH);
        ttgv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTTGVActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed


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
            java.util.logging.Logger.getLogger(GiaoDienTTTKGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTTTKGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTTTKGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTTTKGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage hp = new HomePage();
                hp.setVisible(true);
                hp.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCTDT;
    private javax.swing.JButton btDSKN;
    private javax.swing.JButton btPCGD;
    private javax.swing.JButton btTTGV;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu mnDangXuat;
    private javax.swing.JMenu mnDoiMK;
    private javax.swing.JMenu mnThongTin;
    // End of variables declaration//GEN-END:variables
}
