package View;

import javax.swing.ButtonGroup;
import Controller.LoadDatabase;
import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.SinhVien;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import Controller.controller;
import Model.BangDiemHocKy;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DanhSachSinhVienTheoLopHoc extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    public DanhSachSinhVienTheoLopHoc() {
        initComponents();
        LoadDatabase loadData = new LoadDatabase();
        loadData.fillComboBox(cmbKhoa, "tenKhoa", "KHOA");
        model = (DefaultTableModel) tbSVTheoLop.getModel();
        model.setRowCount(0);
        
        tbSVTheoLop.setRowHeight(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbNganh = new javax.swing.JComboBox<>();
        btTimKiem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbKhoa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbLop = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSVTheoLop = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbMaMH = new javax.swing.JLabel();
        tfMaSV = new javax.swing.JTextField();
        lbTenMH = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        lbPhanLoai = new javax.swing.JLabel();
        ButtonGroup btGioiTinh = new ButtonGroup();
        cbNam = new javax.swing.JCheckBox();
        cbNu = new javax.swing.JCheckBox();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btNhapMoi = new javax.swing.JButton();
        lbTenMH1 = new javax.swing.JLabel();
        lbTenMH2 = new javax.swing.JLabel();
        lbTenMH3 = new javax.swing.JLabel();
        lbTenMH4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        cmbTrangThai = new javax.swing.JComboBox<>();
        lbTenMH5 = new javax.swing.JLabel();
        tfNamNhapHoc = new javax.swing.JTextField();
        datechNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Danh sách sinh viên theo lớp");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("XX - Ten người dùng");

        btOut.setBackground(new java.awt.Color(209, 232, 195));
        btOut.setIcon(new javax.swing.ImageIcon("D:\\Java\\student-management\\student-management\\Image\\icons8-cat-64.png")); // NOI18N
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btOut)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1069, 700));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Lớp");

        cmbNganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbNganh.setToolTipText("");
        cmbNganh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNganhItemStateChanged(evt);
            }
        });

        btTimKiem.setBackground(new java.awt.Color(76, 124, 97));
        btTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Khoa");

        cmbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbKhoa.setToolTipText("");
        cmbKhoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKhoaItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Ngành");

        cmbLop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbLop.setToolTipText("");
        cmbLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLopItemStateChanged(evt);
            }
        });

        tbSVTheoLop.setBorder(new javax.swing.border.MatteBorder(null));
        tbSVTheoLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbSVTheoLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sinh viên", "Họ và tên", "Phái", "Ngày sinh", "Email", "SĐT", "Mã lớp", "NNH", "Trạng thái"
            }
        ));
        tbSVTheoLop.setFocusCycleRoot(true);
        tbSVTheoLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSVTheoLopMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSVTheoLop);
        if (tbSVTheoLop.getColumnModel().getColumnCount() > 0) {
            tbSVTheoLop.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbSVTheoLop.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbSVTheoLop.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbSVTheoLop.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbSVTheoLop.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbSVTheoLop.getColumnModel().getColumn(5).setPreferredWidth(200);
            tbSVTheoLop.getColumnModel().getColumn(6).setPreferredWidth(150);
            tbSVTheoLop.getColumnModel().getColumn(7).setPreferredWidth(150);
            tbSVTheoLop.getColumnModel().getColumn(8).setPreferredWidth(50);
            tbSVTheoLop.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cmbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH.setText("Mã sinh viên");

        tfMaSV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH.setText("Họ và tên");

        tfHoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbPhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPhanLoai.setText("Phái");

        cbNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbNam.setText("Nam");
        btGioiTinh.add(cbNam);

        cbNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbNu.setText("Nữ");
        btGioiTinh.add(cbNu);

        btThem.setBackground(new java.awt.Color(76, 124, 97));
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("THÊM");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(76, 124, 97));
        btSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("SỬA");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(76, 124, 97));
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("XÓA");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btNhapMoi.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoi.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoi.setText("NHẬP MỚI");
        btNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapMoiActionPerformed(evt);
            }
        });

        lbTenMH1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH1.setText("Ngày sinh");

        lbTenMH2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH2.setText("SĐT");

        lbTenMH3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH3.setText("Email");

        lbTenMH4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH4.setText("Năm nhập học");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cmbTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang học", "Đã tốt nghiệp", "Bảo lưu", "Đã thôi học" }));

        lbTenMH5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH5.setText("Trạng thái");

        tfNamNhapHoc.setEditable(false);
        tfNamNhapHoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        datechNgaySinh.setDateFormatString("dd/MM/yyyy");
        datechNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbTenMH5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbTenMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNamNhapHoc))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(cbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbTenMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(datechNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbTenMH3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbTenMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSDT))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btSua)
                        .addGap(18, 18, 18)
                        .addComponent(btNhapMoi)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaMH)
                    .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTenMH)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPhanLoai)
                            .addComponent(cbNam)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbNu)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTenMH1)
                    .addComponent(datechNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenMH3))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTenMH2)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMH4)
                    .addComponent(tfNamNhapHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMH5)
                    .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btNhapMoi))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if (evt.getSource() == btTimKiem) {
            showData();
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
       if (evt.getSource() == btThem) {
           try {
               if (tfMaSV.getText().equals("") || tfHoTen.getText().equals("") || (cbNam.isSelected() == false && cbNu.isSelected() == false) || datechNgaySinh.getDate() == null || tfEmail.getText().equals("")) {
                   JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đầy đủ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                   return;
               }
               SinhVien sv = addSinhVien();
               if (sv == null) {
                   return;
               }
               Controller.InsertData.insertSinhVien(sv);
               addBangDiemHocKy(sv);
               showData();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (evt.getSource() == btXoa) {
            deleteSinhVien();
            showData();
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if (evt.getSource() == btSua) {
            try {
                if (tfMaSV.getText().equals("") || tfHoTen.getText().equals("") || (cbNam.isSelected() == false && cbNu.isSelected() == false) || datechNgaySinh.getDate() == null || tfEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đầy đủ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int index = tbSVTheoLop.getSelectedRow();
                String maSVItem = controller.arrayListSinhVien.get(index).getMaSV();
                SinhVien sv = updateSinhVien();
                if (sv == null) {
                    return;
                }
                Controller.UpdateData.updateSinhVien(maSVItem, sv);
                showData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiActionPerformed
        if (evt.getSource() == btNhapMoi) {
            tfMaSV.setText("");
            tfHoTen.setText("");
            cbNam.setSelected(false);
            cbNu.setSelected(false);
            datechNgaySinh.setDate(null);
            tfEmail.setText("");
            tfSDT.setText("");
            tfNamNhapHoc.setText("");
            cmbTrangThai.setSelectedItem("Đang học");
        }
    }//GEN-LAST:event_btNhapMoiActionPerformed

    private void cmbKhoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKhoaItemStateChanged
        // TODO add your handling code here:
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

    private void cmbNganhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNganhItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                cmbLop.removeAllItems();
                String selectedItem = (String) cmbNganh.getSelectedItem();
                LoadDatabase.fillSubComboBoxLop(cmbLop, selectedItem);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cmbNganhItemStateChanged

    private void cmbLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLopItemStateChanged

    }//GEN-LAST:event_cmbLopItemStateChanged

    private void tbSVTheoLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSVTheoLopMouseClicked
        int index = tbSVTheoLop.getSelectedRow();
        SinhVien sv = controller.arrayListSinhVien.get(index);
        
        tfMaSV.setText(sv.getMaSV());
        tfHoTen.setText(sv.getHoSV() + " " + sv.getTenlotSV() + " " + sv.getTenSV());
        if (sv.getPhai().equalsIgnoreCase(cbNam.getText())) {
            cbNam.setSelected(true);
        }
        else {
            cbNu.setSelected(true);
        }
        datechNgaySinh.setDate(sv.getNgaySinh());
        tfEmail.setText(sv.getEmail());
        tfSDT.setText(sv.getSdt());
        tfNamNhapHoc.setText(String.valueOf(sv.getNamNhapHoc()));
        cmbTrangThai.setSelectedItem(sv.getTrangThai());
    }//GEN-LAST:event_tbSVTheoLopMouseClicked

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed

    public void showData() {
        try {
            LoadDatabase.loadTableLop(cmbLop);
            model.setRowCount(0);
            int dem = 0;
            
            // duyệt qua danh sách sinh viên của lớp
            for (SinhVien sv: controller.arrayListSinhVien) {
                dem++;
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String ngSinh = dateFormat.format(sv.getNgaySinh());
                Object[] row = new Object[] {
                    dem, sv.getMaSV(), sv.getHoSV() + " " + sv.getTenlotSV() + " " + sv.getTenSV(), sv.getPhai(), ngSinh,
                    sv.getEmail(), sv.getSdt(), sv.getMaLop(), sv.getNamNhapHoc(), sv.getTrangThai()
                };
                model.addRow(row);
            }
        } catch (ParseException ex) {
            Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public SinhVien addSinhVien() {
        try {
            LoadDatabase.loadTableLop(cmbLop);
            SinhVien sv = new SinhVien();
            sv.setMaSV(tfMaSV.getText());
            for (SinhVien svItem: controller.arrayListSinhVien) {
                if (svItem.getMaSV().equalsIgnoreCase(sv.getMaSV())) {
                    JOptionPane.showMessageDialog(rootPane, "Mã sinh viên đã tồn tại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            }
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
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn phái!!");
                return null;
            }
            LocalDate localDate = LocalDate.now();
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            if (date.compareTo(datechNgaySinh.getDate()) < 0) {
                JOptionPane.showMessageDialog(rootPane, "Ngày sinh không hợp lệ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            sv.setNgaySinh(datechNgaySinh.getDate());
            sv.setEmail(tfEmail.getText());
            if (tfSDT.getText().equals("") == true) {
                sv.setSdt(tfSDT.getText());
            }
            else if (tfSDT.getText().charAt(0) != '0' || tfSDT.getText().matches("\\d{10,11}") == false) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            } 
            else {
                sv.setSdt(tfSDT.getText());
            }
            
            try {
                String maLopItem = LoadDatabase.selectMalop((String)cmbLop.getSelectedItem());
                if (maLopItem != null) {
                    sv.setMaLop(maLopItem);
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "Mã lớp không tồn tại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
            sv.setNamNhapHoc(Integer.parseInt("20".concat(sv.getMaSV().substring(1, 3))));
            tfNamNhapHoc.setText(String.valueOf(sv.getNamNhapHoc()));
            if (tfNamNhapHoc.getText().compareTo("2023") < 0) {
                JOptionPane.showMessageDialog(rootPane, "Không thể thêm sinh viên vào khóa cũ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            sv.setTrangThai(String.valueOf(cmbTrangThai.getSelectedItem()));
            return sv;
        } catch (ParseException ex) {
            Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void deleteSinhVien() {
        int index = tbSVTheoLop.getSelectedRow();
        String maSVItem = (String) tbSVTheoLop.getValueAt(index, 1);
        int confirm = JOptionPane.showConfirmDialog(null, "Xác nhận xóa sinh viên?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Controller.DeleteData.deleteSinhVien(maSVItem);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public SinhVien updateSinhVien() {
        int index = tbSVTheoLop.getSelectedRow();
        SinhVien sv = controller.arrayListSinhVien.get(index);
        if (!tfMaSV.getText().equals(sv.getMaSV())) {
            JOptionPane.showMessageDialog(null, "Không được chỉnh sửa mã sinh viên!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfMaSV.setText(sv.getMaSV());
            return null;
        }
        
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
            return null;
        }
        sv.setEmail(tfEmail.getText());
        if (tfSDT.getText().equals("") == true) {
            sv.setSdt(tfSDT.getText());
        }
        else if (tfSDT.getText().charAt(0) != '0' || tfSDT.getText().matches("\\d{10,11}") == false) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        } 
        else {
            sv.setSdt(tfSDT.getText());
        }
        try {
            String maLopItem = LoadDatabase.selectMalop((String)cmbLop.getSelectedItem());
            if (maLopItem != null) {
                sv.setMaLop(maLopItem);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Mã lớp không tồn tại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        sv.setNamNhapHoc(Integer.parseInt("20".concat(sv.getMaSV().substring(1, 3))));
        sv.setTrangThai(String.valueOf(cmbTrangThai.getSelectedItem()));
        return sv;
    }
    
    public static void addBangDiemHocKy(SinhVien sv) {
        try {
            BangDiemHocKy bdhk = new BangDiemHocKy(null, sv.getMaSV(), "01_2023-2024", 0.0f, "Yếu");
            Controller.InsertData.insertBangDiemHocKy(bdhk);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachSinhVienTheoLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachSinhVienTheoLopHoc ctdt = new DanhSachSinhVienTheoLopHoc();
                ctdt.setVisible(true);
                ctdt.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNhapMoi;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JCheckBox cbNam;
    private javax.swing.JCheckBox cbNu;
    private javax.swing.JComboBox<String> cmbKhoa;
    private javax.swing.JComboBox<String> cmbLop;
    private javax.swing.JComboBox<String> cmbNganh;
    private javax.swing.JComboBox<String> cmbTrangThai;
    private com.toedter.calendar.JDateChooser datechNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbPhanLoai;
    private javax.swing.JLabel lbTenMH;
    private javax.swing.JLabel lbTenMH1;
    private javax.swing.JLabel lbTenMH2;
    private javax.swing.JLabel lbTenMH3;
    private javax.swing.JLabel lbTenMH4;
    private javax.swing.JLabel lbTenMH5;
    private javax.swing.JTable tbSVTheoLop;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaSV;
    private javax.swing.JTextField tfNamNhapHoc;
    private javax.swing.JTextField tfSDT;
    // End of variables declaration//GEN-END:variables
}
