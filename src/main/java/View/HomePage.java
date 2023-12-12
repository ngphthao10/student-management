package View;

import Controller.LoadDatabase;
import Model.NhomNguoiDangNhap;
import Model.TaiKhoan;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    public HomePage(String maNND) {
        initComponents();
        lbSetName.setText(Controller.controller.taiKhoan.getMaTK() + " - " + Controller.controller.taiKhoan.getTenNguoiDung());
        ArrayList<String> tenMH = new ArrayList<String>();
        tenMH = LoadDatabase.loadQuyenByNND(maNND);
        if (!tenMH.contains("Chương trình đào tạo")) {
            btCTDT.setEnabled(false);
        }
        if (!tenMH.contains("Danh sách khoa, ngành")) {
            btDSKN.setEnabled(false);
        }
        if (!tenMH.contains("Chi tiết bảng điểm")) {
            btCTBD.setEnabled(false);
        }
        if (!tenMH.contains("Phân công giảng dạy")) {
            btPCGD.setEnabled(false);
        }
        if (!tenMH.contains("Đăng ký lớp tín chỉ")) {
            btDKLTC.setEnabled(false);
        }
        if (!tenMH.contains("Thông tin lớp học")) {
            btTTLH.setEnabled(false);
        }
        if (!tenMH.contains("Thông tin sinh viên")) {
            btTTSV.setEnabled(false);
        }
        if (!tenMH.contains("Thông tin giảng viên")) {
            btTTGV.setEnabled(false);
        }
    }

    public HomePage() {
        initComponents();
        lbSetName.setText(Controller.controller.taiKhoan.getMaNDN() + " - " + Controller.controller.taiKhoan.getTenNguoiDung());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbSetName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btCTDT = new javax.swing.JButton();
        btDSKN = new javax.swing.JButton();
        btCTBD = new javax.swing.JButton();
        btPCGD = new javax.swing.JButton();
        btDKLTC = new javax.swing.JButton();
        btTTLH = new javax.swing.JButton();
        btTTSV = new javax.swing.JButton();
        btTTGV = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnIThongTin = new javax.swing.JMenuItem();
        mnIDoiMK = new javax.swing.JMenuItem();
        mnIDangXuat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
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

        lbSetName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetName.setText("XX1 - Ten người dùng");
        jPanel1.add(lbSetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 390, -1));

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

        btCTBD.setBackground(new java.awt.Color(76, 124, 97));
        btCTBD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCTBD.setForeground(new java.awt.Color(255, 255, 255));
        btCTBD.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-report-card-48.png")); // NOI18N
        btCTBD.setText(" Chi tiết bảng điểm        ");
        btCTBD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btCTBD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCTBD.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(btCTBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 80));

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

        btDKLTC.setBackground(new java.awt.Color(76, 124, 97));
        btDKLTC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDKLTC.setForeground(new java.awt.Color(255, 255, 255));
        btDKLTC.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-register-48.png")); // NOI18N
        btDKLTC.setText(" Đăng ký lớp tín chỉ       ");
        btDKLTC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btDKLTC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDKLTC.setPreferredSize(new java.awt.Dimension(70, 30));
        btDKLTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDKLTCActionPerformed(evt);
            }
        });
        jPanel2.add(btDKLTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 80));

        btTTLH.setBackground(new java.awt.Color(76, 124, 97));
        btTTLH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTTLH.setForeground(new java.awt.Color(255, 255, 255));
        btTTLH.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-class-48.png")); // NOI18N
        btTTLH.setText(" Thông tin lớp học        ");
        btTTLH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btTTLH.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btTTLH.setPreferredSize(new java.awt.Dimension(70, 30));
        btTTLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTTLHActionPerformed(evt);
            }
        });
        jPanel2.add(btTTLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 80));

        btTTSV.setBackground(new java.awt.Color(76, 124, 97));
        btTTSV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTTSV.setForeground(new java.awt.Color(255, 255, 255));
        btTTSV.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-student-48.png")); // NOI18N
        btTTSV.setText(" Thông tin sinh viên     ");
        btTTSV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btTTSV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btTTSV.setPreferredSize(new java.awt.Dimension(70, 30));
        btTTSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTTSVActionPerformed(evt);
            }
        });
        jPanel2.add(btTTSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 290, 80));

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

        btThoat.setBackground(new java.awt.Color(76, 124, 97));
        btThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThoat.setForeground(new java.awt.Color(255, 255, 255));
        btThoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-exit-48 (1).png")); // NOI18N
        btThoat.setText(" Thoát                             ");
        btThoat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btThoat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btThoat.setPreferredSize(new java.awt.Dimension(70, 30));
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel2.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 290, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 730));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\6_innovation01 (1).jpg")); // NOI18N
        jPanel3.add(jLabel7);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 1230, 730));

        jMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-menu-16.png")); // NOI18N
        jMenu.setText("Menu");

        mnIThongTin.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\User group.png")); // NOI18N
        mnIThongTin.setText("Thông tin tài khoản");
        mnIThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIThongTinActionPerformed(evt);
            }
        });
        jMenu.add(mnIThongTin);

        mnIDoiMK.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\Key.png")); // NOI18N
        mnIDoiMK.setText("Đổi mật khẩu");
        mnIDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIDoiMKActionPerformed(evt);
            }
        });
        jMenu.add(mnIDoiMK);

        mnIDangXuat.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\Exit.png")); // NOI18N
        mnIDangXuat.setText("Đăng xuất");
        mnIDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIDangXuatActionPerformed(evt);
            }
        });
        jMenu.add(mnIDangXuat);

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

    private void btTTLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTTLHActionPerformed
        DanhSachSinhVienTheoLopHoc lh = new DanhSachSinhVienTheoLopHoc();
        lh.setExtendedState(MAXIMIZED_BOTH);
        lh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTTLHActionPerformed

    private void mnIThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIThongTinActionPerformed
        if (Controller.controller.taiKhoan.getMaNDN().equals("SV") || Controller.controller.taiKhoan.getMaNDN().equals("GV")) {
            GiaoDienThongTinTaiKhoan TTTK = new GiaoDienThongTinTaiKhoan();
            TTTK.setLocationRelativeTo(null);
            TTTK.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Không có thông tin của admin!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnIThongTinActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void mnIDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIDoiMKActionPerformed
        GiaoDienDoiMatKhau dmk = new GiaoDienDoiMatKhau();
        dmk.setLocationRelativeTo(null);
        dmk.setVisible(true);
    }//GEN-LAST:event_mnIDoiMKActionPerformed

    private void mnIDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIDangXuatActionPerformed
        GiaoDienDangNhap dn = new GiaoDienDangNhap();
        dn.setLocationRelativeTo(null);
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnIDangXuatActionPerformed

    private void btTTSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTTSVActionPerformed
        ThongTinSinhVien ttsv = new ThongTinSinhVien();
        ttsv.setExtendedState(MAXIMIZED_BOTH);
        ttsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTTSVActionPerformed

    private void btDKLTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDKLTCActionPerformed
        QuanLyLopTinChi qlltc = new QuanLyLopTinChi();
        qlltc.setExtendedState(MAXIMIZED_BOTH);
        qlltc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDKLTCActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
                hp.setVisible(true);
                hp.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCTBD;
    private javax.swing.JButton btCTDT;
    private javax.swing.JButton btDKLTC;
    private javax.swing.JButton btDSKN;
    private javax.swing.JButton btPCGD;
    private javax.swing.JButton btTTGV;
    private javax.swing.JButton btTTLH;
    private javax.swing.JButton btTTSV;
    private javax.swing.JButton btThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbSetName;
    private javax.swing.JMenuItem mnIDangXuat;
    private javax.swing.JMenuItem mnIDoiMK;
    private javax.swing.JMenuItem mnIThongTin;
    // End of variables declaration//GEN-END:variables
}
