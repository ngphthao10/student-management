package View;

import Model.SinhVien;
import Controller.LoadDatabase;
import Model.Nganh;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ThongTinSinhVien extends javax.swing.JFrame {

    public ThongTinSinhVien() {
        initComponents();
        lbSetName.setText(Controller.controller.taiKhoan.getMaTK() + " - " + Controller.controller.taiKhoan.getTenNguoiDung());
        LoadDatabase loadData = new LoadDatabase();
        loadData.fillComboBox(cmbKhoa, "tenKhoa", "KHOA");
        tfMaSV.setEditable(false);
        cmbTrangThai.setEnabled(false);
        cmbMaLop.setEnabled(false);
        cmbNganh.setEnabled(false);
        cmbKhoa.setEnabled(false);
        btChinhSua.setEnabled(false);
        cbNam.setEnabled(false);
        cbNu.setEnabled(false);
        btLuuThongTin.setEnabled(false);
        datechNgaySinh.setEnabled(false);
        btSetImage.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btOut = new javax.swing.JButton();
        lbSetName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btTimKiem = new javax.swing.JButton();
        tfNhapMa = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lb = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNamNhapHoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfMaSV = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbTrangThai = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        lbHinhAnh = new javax.swing.JLabel();
        btSetImage = new javax.swing.JButton();
        cmbKhoa = new javax.swing.JComboBox<>();
        cmbNganh = new javax.swing.JComboBox<>();
        cmbMaLop = new javax.swing.JComboBox<>();
        cbNam = new javax.swing.JCheckBox();
        cbNu = new javax.swing.JCheckBox();
        btLuuThongTin = new javax.swing.JButton();
        btChinhSua = new javax.swing.JButton();
        datechNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Thông tin sinh viên");

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

        lbSetName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetName.setText("XX1 - Ten người dùng");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(869, 869, 869)
                .addComponent(lbSetName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbSetName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(btOut, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jSeparator1)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1069, 700));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nhập mã");

        btTimKiem.setBackground(new java.awt.Color(76, 124, 97));
        btTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        tfNhapMa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTimKiem)
                            .addComponent(tfNhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfNhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb.setText("Mã sinh viên");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Họ và tên");

        tfNamNhapHoc.setEditable(false);
        tfNamNhapHoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Phái");

        tfHoTen.setEditable(false);
        tfHoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Ngày sinh");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Ngành");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Mã lớp");

        tfMaSV.setEditable(false);
        tfMaSV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Số điện thoại");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Email");

        tfEmail.setEditable(false);
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Khoa");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Trạng Thái");

        cmbTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang học", "Đã tốt nghiệp", "Bảo Lưu", "Đã thôi học" }));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel80.setText("Năm nhập học");

        tfSDT.setEditable(false);
        tfSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbHinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        lbHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btSetImage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btSetImage.setText("Set Image");
        btSetImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetImageActionPerformed(evt);
            }
        });

        cmbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbKhoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKhoaItemStateChanged(evt);
            }
        });

        cmbNganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbNganh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNganhItemStateChanged(evt);
            }
        });

        cmbMaLop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ButtonGroup btGroup = new ButtonGroup();
        cbNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbNam.setText("Nam");
        btGroup.add(cbNam);

        cbNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbNu.setText("Nữ");
        btGroup.add(cbNu);

        btLuuThongTin.setBackground(new java.awt.Color(76, 124, 97));
        btLuuThongTin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLuuThongTin.setForeground(new java.awt.Color(255, 255, 255));
        btLuuThongTin.setText("Lưu thông tin");
        btLuuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuThongTinActionPerformed(evt);
            }
        });

        btChinhSua.setBackground(new java.awt.Color(76, 124, 97));
        btChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        btChinhSua.setText("Chỉnh sửa");
        btChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChinhSuaActionPerformed(evt);
            }
        });

        datechNgaySinh.setDateFormatString("dd/MM/yyyy");
        datechNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLayeredPane1.setLayer(lb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfNamNhapHoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfHoTen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfMaSV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cmbTrangThai, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel80, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfSDT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbHinhAnh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btSetImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cmbKhoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cmbNganh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cmbMaLop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbNam, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbNu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btLuuThongTin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btChinhSua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(datechNgaySinh, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel80)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel14))
                .addGap(65, 65, 65)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNamNhapHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addComponent(tfMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(cbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datechNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(lbHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btSetImage)
                                .addGap(85, 85, 85))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbNganh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMaLop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSDT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTrangThai, javax.swing.GroupLayout.Alignment.LEADING, 0, 529, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btLuuThongTin)
                                .addGap(66, 66, 66)
                                .addComponent(btChinhSua))
                            .addComponent(cmbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb)
                            .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbNam)
                            .addComponent(cbNu))
                        .addGap(21, 21, 21)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(datechNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNamNhapHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(btSetImage))
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLuuThongTin)
                    .addComponent(btChinhSua))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if (evt.getSource() == btTimKiem) {
            try {
                String maSV = tfNhapMa.getText();
                SinhVien sv = Controller.LoadDatabase.getThongTinSV(maSV);
                
                if(sv == null) {
                    return;
                }

                btChinhSua.setEnabled(true);
                btLuuThongTin.setEnabled(true);
                tfMaSV.setText(sv.getMaSV());
                tfHoTen.setText(sv.getHoSV() + " " + sv.getTenlotSV() + " " + sv.getTenSV());
                if (sv.getPhai().equals(cbNam.getText())) {
                    cbNam.setSelected(true);
                }
                else cbNu.setSelected(true);
                datechNgaySinh.setDate(sv.getNgaySinh());
                tfEmail.setText(sv.getEmail());
                tfSDT.setText(sv.getSdt());
                tfNamNhapHoc.setText(String.valueOf(sv.getNamNhapHoc()));
                cmbTrangThai.setSelectedItem(sv.getTrangThai());
//                cmbMaLop.addItem(sv.getMaLop());
                try {
                    ArrayList<String> list = LoadDatabase.getNganh_KhoafromMaLop(sv.getMaLop());
                    if (list == null) {
                        JOptionPane.showMessageDialog(rootPane, "Không tồn tại tên khoa, tên ngành", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    cmbKhoa.setSelectedItem(list.get(1));
                    cmbNganh.removeAllItems();
                    LoadDatabase.fillSubComboBox(cmbNganh, cmbKhoa.getSelectedItem().toString());
                    cmbNganh.setSelectedItem(list.get(0));
                    cmbMaLop.removeAllItems();
                    LoadDatabase.fillSubComboBoxMaLop(cmbMaLop, cmbNganh.getSelectedItem().toString());
                    cmbMaLop.setSelectedItem(sv.getMaLop());
                    
                    lbHinhAnh.setIcon(new ImageIcon(sv.getHinhAnh()));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(Controller.controller.taiKhoan.getMaNDN().equals("SV")){
                    btLuuThongTin.setEnabled(false);
                    btChinhSua.setEnabled(false);
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        if (evt.getSource() == btChinhSua) {
                // enable
                tfHoTen.setEditable(true);
                cbNam.setEnabled(true);
                cbNu.setEnabled(true);
                datechNgaySinh.setEnabled(true);
                tfEmail.setEditable(true);
                tfSDT.setEditable(true);
//                tfNamNhapHoc.setEditable(true);
                cmbTrangThai.setEnabled(true);
                cmbMaLop.setEnabled(true);
                cmbNganh.setEnabled(true);
                cmbKhoa.setEnabled(true);
                btSetImage.setEnabled(true);
        }
    }//GEN-LAST:event_btChinhSuaActionPerformed

    private void btSetImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSetImageActionPerformed
        try {
            JFileChooser fptr = new JFileChooser("D:\\Java\\student-management\\student-management\\AnhTheSinhVien");

            fptr.setDialogTitle("Mở file");
            fptr.showOpenDialog(null);
            File fTenAnh = fptr.getSelectedFile();
            String duongDanAnh = fTenAnh.getAbsolutePath();
            SinhVien sv = LoadDatabase.getThongTinSV(tfNhapMa.getText());
            if (duongDanAnh.contains("anhnam") && sv.getPhai().equalsIgnoreCase("Nam")) {
                lbHinhAnh.setIcon(new ImageIcon(duongDanAnh));
            }
            else if (duongDanAnh.contains("anhnu") && sv.getPhai().equalsIgnoreCase("Nữ")) {
                lbHinhAnh.setIcon(new ImageIcon(duongDanAnh));
            }
            else {
                JOptionPane.showMessageDialog(null, "Phải set ảnh phù hợp với giới tính!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSetImageActionPerformed

    private void cmbNganhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNganhItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                cmbMaLop.removeAllItems();
                String selectedItem = (String) cmbNganh.getSelectedItem();
                LoadDatabase.fillSubComboBoxMaLop(cmbMaLop, selectedItem);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbNganhItemStateChanged

    private void cmbKhoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKhoaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                cmbNganh.removeAllItems();
                String selectedItem = (String) cmbKhoa.getSelectedItem();
                LoadDatabase.fillSubComboBox(cmbNganh, selectedItem);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbKhoaItemStateChanged

    private void btLuuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuThongTinActionPerformed
        if (evt.getSource() == btLuuThongTin) {
            try {
                String maSV = tfNhapMa.getText();
                SinhVien sv = updateSinhVien();
                
                tfMaSV.setEnabled(false);
                tfHoTen.setEnabled(false);
                tfEmail.setEnabled(false);
                tfSDT.setEnabled(false);
                btChinhSua.setEnabled(false);
                cmbTrangThai.setEnabled(false);
                cmbMaLop.setEnabled(false);
                cmbNganh.setEnabled(false);
                cmbKhoa.setEnabled(false);
                cbNam.setEnabled(false);
                cbNu.setEnabled(false);
                btLuuThongTin.setEnabled(false);
                datechNgaySinh.setEnabled(false);
                btSetImage.setEnabled(false);
                
                if (sv == null) {
                    JOptionPane.showMessageDialog(null, "Lưu thông tin thất bại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Controller.UpdateData.updateSinhVien(maSV, sv);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btLuuThongTinActionPerformed

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed
    
    public SinhVien updateSinhVien() {
        try { 
            String maSV = tfNhapMa.getText().toUpperCase();
            SinhVien sv = Controller.LoadDatabase.getThongTinSV(maSV);
            
            sv.setMaSV(tfMaSV.getText());
            String[] hoTen = tfHoTen.getText().split(" ");
            if (hoTen.length <= 1) {
                JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập họ tên có 2 chữ trở lên!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            else if (hoTen.length == 2) {
                sv.setHoSV(hoTen[0]);
                sv.setTenSV(hoTen[1]);
            }
            else {
                sv.setHoSV(hoTen[0]);
                sv.setTenSV(hoTen[hoTen.length - 1]);
                hoTen = Arrays.copyOfRange(hoTen, 1, hoTen.length - 1);
                sv.setTenlotSV(String.join(" ", hoTen));
            }
            
            if (cbNam.isSelected()) {
                sv.setPhai(cbNam.getText());
            }
            else if (cbNu.isSelected()) {
                sv.setPhai(cbNu.getText());
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn phái!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            LocalDate localDate = LocalDate.now();
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            if (date.compareTo(datechNgaySinh.getDate()) < 0) {
                JOptionPane.showMessageDialog(rootPane, "Ngày sinh không hợp lệ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            sv.setNgaySinh(datechNgaySinh.getDate());
            String regex = "^[a-zA-Z0-9_]+@gmail\\.com$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tfEmail.getText());
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Địa chỉ email không hợp lệ", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                tfEmail.setText("");
                return null;
            }
            sv.setEmail(tfEmail.getText());
            if (tfSDT.getText().equals("") == true) {
                sv.setSdt(null);
            }
            else if (tfSDT.getText().charAt(0) != '0' || tfSDT.getText().matches("\\d{10,11}") == false) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            } 
            else {
                sv.setSdt(tfSDT.getText());
            }
            
            sv.setMaLop(String.valueOf(cmbMaLop.getSelectedItem()));    
            sv.setNamNhapHoc(Integer.parseInt("20".concat(sv.getMaSV().substring(1, 3))));
            tfNamNhapHoc.setText(String.valueOf(sv.getNamNhapHoc()));
            sv.setTrangThai(String.valueOf(cmbTrangThai.getSelectedItem()));
            sv.setHinhAnh(lbHinhAnh.getIcon().toString());
            return sv;
            
        } catch (ParseException ex) {
            Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(ThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinSinhVien ttsv = new ThongTinSinhVien();
                ttsv.setVisible(true);
                ttsv.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChinhSua;
    private javax.swing.JButton btLuuThongTin;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btSetImage;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JCheckBox cbNam;
    private javax.swing.JCheckBox cbNu;
    private javax.swing.JComboBox<String> cmbKhoa;
    private javax.swing.JComboBox<String> cmbMaLop;
    private javax.swing.JComboBox<String> cmbNganh;
    private javax.swing.JComboBox<String> cmbTrangThai;
    private com.toedter.calendar.JDateChooser datechNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbHinhAnh;
    private javax.swing.JLabel lbSetName;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaSV;
    private javax.swing.JTextField tfNamNhapHoc;
    private javax.swing.JTextField tfNhapMa;
    private javax.swing.JTextField tfSDT;
    // End of variables declaration//GEN-END:variables
}
