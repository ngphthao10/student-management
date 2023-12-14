package View;

import Controller.LoadDatabase;
import Model.LopTinChi;
import Model.PhanCong;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PhanCongGiangDay extends javax.swing.JFrame {

    private DefaultTableModel myTable, ltcTable;

    public PhanCongGiangDay() {
        initComponents();
        tbPhanCong.setRowHeight(20);
        tbLopTinChi.setRowHeight(20);
        lbSetName.setText(Controller.controller.taiKhoan.getMaTK() + " - " + Controller.controller.taiKhoan.getTenNguoiDung());
        myTable = (DefaultTableModel) tbPhanCong.getModel();
        myTable.setRowCount(0);
        ltcTable = (DefaultTableModel) tbLopTinChi.getModel();
        ltcTable.setRowCount(0);

        this.PhanQuyen();
        cbbGV.setSelectedItem(null);
        LoadDatabase.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
        LoadDatabase.fillComboBox(cbbHK, "maHK", "LOPTINCHI");
        LoadDatabase.fillTenMonHocComboBox(cbbMH);
        LoadDatabase.fillComboBox(cbbML, "maLop", "LOPTINCHI");
        LoadDatabase.fillTrangThaiComboBox(cbbTrangThai);
        showDataTableLTC();
        tfMaHK.setEditable(false);
        tfMonHoc.setEditable(false);
        tfMaLop.setEditable(false);
        btSua.setEnabled(false);
        btLuu.setEnabled(false);
        btXoa.setEnabled(false);
        btThem.setEnabled(false);
    }

    public void PhanQuyen() {
        if (Controller.controller.taiKhoan.getMaNDN().equals("GV")) {
            btThem.setEnabled(false);
            btSua.setEnabled(false);
            btXoa.setEnabled(false);
            btLuu.setEnabled(false);
        }
    }

    public void showDataTableLTC() {
        LoadDatabase.loadTableLopTinChi();
        LoadDatabase.loadTablePhanCong();
        ltcTable.setRowCount(0);
        int dem = 0;

        for (LopTinChi ltc : Controller.controller.arrayListLopTinChi) {
            dem++;
            if (!ltc.isHuyLop()) {
                boolean daPhanCong = false;

                for (PhanCong pc : Controller.controller.arrayListPhanCong) {
                    if (pc.getMaGV() != null && (pc.getMaLTC() == ltc.getMaLopTC())) {
                        daPhanCong = true;
                        break;
                    }
                }
                if (!daPhanCong) {
                    try {
                        ltcTable.addRow(new Object[]{dem, ltc.getMaLopTC(), LoadDatabase.getTenMH(ltc.getMaMH()), ltc.getMaHK(), ltc.getMaLop(), ltc.getNhom(), ltc.getSvMin(), ltc.getSvMax()});
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PhanCongGiangDay.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public void showTableByMaLop() {
        LoadDatabase.filterTablePhanCongBySth(cbbML, "maLop");
        myTable.setRowCount(0);
        int dem = 0;
        for (PhanCong pc : Controller.controller.arrayListPhanCong) {
            dem++;
            myTable.addRow(new Object[]{dem, pc.getMaLTC(), pc.getMaHKLtc(), pc.getTenMH(), pc.getMaLopLtc(), pc.getNhomLtc(), pc.getMaGV(), pc.getHoTenGV(), pc.isHuyLopLtc()});
        }
    }

    public void showTableByHocKy() {
        LoadDatabase.filterTablePhanCongBySth(cbbHK, "maHK");
        myTable.setRowCount(0);
        int dem = 0;
        for (PhanCong pc : Controller.controller.arrayListPhanCong) {
            dem++;
            myTable.addRow(new Object[]{dem, pc.getMaLTC(), pc.getMaHKLtc(), pc.getTenMH(), pc.getMaLopLtc(), pc.getNhomLtc(), pc.getMaGV(), pc.getHoTenGV(), pc.isHuyLopLtc()});
        }
    }

    public void showTableByMonHoc() {
        LoadDatabase.filterTablePhanCongBySth(cbbMH, "tenMH");
        myTable.setRowCount(0);
        int dem = 0;
        for (PhanCong pc : Controller.controller.arrayListPhanCong) {
            dem++;
            myTable.addRow(new Object[]{dem, pc.getMaLTC(), pc.getMaHKLtc(), pc.getTenMH(), pc.getMaLopLtc(), pc.getNhomLtc(), pc.getMaGV(), pc.getHoTenGV(), pc.isHuyLopLtc()});
        }
    }

    public void showDataTable() {
        LoadDatabase.filterAndDisplayTablePhanCong(cbbKhoa, cbbTrangThai);
        myTable.setRowCount(0);
        int dem = 0;
        for (PhanCong pc : Controller.controller.arrayListPhanCong) {
            dem++;
            myTable.addRow(new Object[]{dem, pc.getMaLTC(), pc.getMaHKLtc(), pc.getTenMH(), pc.getMaLopLtc(), pc.getNhomLtc(), pc.getMaGV(), pc.getHoTenGV(), pc.isHuyLopLtc()});
        }
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
        btOut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbbKhoa = new javax.swing.JComboBox<>();
        lbMaMH1 = new javax.swing.JLabel();
        lbMaMH2 = new javax.swing.JLabel();
        cbbTrangThai = new javax.swing.JComboBox<>();
        btXem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhanCong = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLopTinChi = new javax.swing.JTable();
        lbMaMH5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbMaMH3 = new javax.swing.JLabel();
        lbstcth = new javax.swing.JLabel();
        lbstcth1 = new javax.swing.JLabel();
        lbstcth2 = new javax.swing.JLabel();
        lbstcth3 = new javax.swing.JLabel();
        cbbGV = new javax.swing.JComboBox<>();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        tfMaHK = new javax.swing.JTextField();
        tfMonHoc = new javax.swing.JTextField();
        tfMaLop = new javax.swing.JTextField();
        lbstcth10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbMaMH4 = new javax.swing.JLabel();
        lbstcth4 = new javax.swing.JLabel();
        cbbML = new javax.swing.JComboBox<>();
        btLocML = new javax.swing.JButton();
        lbstcth5 = new javax.swing.JLabel();
        cbbHK = new javax.swing.JComboBox<>();
        btLocHK = new javax.swing.JButton();
        cbbMH = new javax.swing.JComboBox<>();
        btLocMH = new javax.swing.JButton();
        lbstcth6 = new javax.swing.JLabel();
        lbstcth7 = new javax.swing.JLabel();
        lbstcth8 = new javax.swing.JLabel();
        lbstcth9 = new javax.swing.JLabel();
        btReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 38, 131, 24));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Phân công giảng dạy");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 351, 49));

        lbSetName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetName.setText("XX1 - Ten người dùng");
        jPanel1.add(lbSetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1211, 20, 310, -1));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 6, 6, 64));

        btOut.setBackground(new java.awt.Color(209, 232, 195));
        btOut.setBorder(null);
        btOut.setBorderPainted(false);
        btOut.setFocusPainted(false);
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });
        jPanel1.add(btOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 76));

        jButton1.setBackground(new java.awt.Color(209, 232, 195));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\src\\main\\java\\Image\\icons8-cat-64.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        cbbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbKhoa.setToolTipText("");

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH1.setText("Khoa");

        lbMaMH2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH2.setText("Trạng thái");

        cbbTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btXem.setBackground(new java.awt.Color(76, 124, 97));
        btXem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXem.setForeground(new java.awt.Color(255, 255, 255));
        btXem.setText("Xem danh sách");
        btXem.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        tbPhanCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã LTC", "Mã học kỳ", "Tên môn học", "Mã lớp", "Nhóm", "Mã giảng viên", "Tên giảng viên", "Hủy lớp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhanCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhanCongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhanCong);
        if (tbPhanCong.getColumnModel().getColumnCount() > 0) {
            tbPhanCong.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbPhanCong.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbPhanCong.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbPhanCong.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbPhanCong.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbPhanCong.getColumnModel().getColumn(5).setPreferredWidth(15);
            tbPhanCong.getColumnModel().getColumn(6).setPreferredWidth(40);
            tbPhanCong.getColumnModel().getColumn(7).setPreferredWidth(100);
            tbPhanCong.getColumnModel().getColumn(8).setPreferredWidth(30);
        }

        tbLopTinChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã LTC", "Tên môn học", "Mã học kỳ", "Mã lớp", "nhóm", "SV Min", "SV Max"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLopTinChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLopTinChiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLopTinChi);
        if (tbLopTinChi.getColumnModel().getColumnCount() > 0) {
            tbLopTinChi.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbLopTinChi.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbLopTinChi.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbLopTinChi.getColumnModel().getColumn(3).setPreferredWidth(70);
            tbLopTinChi.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbLopTinChi.getColumnModel().getColumn(5).setPreferredWidth(30);
            tbLopTinChi.getColumnModel().getColumn(6).setPreferredWidth(30);
            tbLopTinChi.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        lbMaMH5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH5.setText("DANH SÁCH LỚP TÍN CHỈ CHƯA PHÂN CÔNG ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMaMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMaMH5)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaMH1)
                    .addComponent(lbMaMH2)
                    .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMaMH5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbMaMH3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMaMH3.setText("Phân công giảng dạy");

        lbstcth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth.setText("Mã học kỳ");

        lbstcth1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth1.setText("Môn học");

        lbstcth2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth2.setText("Mã lớp");

        lbstcth3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth3.setText("Giảng viên");

        cbbGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbGV.setToolTipText("");

        btThem.setBackground(new java.awt.Color(76, 124, 97));
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("Thêm mới");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(76, 124, 97));
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(76, 124, 97));
        btSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btLuu.setBackground(new java.awt.Color(76, 124, 97));
        btLuu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLuu.setForeground(new java.awt.Color(255, 255, 255));
        btLuu.setText("Lưu chỉnh sửa");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        tfMaHK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfMonHoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfMaLop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstcth10.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbstcth10.setForeground(new java.awt.Color(0, 102, 102));
        lbstcth10.setText("Note: Click chuột vào Danh sách lớp tín chỉ đã được mở để phân công");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXoa)
                .addGap(99, 99, 99)
                .addComponent(btSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLuu)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbstcth1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(tfMonHoc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbstcth, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbstcth2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbstcth3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMaHK)
                            .addComponent(cbbGV, 0, 347, Short.MAX_VALUE)
                            .addComponent(tfMaLop))))
                .addGap(76, 76, 76))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbMaMH3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbstcth10)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaMH3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth)
                    .addComponent(tfMaHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth1)
                    .addComponent(tfMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth2)
                    .addComponent(tfMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth3)
                    .addComponent(cbbGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu))
                .addGap(18, 18, 18)
                .addComponent(lbstcth10)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        lbMaMH4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMaMH4.setForeground(new java.awt.Color(255, 255, 255));
        lbMaMH4.setText("Bộ lọc thông tin ");

        lbstcth4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbstcth4.setForeground(new java.awt.Color(255, 255, 255));
        lbstcth4.setText("Mã lớp");

        cbbML.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbML.setToolTipText("");

        btLocML.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLocML.setText("Lọc");
        btLocML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocMLActionPerformed(evt);
            }
        });

        lbstcth5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbstcth5.setForeground(new java.awt.Color(255, 255, 255));
        lbstcth5.setText("Mã học kỳ");

        cbbHK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbHK.setToolTipText("");

        btLocHK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLocHK.setText("Lọc");
        btLocHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocHKActionPerformed(evt);
            }
        });

        cbbMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbMH.setToolTipText("");

        btLocMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLocMH.setText("Lọc");
        btLocMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocMHActionPerformed(evt);
            }
        });

        lbstcth6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbstcth6.setForeground(new java.awt.Color(255, 255, 255));
        lbstcth6.setText("Tên môn học");

        lbstcth7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbstcth7.setForeground(new java.awt.Color(204, 204, 255));
        lbstcth7.setText("Note: Lọc ra danh sách phân công của một lớp");

        lbstcth8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbstcth8.setForeground(new java.awt.Color(204, 204, 255));
        lbstcth8.setText("Note: Lọc ra danh sách phân công của một học kỳ");

        lbstcth9.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbstcth9.setForeground(new java.awt.Color(204, 204, 255));
        lbstcth9.setText("Note: Lọc ra danh sách phân công của một môn học");

        btReset.setBackground(new java.awt.Color(76, 124, 97));
        btReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btReset.setForeground(new java.awt.Color(255, 255, 255));
        btReset.setText("Trở lại");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMaMH4)
                .addGap(119, 119, 119)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbstcth9)
                    .addComponent(lbstcth7)
                    .addComponent(lbstcth8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbstcth6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbstcth5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(cbbMH, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btLocMH))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(cbbHK, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btLocHK))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lbstcth4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbML, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btLocML))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btReset)
                    .addComponent(lbMaMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btLocML)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbstcth4)
                        .addComponent(cbbML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbstcth7)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth5)
                    .addComponent(cbbHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocHK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbstcth8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth6)
                    .addComponent(cbbMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocMH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbstcth9)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        this.showDataTable();
        btThem.setEnabled(true);
        this.PhanQuyen();
    }//GEN-LAST:event_btXemActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        try {
            System.out.println(tbLopTinChi.getSelectedRow());
            if (tbLopTinChi.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn LTC cần phân công!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                String maHK = (String) tbLopTinChi.getValueAt(tbLopTinChi.getSelectedRow(), 3);
                Year currentYear = Year.now();
                String year = maHK.substring(3, 7);
                if (Integer.parseInt(year) < currentYear.getValue()) {
                    JOptionPane.showMessageDialog(null, "Không phân công cho lớp tín chỉ đã qua!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cbbGV.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Vui lòng phân công giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int maLTC = LoadDatabase.getMaLTC(tfMaHK.getText(), tfMonHoc.getText(), tfMaLop.getText(),
                        (Integer) tbLopTinChi.getValueAt(tbLopTinChi.getSelectedRow(), 5));
                if (maLTC == -1) {
                    JOptionPane.showMessageDialog(null, "Lớp tín chỉ không tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                }
                String maGV = LoadDatabase.getMaGV(cbbGV);
                PhanCong pc = new PhanCong(maGV, maLTC);
                Controller.InsertData.insertPhanCong(pc);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
        }

        tbPhanCong.getSelectionModel().setSelectionInterval(tbPhanCong.getRowCount() - 1, tbPhanCong.getRowCount() - 1);

        this.showDataTable();
        this.showDataTableLTC();
        this.PhanQuyen();
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (tbPhanCong.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phân công!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            String maHK = (String) tbPhanCong.getValueAt(tbPhanCong.getSelectedRow(), 2);
            Year currentYear = Year.now();
            String year = maHK.substring(3, 7);
            if (Integer.parseInt(year) < currentYear.getValue()) {
                JOptionPane.showMessageDialog(null, "Không xóa phân công của lớp tín chỉ đã qua!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Xác nhận xóa phân công?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    try {
                        Controller.DeleteData.deletePhanCong((Integer) tbPhanCong.getValueAt(tbPhanCong.getSelectedRow(), 1),
                                tbPhanCong.getValueAt(tbPhanCong.getSelectedRow(), 6).toString());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PhanCongGiangDay.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    showDataTable();
                }
            }
        }
        tfMaHK.setText("");
        tfMonHoc.setText("");
        tfMaLop.setText("");
        cbbGV.setSelectedItem(null);
        showDataTable();

        this.showDataTableLTC();
        this.PhanQuyen();
    }//GEN-LAST:event_btXoaActionPerformed

    private void tbPhanCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhanCongMouseClicked
        LoadDatabase.fillTenGiangVienComboBox(cbbGV);
        int index = tbPhanCong.getSelectedRow();
        tfMaHK.setText((String) tbPhanCong.getValueAt(index, 2));
        tfMonHoc.setText((String) tbPhanCong.getValueAt(index, 3));
        tfMaLop.setText((String) tbPhanCong.getValueAt(index, 4));
        cbbGV.setSelectedItem((String) tbPhanCong.getValueAt(index, 6) + "-" + (String) tbPhanCong.getValueAt(index, 7));
        btXoa.setEnabled(true);
        btSua.setEnabled(true);
        this.PhanQuyen();
    }//GEN-LAST:event_tbPhanCongMouseClicked

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        btLuu.setEnabled(true);
        this.PhanQuyen();
    }//GEN-LAST:event_btSuaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        try {
            if (tbPhanCong.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn LTC cần lưu!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                String maHK = (String) tbPhanCong.getValueAt(tbPhanCong.getSelectedRow(), 2);
                Year currentYear = Year.now();
                String year = maHK.substring(3, 7);
                if (Integer.parseInt(year) < currentYear.getValue()) {
                    JOptionPane.showMessageDialog(null, "Không sửa phân công cho lớp tín chỉ đã qua!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cbbGV.getSelectedItem().equals(null)) {
                    JOptionPane.showMessageDialog(null, "Vui lòng phân công giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int maLTC = (Integer) tbPhanCong.getValueAt(tbPhanCong.getSelectedRow(), 1);
                String maGV = LoadDatabase.getMaGV(cbbGV);
                PhanCong pc = new PhanCong(maGV, maLTC);
                Controller.UpdateData.updatePhanCong(pc);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
        }

        tbPhanCong.getSelectionModel().setSelectionInterval(tbPhanCong.getRowCount() - 1, tbPhanCong.getRowCount() - 1);
        this.showDataTableLTC();
        showDataTable();
        this.PhanQuyen();
    }//GEN-LAST:event_btLuuActionPerformed

    private void btLocMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocMLActionPerformed
        this.showTableByMaLop();
        cbbKhoa.setSelectedItem(null);
        cbbKhoa.setEnabled(false);
        cbbTrangThai.setEnabled(false);
        btXem.setEnabled(false);
    }//GEN-LAST:event_btLocMLActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        myTable.setRowCount(0);
        cbbKhoa.setSelectedItem("Cơ bản 2");
        cbbKhoa.setEnabled(true);
        cbbTrangThai.setEnabled(true);
        btXem.setEnabled(true);
    }//GEN-LAST:event_btResetActionPerformed

    private void btLocHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocHKActionPerformed
        this.showTableByHocKy();
        cbbKhoa.setSelectedItem(null);
        cbbKhoa.setEnabled(false);
        cbbTrangThai.setEnabled(false);
        btXem.setEnabled(false);
    }//GEN-LAST:event_btLocHKActionPerformed

    private void btLocMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocMHActionPerformed
        this.showTableByMonHoc();
        cbbKhoa.setSelectedItem(null);
        cbbKhoa.setEnabled(false);
        cbbTrangThai.setEnabled(false);
        btXem.setEnabled(false);
    }//GEN-LAST:event_btLocMHActionPerformed

    private void tbLopTinChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLopTinChiMouseClicked
        LoadDatabase.fillTenGiangVienComboBox(cbbGV);
        btThem.setEnabled(true);
        int index = tbLopTinChi.getSelectedRow();
        tfMaHK.setText((String) tbLopTinChi.getValueAt(index, 3));
        tfMonHoc.setText((String) tbLopTinChi.getValueAt(index, 2));
        tfMaLop.setText((String) tbLopTinChi.getValueAt(index, 4));
        cbbGV.setSelectedItem(null);
        this.PhanQuyen();
    }//GEN-LAST:event_tbLopTinChiMouseClicked

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PhanCongGiangDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhanCongGiangDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhanCongGiangDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhanCongGiangDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PhanCongGiangDay pcgd = new PhanCongGiangDay();
                pcgd.setVisible(true);
                pcgd.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLocHK;
    private javax.swing.JButton btLocMH;
    private javax.swing.JButton btLocML;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbGV;
    private javax.swing.JComboBox<String> cbbHK;
    private javax.swing.JComboBox<String> cbbKhoa;
    private javax.swing.JComboBox<String> cbbMH;
    private javax.swing.JComboBox<String> cbbML;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbMaMH2;
    private javax.swing.JLabel lbMaMH3;
    private javax.swing.JLabel lbMaMH4;
    private javax.swing.JLabel lbMaMH5;
    private javax.swing.JLabel lbSetName;
    private javax.swing.JLabel lbstcth;
    private javax.swing.JLabel lbstcth1;
    private javax.swing.JLabel lbstcth10;
    private javax.swing.JLabel lbstcth2;
    private javax.swing.JLabel lbstcth3;
    private javax.swing.JLabel lbstcth4;
    private javax.swing.JLabel lbstcth5;
    private javax.swing.JLabel lbstcth6;
    private javax.swing.JLabel lbstcth7;
    private javax.swing.JLabel lbstcth8;
    private javax.swing.JLabel lbstcth9;
    private javax.swing.JTable tbLopTinChi;
    private javax.swing.JTable tbPhanCong;
    private javax.swing.JTextField tfMaHK;
    private javax.swing.JTextField tfMaLop;
    private javax.swing.JTextField tfMonHoc;
    // End of variables declaration//GEN-END:variables
}
