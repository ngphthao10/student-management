package View;

import Controller.LoadDatabase;
import static Controller.controller.arrayListMonHoc;
import Model.MonHoc;
import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChuongTrinhDaoTao extends javax.swing.JFrame {

    private DefaultTableModel myTable;
    
    public ChuongTrinhDaoTao() {
        initComponents();
        myTable = (DefaultTableModel) tbMonHoc.getModel();
        myTable.setRowCount(0);
//        cbbPhanLoai.setSelectedItem(null);
        LoadDatabase loadData = new LoadDatabase();
        loadData.fillComboBox(cbbKhoa, "tenKhoa", "KHOA");
    }
    
    private void showData() throws ClassNotFoundException {
        LoadDatabase.filterAndDisplayTableMonHoc(cbbKhoa, cbbNganh);
        myTable.setRowCount(0);
        int dem = 0;
        for (MonHoc mh : Controller.controller.arrayListMonHoc) {
            dem++;
            myTable.addRow(new Object[]{dem, mh.getMaMH(), mh.getTenMH(), mh.getStclt(), mh.getStcth(), mh.getPhanLoai(), mh.getKhoa()});
        }
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbbKhoa = new javax.swing.JComboBox<>();
        btTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMonHoc = new javax.swing.JTable();
        lbMaMH1 = new javax.swing.JLabel();
        lbMaMH2 = new javax.swing.JLabel();
        cbbNganh = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lbMaMH = new javax.swing.JLabel();
        tfMaMH = new javax.swing.JTextField();
        lbTenMH = new javax.swing.JLabel();
        tfTenMH = new javax.swing.JTextField();
        lbstclt = new javax.swing.JLabel();
        tfStclt = new javax.swing.JTextField();
        tfStcth = new javax.swing.JTextField();
        lbstcth = new javax.swing.JLabel();
        lbPhanLoai = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btNhapMoi = new javax.swing.JButton();
        lbTenMH1 = new javax.swing.JLabel();
        tfKhoa = new javax.swing.JTextField();
        cbbPhanLoai = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Chương trình đào tạo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("XX - Ten người dùng");

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jSeparator1)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1069, 700));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-find-32.png")); // NOI18N

        cbbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbKhoa.setToolTipText("");
        cbbKhoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbKhoaItemStateChanged(evt);
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

        tbMonHoc.setBorder(new javax.swing.border.MatteBorder(null));
        tbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã môn học", "Tên môn học", "STCLT", "STCTH", "Phân loại"
            }
        ));
        tbMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMonHoc);
        if (tbMonHoc.getColumnModel().getColumnCount() > 0) {
            tbMonHoc.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbMonHoc.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbMonHoc.getColumnModel().getColumn(2).setPreferredWidth(400);
            tbMonHoc.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH1.setText("Khoa");

        lbMaMH2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaMH2.setText("Ngành");

        cbbNganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbNganh.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lbMaMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbKhoa)
                            .addComponent(lbMaMH1)
                            .addComponent(btTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaMH2)
                            .addComponent(cbbNganh)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH.setText("Mã môn học");

        tfMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH.setText("Tên môn học");

        tfTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstclt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt.setText("STCLT");

        tfStclt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfStcth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstcth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstcth.setText("STCTH");

        lbPhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPhanLoai.setText("Phân loại");

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
        lbTenMH1.setText("Khoa");

        tfKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbbPhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbPhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cơ sở", "Chuyên ngành" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Chi tiết thông tin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbstclt)
                        .addGap(18, 18, 18)
                        .addComponent(tfStclt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbstcth)
                        .addGap(18, 18, 18)
                        .addComponent(tfStcth, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMaMH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTenMH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbPhanLoai)
                        .addGap(18, 18, 18)
                        .addComponent(cbbPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTenMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btSua)
                        .addGap(18, 18, 18)
                        .addComponent(btNhapMoi)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaMH)
                    .addComponent(tfMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMH)
                    .addComponent(tfTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstclt)
                    .addComponent(tfStclt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbstcth)
                    .addComponent(tfStcth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhanLoai)
                    .addComponent(cbbPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenMH1)
                    .addComponent(tfKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btNhapMoi))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbKhoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbKhoaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                cbbNganh.removeAllItems();
                String selectedItem = (String) cbbKhoa.getSelectedItem();
                LoadDatabase.fillSubComboBox(cbbNganh, selectedItem);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_cbbKhoaItemStateChanged

    private void tbMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMonHocMouseClicked
        int index = tbMonHoc.getSelectedRow();
        MonHoc mh = arrayListMonHoc.get(index);
        
        tfMaMH.setText(mh.getMaMH());
        tfTenMH.setText(mh.getTenMH());
        cbbPhanLoai.setSelectedItem(mh.getPhanLoai());
        tfStclt.setText(String.valueOf(mh.getStclt()));
        tfStcth.setText(String.valueOf(mh.getStcth()));
        tfKhoa.setText(mh.getKhoa());
    }//GEN-LAST:event_tbMonHocMouseClicked

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if(evt.getSource() == btTimKiem){
            myTable.setRowCount(0);
            try {
                showData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiActionPerformed
        if (evt.getSource() == btNhapMoi) {
            tfMaMH.setText("");
            tfTenMH.setText("");
            tfStclt.setText("");
            tfStcth.setText("");
            cbbPhanLoai.setSelectedItem("Cơ sở");
            tfKhoa.setText("");
        }
    }//GEN-LAST:event_btNhapMoiActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if (tfMaMH.getText().equals("") || tfTenMH.getText().equals("") || tfStclt.getText().equals("") || tfStcth.getText().equals("") || tfKhoa.getText().equals("") || cbbPhanLoai.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin môn học!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = tbMonHoc.getSelectedRow();
            String pLoai = (String) cbbPhanLoai.getSelectedItem();
            MonHoc mh = new MonHoc(tfMaMH.getText(), tfTenMH.getText(), Integer.parseInt(tfStclt.getText()), Integer.parseInt(tfStcth.getText()), pLoai, tfKhoa.getText());

            for (MonHoc mhoc : Controller.controller.arrayListMonHoc) {
                if (mhoc.getMaMH().equals(tfMaMH.getText())) {
                    JOptionPane.showMessageDialog(null, "Môn học đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
//                for (TaiKhoan tkk : Controller.controller.arrayListTaiKhoan) {
//                    if (txtMaNV.getText().equals(tkk.getMaNV())) {
//                        baoloi.setText("Tên đăng nhập đã tồn tại!");
//                        return;
//                    }
//                }
            try {
                Controller.InsertData.insertMonHoc(mh);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
            }

            tbMonHoc.getSelectionModel().setSelectionInterval(tbMonHoc.getRowCount() - 1, tbMonHoc.getRowCount() - 1);
        }
        tfMaMH.setText("");
        tfTenMH.setText("");
        tfStclt.setText("");
        tfStcth.setText("");
        cbbPhanLoai.setSelectedItem("Cơ sở");
        tfKhoa.setText("");
        try {
            showData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (tbMonHoc.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn môn học!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Xác nhận xóa môn học?", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                System.out.println(tbMonHoc.getValueAt(tbMonHoc.getSelectedRow(), 1));
                try {
                    Controller.DeleteData.deleteMonHoc((String) tbMonHoc.getValueAt(tbMonHoc.getSelectedRow(), 1));
//                Controller.DeleteData.deleteTaiKhoan((String) tbMonHoc.getValueAt(tbMonHoc.getSelectedRow(), 1));

                    showData();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        tfMaMH.setText("");
        tfTenMH.setText("");
        tfStclt.setText("");
        tfStcth.setText("");
        cbbPhanLoai.setSelectedItem("Cơ sở");
        tfKhoa.setText("");

        try {
            showData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if (tfMaMH.getText().equals("") || tfTenMH.getText().equals("") || tfStclt.getText().equals("") || tfStcth.getText().equals("") || tfKhoa.getText().equals("") || cbbPhanLoai.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin môn học!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = tbMonHoc.getSelectedRow();
            String pLoai = (String) cbbPhanLoai.getSelectedItem();
            MonHoc mhoc = new MonHoc(tfMaMH.getText(), tfTenMH.getText(), Integer.parseInt(tfStclt.getText()), Integer.parseInt(tfStcth.getText()), pLoai, tfKhoa.getText());
            String maMonHoc = (String) tbMonHoc.getValueAt(tbMonHoc.getSelectedRow(), 1);
            for (MonHoc mh : Controller.controller.arrayListMonHoc) {
                if (mh.getMaMH().equalsIgnoreCase(maMonHoc) && mh.getTenMH().equalsIgnoreCase(mhoc.getTenMH())){
                        JOptionPane.showMessageDialog(null, "Tên môn học đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                }
            }
            try {
                Controller.UpdateData.updateMonHoc(mhoc, maMonHoc);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
            }
            tbMonHoc.getSelectionModel().setSelectionInterval(row, row);

//                for (TaiKhoan tkk : Controller.controller.arrayListTaiKhoan) {
//                    if (txtMaNV.getText().equals(tkk.getMaNV())) {
//                        baoloi.setText("Tên đăng nhập đã tồn tại!");
//                        return;
//                    }
//                }
        }
        tfMaMH.setText("");
        tfTenMH.setText("");
        tfStclt.setText("");
        tfStcth.setText("");
        cbbPhanLoai.setSelectedItem("Cơ sở");
        tfKhoa.setText("");
        try {
            showData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage hp = new HomePage();
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
                ChuongTrinhDaoTao ctdt = new ChuongTrinhDaoTao();
                ctdt.setVisible(true);
                ctdt.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNhapMoi;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbKhoa;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JComboBox<String> cbbPhanLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbMaMH2;
    private javax.swing.JLabel lbPhanLoai;
    private javax.swing.JLabel lbTenMH;
    private javax.swing.JLabel lbTenMH1;
    private javax.swing.JLabel lbstclt;
    private javax.swing.JLabel lbstcth;
    private javax.swing.JTable tbMonHoc;
    private javax.swing.JTextField tfKhoa;
    private javax.swing.JTextField tfMaMH;
    private javax.swing.JTextField tfStclt;
    private javax.swing.JTextField tfStcth;
    private javax.swing.JTextField tfTenMH;
    // End of variables declaration//GEN-END:variables

    
}