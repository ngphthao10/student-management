package View;

import javax.swing.ButtonGroup;

public class DanhSachKhoaNganh extends javax.swing.JFrame {

    public DanhSachKhoaNganh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelKhoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoa = new javax.swing.JTable();
        lbMaMH3 = new javax.swing.JLabel();
        tfMaKhoa = new javax.swing.JTextField();
        lbTenMH1 = new javax.swing.JLabel();
        tfTenKhoa = new javax.swing.JTextField();
        lbTenMH2 = new javax.swing.JLabel();
        tfTrgKhoa = new javax.swing.JTextField();
        lbstclt1 = new javax.swing.JLabel();
        tfNgayNhanChuc = new javax.swing.JTextField();
        lbstcth1 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        btThemKhoa = new javax.swing.JButton();
        btXoaKhoa = new javax.swing.JButton();
        btSuaKhoa = new javax.swing.JButton();
        btNhapMoiKhoa = new javax.swing.JButton();
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
        cmbKhoa = new javax.swing.JComboBox<>();
        btTimKiem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNganh = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-user-64.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-cat-64.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Danh sách khoa, ngành");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("XX - Ten người dùng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 625, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(14, 14, 14))))
        );

        panelKhoa.setBackground(new java.awt.Color(204, 204, 204));
        panelKhoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelKhoa.setPreferredSize(new java.awt.Dimension(1069, 700));

        tbKhoa.setBorder(new javax.swing.border.MatteBorder(null));
        tbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 24));
        tbKhoa.setForeground(new java.awt.Color(0, 0, 0));
        tbKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khoa", "Tên khoa", "SĐT", "Ngày nhận chức"
            }
        ));
        jScrollPane1.setViewportView(tbKhoa);
        if (tbKhoa.getColumnModel().getColumnCount() > 0) {
            tbKhoa.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbKhoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbKhoa.getColumnModel().getColumn(2).setPreferredWidth(250);
            tbKhoa.getColumnModel().getColumn(2).setHeaderValue("Tên khoa");
            tbKhoa.getColumnModel().getColumn(3).setHeaderValue("SĐT");
            tbKhoa.getColumnModel().getColumn(4).setHeaderValue("Ngày nhận chức");
        }

        lbMaMH3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH3.setText("Mã khoa");

        tfMaKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH1.setText("Tên khoa");

        tfTenKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH2.setText("Trưởng khoa");

        tfTrgKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstclt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt1.setText("Ngày nhận chức");

        tfNgayNhanChuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstcth1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth1.setText("Số điện thoại");

        tfSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btThemKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btThemKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThemKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btThemKhoa.setText("THÊM");

        btXoaKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btXoaKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoaKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoaKhoa.setText("XÓA");

        btSuaKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btSuaKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuaKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btSuaKhoa.setText("SỬA");

        btNhapMoiKhoa.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoiKhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoiKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoiKhoa.setText("NHẬP MỚI");

        javax.swing.GroupLayout panelKhoaLayout = new javax.swing.GroupLayout(panelKhoa);
        panelKhoa.setLayout(panelKhoaLayout);
        panelKhoaLayout.setHorizontalGroup(
            panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaLayout.createSequentialGroup()
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhoaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKhoaLayout.createSequentialGroup()
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaMH3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTenMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTenMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                                    .addComponent(tfTenKhoa)
                                    .addComponent(tfTrgKhoa)))
                            .addGroup(panelKhoaLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbstcth1)
                                    .addComponent(btThemKhoa))
                                .addGap(18, 18, 18)
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhoaLayout.createSequentialGroup()
                                        .addComponent(btXoaKhoa)
                                        .addGap(13, 13, 13)))
                                .addGap(65, 65, 65)
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSuaKhoa)
                                    .addComponent(lbstclt1))
                                .addGap(18, 18, 18)
                                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btNhapMoiKhoa)
                                    .addComponent(tfNgayNhanChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelKhoaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelKhoaLayout.setVerticalGroup(
            panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaLayout.createSequentialGroup()
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
                    .addComponent(tfTrgKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstcth1)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbstclt1)
                    .addComponent(tfNgayNhanChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemKhoa)
                    .addComponent(btSuaKhoa)
                    .addComponent(btNhapMoiKhoa)
                    .addComponent(btXoaKhoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btSuaNganh.setBackground(new java.awt.Color(76, 124, 97));
        btSuaNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuaNganh.setForeground(new java.awt.Color(255, 255, 255));
        btSuaNganh.setText("SỬA");

        btXoaNganh.setBackground(new java.awt.Color(76, 124, 97));
        btXoaNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoaNganh.setForeground(new java.awt.Color(255, 255, 255));
        btXoaNganh.setText("XÓA");

        btNhapMoiNganh.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoiNganh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoiNganh.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoiNganh.setText("NHẬP MỚI");

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH1.setText("Khoa");

        cmbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbKhoa.setForeground(new java.awt.Color(0, 0, 0));
        cmbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Công nghệ đa phương tiện", "An toàn thông tin", "Marketing", "Viễn thông" }));
        cmbKhoa.setToolTipText("");
        cmbKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKhoaActionPerformed(evt);
            }
        });

        btTimKiem.setBackground(new java.awt.Color(76, 124, 97));
        btTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimKiem.setText("Tìm kiếm");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-find-32.png")); // NOI18N

        tbNganh.setBorder(new javax.swing.border.MatteBorder(null));
        tbNganh.setFont(new java.awt.Font("Segoe UI", 0, 24));
        tbNganh.setForeground(new java.awt.Color(0, 0, 0));
        tbNganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã ngành", "Tên ngành"
            }
        ));
        jScrollPane2.setViewportView(tbNganh);
        if (tbNganh.getColumnModel().getColumnCount() > 0) {
            tbNganh.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbNganh.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbNganh.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        javax.swing.GroupLayout panelNganhLayout = new javax.swing.GroupLayout(panelNganh);
        panelNganh.setLayout(panelNganhLayout);
        panelNganhLayout.setHorizontalGroup(
            panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNganhLayout.createSequentialGroup()
                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNganhLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNganhLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNganhLayout.createSequentialGroup()
                                .addComponent(cmbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNganhLayout.createSequentialGroup()
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTenNganh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(tfMaNganh, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(45, 45, 45)
                                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNganhLayout.createSequentialGroup()
                                        .addComponent(btThemNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btXoaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelNganhLayout.createSequentialGroup()
                                        .addComponent(btSuaNganh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btNhapMoiNganh))))))
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNganhLayout.setVerticalGroup(
            panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNganhLayout.createSequentialGroup()
                .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNganhLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbKhoa)
                            .addComponent(lbMaMH1)
                            .addComponent(btTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addComponent(panelNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKhoaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachKhoaNganh ctdt = new DanhSachKhoaNganh();
                ctdt.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNhapMoiKhoa;
    private javax.swing.JButton btNhapMoiNganh;
    private javax.swing.JButton btSuaKhoa;
    private javax.swing.JButton btSuaNganh;
    private javax.swing.JButton btThemKhoa;
    private javax.swing.JButton btThemNganh;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoaKhoa;
    private javax.swing.JButton btXoaNganh;
    private javax.swing.JComboBox<String> cmbKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbMaMH3;
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
    private javax.swing.JTextField tfNgayNhanChuc;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenKhoa;
    private javax.swing.JTextField tfTenNganh;
    private javax.swing.JTextField tfTrgKhoa;
    // End of variables declaration//GEN-END:variables
}
