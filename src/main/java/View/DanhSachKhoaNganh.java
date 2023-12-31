package View;

import Controller.LoadDatabase;
import static Controller.controller.arrayListKhoa;
import static Controller.controller.arrayListNganh;
import Model.Khoa;
import Model.Nganh;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DanhSachKhoaNganh extends javax.swing.JFrame {

    private DefaultTableModel khoaTable, nganhTable;

    public DanhSachKhoaNganh() {
        initComponents();
        lbSetName.setText(Controller.controller.taiKhoan.getMaTK() + " - " + Controller.controller.taiKhoan.getTenNguoiDung());
        khoaTable = (DefaultTableModel) tbKhoa.getModel();
        nganhTable = (DefaultTableModel) tbNganh.getModel();
        khoaTable.setRowCount(0);
        nganhTable.setRowCount(0);
        tbKhoa.setRowHeight(20);
        tbNganh.setRowHeight(20);
        LoadDatabase.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
        LoadDatabase.fillTenGiangVienComboBox(cbbGV);
        cbbGV.setSelectedItem(null);
        if (Controller.controller.taiKhoan.getMaNDN().equals("SV") || Controller.controller.taiKhoan.getMaNDN().equals("GV")) {
            btThemKhoa.setEnabled(false);
            btSuaKhoa.setEnabled(false);
            btXoaKhoa.setEnabled(false);
            btNhapMoiKhoa.setEnabled(false);
            btThemNganh.setEnabled(false);
            btSuaNganh.setEnabled(false);
            btXoaNganh.setEnabled(false);
            btNhapMoiNganh.setEnabled(false);
        }
        showDataKhoa();
    }

    public void showDataKhoa() {
        khoaTable.setRowCount(0);
        LoadDatabase.loadTableKhoa();
        int dem = 0;
        for (Khoa khoa : Controller.controller.arrayListKhoa) {
            dem++;
            khoaTable.addRow(new Object[]{dem, khoa.getMaKhoa(), khoa.getTenKhoa(), khoa.getSdt(), khoa.getTrgKhoa(), khoa.getNgayNhanChuc()});
        }
    }

    public void showDataNganh() throws ClassNotFoundException {
        nganhTable.setRowCount(0);
        LoadDatabase.filterAndDisplayTableNganh(cbbKhoa);
        int dem = 0;
        for (Nganh nganh : Controller.controller.arrayListNganh) {
            dem++;
            nganhTable.addRow(new Object[]{dem, nganh.getMaNganh(), nganh.getTenNganh(), nganh.getKhoa()});
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
        btOut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelKhoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoa = new javax.swing.JTable();
        lbMaMH3 = new javax.swing.JLabel();
        tfMaKhoa = new javax.swing.JTextField();
        lbTenMH1 = new javax.swing.JLabel();
        tfTenKhoa = new javax.swing.JTextField();
        lbTenMH2 = new javax.swing.JLabel();
        lbstclt1 = new javax.swing.JLabel();
        lbstcth1 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        btThemKhoa = new javax.swing.JButton();
        btXoaKhoa = new javax.swing.JButton();
        btSuaKhoa = new javax.swing.JButton();
        btNhapMoiKhoa = new javax.swing.JButton();
        tfNgayNhanChuc = new com.toedter.calendar.JDateChooser();
        cbbGV = new javax.swing.JComboBox<>();
        lbMaMH4 = new javax.swing.JLabel();
        panelNganh = new javax.swing.JPanel();
        lbMaMH = new javax.swing.JLabel();
        tfMaNganh = new javax.swing.JTextField();
        lbTenMH = new javax.swing.JLabel();
        tfTenNganh = new javax.swing.JTextField();
        btThemNganh = new javax.swing.JButton();
        btSuaNganh = new javax.swing.JButton();
        btXoaNganh = new javax.swing.JButton();
        btNhapMoiNganh = new javax.swing.JButton();
        lbMaMH1 = new javax.swing.JLabel();
        cbbKhoa = new javax.swing.JComboBox<>();
        btTimKiem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNganh = new javax.swing.JTable();
        lbMaMH5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Danh sách khoa, ngành");

        lbSetName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetName.setText("XX - Ten người dùng");

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSetName, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSetName)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        panelKhoa.setBackground(new java.awt.Color(204, 204, 204));
        panelKhoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelKhoa.setPreferredSize(new java.awt.Dimension(1069, 700));

        tbKhoa.setBorder(new javax.swing.border.MatteBorder(null));
        tbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khoa", "Tên khoa", "SĐT", "Trưởng khoa", "Ngày nhận chức"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhoa);
        if (tbKhoa.getColumnModel().getColumnCount() > 0) {
            tbKhoa.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbKhoa.getColumnModel().getColumn(1).setPreferredWidth(70);
            tbKhoa.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbKhoa.getColumnModel().getColumn(3).setPreferredWidth(70);
            tbKhoa.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        lbMaMH3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH3.setText("Mã khoa");

        tfMaKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH1.setText("Tên khoa");

        tfTenKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH2.setText("Trưởng khoa");

        lbstclt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt1.setText("Ngày nhận chức");

        lbstcth1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth1.setText("Số điện thoại");

        tfSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btThemKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btThemKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThemKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btThemKhoa.setText("THÊM");
        btThemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemKhoaActionPerformed(evt);
            }
        });

        btXoaKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btXoaKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoaKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoaKhoa.setText("XÓA");
        btXoaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaKhoaActionPerformed(evt);
            }
        });

        btSuaKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btSuaKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuaKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btSuaKhoa.setText("SỬA");
        btSuaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaKhoaActionPerformed(evt);
            }
        });

        btNhapMoiKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoiKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoiKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoiKhoa.setText("NHẬP MỚI");
        btNhapMoiKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapMoiKhoaActionPerformed(evt);
            }
        });

        tfNgayNhanChuc.setDateFormatString("dd/MM/yyyy");
        tfNgayNhanChuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbbGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbGV.setToolTipText("");

        lbMaMH4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbMaMH4.setText("Thông tin khoa");

        javax.swing.GroupLayout panelKhoaLayout = new javax.swing.GroupLayout(panelKhoa);
        panelKhoa.setLayout(panelKhoaLayout);
        panelKhoaLayout.setHorizontalGroup(
            panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhoaLayout.createSequentialGroup()
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaMH3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTenMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTenMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMaKhoa)
                            .addComponent(tfTenKhoa)
                            .addComponent(cbbGV, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelKhoaLayout.createSequentialGroup()
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKhoaLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbstcth1))
                            .addGroup(panelKhoaLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btThemKhoa)))
                        .addGap(18, 18, 18)
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhoaLayout.createSequentialGroup()
                                .addComponent(btXoaKhoa)
                                .addGap(34, 34, 34)))
                        .addGap(44, 44, 44)
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbstclt1)
                            .addComponent(btSuaKhoa))
                        .addGap(18, 18, 18)
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNgayNhanChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNhapMoiKhoa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhoaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhoaLayout.createSequentialGroup()
                        .addComponent(lbMaMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhoaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        panelKhoaLayout.setVerticalGroup(
            panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbMaMH4)
                .addGap(18, 18, 18)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaMH3)
                    .addComponent(tfMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMH1)
                    .addComponent(tfTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMH2)
                    .addComponent(cbbGV))
                .addGap(18, 18, 18)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNgayNhanChuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbstcth1)
                        .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbstclt1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btThemKhoa)
                        .addComponent(btXoaKhoa))
                    .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNhapMoiKhoa)
                        .addComponent(btSuaKhoa)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        panelNganh.setBackground(new java.awt.Color(204, 204, 204));

        lbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH.setText("Mã ngành");

        tfMaNganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH.setText("Tên ngành");

        tfTenNganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btThemNganh.setBackground(new java.awt.Color(76, 124, 97));
        btThemNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThemNganh.setForeground(new java.awt.Color(255, 255, 255));
        btThemNganh.setText("THÊM");
        btThemNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemNganhActionPerformed(evt);
            }
        });

        btSuaNganh.setBackground(new java.awt.Color(76, 124, 97));
        btSuaNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuaNganh.setForeground(new java.awt.Color(255, 255, 255));
        btSuaNganh.setText("SỬA");
        btSuaNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaNganhActionPerformed(evt);
            }
        });

        btXoaNganh.setBackground(new java.awt.Color(76, 124, 97));
        btXoaNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoaNganh.setForeground(new java.awt.Color(255, 255, 255));
        btXoaNganh.setText("XÓA");
        btXoaNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaNganhActionPerformed(evt);
            }
        });

        btNhapMoiNganh.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoiNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoiNganh.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoiNganh.setText("NHẬP MỚI");
        btNhapMoiNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapMoiNganhActionPerformed(evt);
            }
        });

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH1.setText("Khoa");

        cbbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbKhoa.setToolTipText("");

        btTimKiem.setBackground(new java.awt.Color(76, 124, 97));
        btTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        tbNganh.setBorder(new javax.swing.border.MatteBorder(null));
        tbNganh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbNganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã ngành", "Tên ngành", "Mã khoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNganhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbNganh);
        if (tbNganh.getColumnModel().getColumnCount() > 0) {
            tbNganh.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbNganh.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbNganh.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbNganh.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        lbMaMH5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbMaMH5.setText("Thông tin ngành");

        javax.swing.GroupLayout panelNganhLayout = new javax.swing.GroupLayout(panelNganh);
        panelNganh.setLayout(panelNganhLayout);
        panelNganhLayout.setHorizontalGroup(
            panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNganhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelNganhLayout.createSequentialGroup()
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTenNganh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMaNganh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNganhLayout.createSequentialGroup()
                                        .addComponent(btThemNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btXoaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelNganhLayout.createSequentialGroup()
                                        .addComponent(btSuaNganh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btNhapMoiNganh))))
                            .addGroup(panelNganhLayout.createSequentialGroup()
                                .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNganhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMaMH5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        panelNganhLayout.setVerticalGroup(
            panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNganhLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbMaMH5)
                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbKhoa)
                            .addComponent(lbMaMH1)
                            .addComponent(btTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaMH)
                            .addComponent(tfMaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThemNganh)
                            .addComponent(btXoaNganh))
                        .addGap(21, 21, 21)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenMH)
                            .addComponent(tfTenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSuaNganh)
                            .addComponent(btNhapMoiNganh))
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addComponent(panelNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhoaMouseClicked
        try {                                    
            int index = tbKhoa.getSelectedRow();
            Khoa khoa = arrayListKhoa.get(index);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateNS = khoa.getNgayNhanChuc().toString();
            tfMaKhoa.setText(khoa.getMaKhoa());
            tfTenKhoa.setText(khoa.getTenKhoa());
            String tenGV = LoadDatabase.getTenGVfromMaGV(khoa.getTrgKhoa());
            String trKhoa = khoa.getTrgKhoa() + "-" + tenGV;
            cbbGV.setSelectedItem(trKhoa);
            tfSDT.setText(khoa.getSdt());
            dateNS = dateNS.substring(8, 10) + "/" + dateNS.substring(5, 7) + "/" + dateNS.substring(0, 4);
            java.util.Date datetmp;
            try {
                datetmp = new SimpleDateFormat("dd/MM/yyyy").parse(dateNS);
                tfNgayNhanChuc.setDate(datetmp);
            } catch (ParseException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbKhoaMouseClicked

    private void btNhapMoiKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiKhoaActionPerformed
        tfMaKhoa.setText("");
        tfTenKhoa.setText("");
        cbbGV.setSelectedItem(null);
        tfSDT.setText("");
        tfNgayNhanChuc.setDate(null);
    }//GEN-LAST:event_btNhapMoiKhoaActionPerformed

    private void btThemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemKhoaActionPerformed
        if (tfSDT.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Thông tin về số điện thoại không hợp lệ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            for (int i = 0; i < tfSDT.getText().length(); i++) {
                if (Character.isDigit(tfSDT.getText().charAt(i))) {
                    continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Thông tin về số điện thoại không hợp lệ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
        }
        if (tfMaKhoa.getText().equals("") || tfTenKhoa.getText().equals("") || tfSDT.getText().equals("") || tfNgayNhanChuc.getDate().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin khoa!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int row = tbKhoa.getSelectedRow();
                String trKhoa = (String) cbbGV.getSelectedItem();
                String maGV = trKhoa.substring(0, 6);
                Khoa khoa = new Khoa(tfMaKhoa.getText(), tfTenKhoa.getText(), tfSDT.getText(), maGV, tfNgayNhanChuc.getDate());
              
                for (Khoa kh : Controller.controller.arrayListKhoa) {
                    if (kh.getTenKhoa().equals(tfTenKhoa.getText())) {
                        JOptionPane.showMessageDialog(null, "Tên khoa đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                Controller.InsertData.insertKhoa(khoa);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
            }

            tbKhoa.getSelectionModel().setSelectionInterval(tbKhoa.getRowCount() - 1, tbKhoa.getRowCount() - 1);
        }
        tfMaKhoa.setText("");
        tfTenKhoa.setText("");
        cbbGV.setSelectedItem(null);
        tfSDT.setText("");
        tfNgayNhanChuc.setDate(null);

        Controller.controller.arrayListKhoa.clear();
        showDataKhoa();
        cbbKhoa.removeAllItems();
        LoadDatabase.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
    }//GEN-LAST:event_btThemKhoaActionPerformed

    private void btXoaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaKhoaActionPerformed
        if (tbKhoa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn môn học!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Xác nhận xóa khoa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                try {
                    Controller.DeleteData.deleteKhoa((String) tbKhoa.getValueAt(tbKhoa.getSelectedRow(), 1));
                    Controller.controller.arrayListKhoa.clear();
                    showDataKhoa();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        tfMaKhoa.setText("");
        tfTenKhoa.setText("");
        cbbGV.setSelectedItem(null);
        tfSDT.setText("");
        tfNgayNhanChuc.setDate(null);
        Controller.controller.arrayListKhoa.clear();
        showDataKhoa();
        cbbKhoa.removeAllItems();
        LoadDatabase.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
    }//GEN-LAST:event_btXoaKhoaActionPerformed

    private void btSuaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaKhoaActionPerformed
        if (tfSDT.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Thông tin về số điện thoại không hợp lệ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            for (int i = 0; i < tfSDT.getText().length(); i++) {
                if (Character.isDigit(tfSDT.getText().charAt(i))) {
                    continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Thông tin về số điện thoại không hợp lệ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
        }

        if (tfMaKhoa.getText().equals("") || tfTenKhoa.getText().equals("") || tfSDT.getText().equals("") || tfNgayNhanChuc.getDate().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin khoa!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int row = tbKhoa.getSelectedRow();
                String maKhoa = (String) tbKhoa.getValueAt(tbKhoa.getSelectedRow(), 1);
                String trKhoa = (String) cbbGV.getSelectedItem();
                String maGV = trKhoa.substring(0, 6);
                Khoa khoa = new Khoa(tfMaKhoa.getText(), tfTenKhoa.getText(), tfSDT.getText(), maGV, tfNgayNhanChuc.getDate());
                if(!tfMaKhoa.getText().equals(maKhoa)){
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khoa!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    tfMaKhoa.setText(maKhoa);
                    return;
                }
                for (Khoa kh : Controller.controller.arrayListKhoa) {
                    if (!kh.getMaKhoa().equalsIgnoreCase(maKhoa) && kh.getTenKhoa().equalsIgnoreCase(khoa.getTenKhoa())) {
                        JOptionPane.showMessageDialog(null, "Tên khoa đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                Controller.UpdateData.updateKhoa(khoa, maKhoa);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
            }

            tbKhoa.getSelectionModel().setSelectionInterval(tbKhoa.getRowCount() - 1, tbKhoa.getRowCount() - 1);
        }
        tfMaKhoa.setText("");
        tfTenKhoa.setText("");
        cbbGV.setSelectedItem(null);
        tfSDT.setText("");
        tfNgayNhanChuc.setDate(null);

        Controller.controller.arrayListKhoa.clear();
        showDataKhoa();
        cbbKhoa.removeAllItems();
        LoadDatabase.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
    }//GEN-LAST:event_btSuaKhoaActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if (evt.getSource() == btTimKiem) {
            nganhTable.setRowCount(0);
            try {
                showDataNganh();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btNhapMoiNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiNganhActionPerformed
        tfMaNganh.setText("");
        tfTenNganh.setText("");
    }//GEN-LAST:event_btNhapMoiNganhActionPerformed

    private void tbNganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNganhMouseClicked
        int index = tbNganh.getSelectedRow();
        Nganh nganh = arrayListNganh.get(index);
        tfMaNganh.setText(nganh.getMaNganh());
        tfTenNganh.setText(nganh.getTenNganh());
    }//GEN-LAST:event_tbNganhMouseClicked

    private void btThemNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemNganhActionPerformed
        if (tfMaNganh.getText().equals("") || tfTenNganh.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin ngành!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int row = tbNganh.getSelectedRow();
                String maKhoa = LoadDatabase.getMaKhoa(cbbKhoa.getSelectedItem().toString());
                Nganh nganh = new Nganh(tfMaNganh.getText(), tfTenNganh.getText(), maKhoa);
                for (Nganh ng : Controller.controller.arrayListNganh) {
                    if (ng.getMaNganh().equalsIgnoreCase(nganh.getMaNganh())) {
                        JOptionPane.showMessageDialog(null, "Ngành đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                Controller.InsertData.insertNganh(nganh);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
            }

            tbNganh.getSelectionModel().setSelectionInterval(tbNganh.getRowCount() - 1, tbNganh.getRowCount() - 1);
        }
        tfMaNganh.setText("");
        tfTenNganh.setText("");
        try {
            showDataNganh();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btThemNganhActionPerformed

    private void btXoaNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaNganhActionPerformed
        if (tbNganh.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngành cần xóa!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Xác nhận xóa ngành?", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                try {
                    Controller.DeleteData.deleteNganh((String) tbNganh.getValueAt(tbNganh.getSelectedRow(), 1));
                    showDataNganh();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        tfMaNganh.setText("");
        tfTenNganh.setText("");
        try {
            showDataNganh();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btXoaNganhActionPerformed

    private void btSuaNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaNganhActionPerformed
        if (tfMaNganh.getText().equals("") || tfTenNganh.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin ngành!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int row = tbNganh.getSelectedRow();
                String maKhoa = LoadDatabase.getMaKhoa(cbbKhoa.getSelectedItem().toString());
                Nganh nganh = new Nganh(tfMaNganh.getText(), tfTenNganh.getText(), maKhoa);
                String maNganh = (String) tbNganh.getValueAt(tbNganh.getSelectedRow(), 1);
                
                if(!tfMaNganh.getText().equals(maNganh)){
                    JOptionPane.showMessageDialog(null, "Không được sửa mã ngành!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    tfMaNganh.setText(maNganh);
                    return; 
                }
                
                for (Nganh ng : Controller.controller.arrayListNganh) {

                    if (!ng.getMaNganh().equalsIgnoreCase(maNganh) && ng.getTenNganh().equalsIgnoreCase(nganh.getTenNganh())) {
                        JOptionPane.showMessageDialog(null, "Tên ngành đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                Controller.UpdateData.updateNganh(nganh, maNganh);
                tbNganh.getSelectionModel().setSelectionInterval(row, row);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        tfMaNganh.setText("");
        tfTenNganh.setText("");
        try {
            showDataNganh();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }//GEN-LAST:event_btSuaNganhActionPerformed

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
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
            java.util.logging.Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhoaNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachKhoaNganh dskn = new DanhSachKhoaNganh();
                dskn.setVisible(true);
                dskn.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNhapMoiKhoa;
    private javax.swing.JButton btNhapMoiNganh;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btSuaKhoa;
    private javax.swing.JButton btSuaNganh;
    private javax.swing.JButton btThemKhoa;
    private javax.swing.JButton btThemNganh;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoaKhoa;
    private javax.swing.JButton btXoaNganh;
    private javax.swing.JComboBox<String> cbbGV;
    private javax.swing.JComboBox<String> cbbKhoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbMaMH3;
    private javax.swing.JLabel lbMaMH4;
    private javax.swing.JLabel lbMaMH5;
    private javax.swing.JLabel lbSetName;
    private javax.swing.JLabel lbTenMH;
    private javax.swing.JLabel lbTenMH1;
    private javax.swing.JLabel lbTenMH2;
    private javax.swing.JLabel lbstclt1;
    private javax.swing.JLabel lbstcth1;
    private javax.swing.JPanel panelKhoa;
    private javax.swing.JPanel panelNganh;
    private javax.swing.JTable tbKhoa;
    private javax.swing.JTable tbNganh;
    private javax.swing.JTextField tfMaKhoa;
    private javax.swing.JTextField tfMaNganh;
    private com.toedter.calendar.JDateChooser tfNgayNhanChuc;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenKhoa;
    private javax.swing.JTextField tfTenNganh;
    // End of variables declaration//GEN-END:variables
}
