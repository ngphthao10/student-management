package View;

import Controller.LoadDatabase;
import Model.ChiTietBangDiemHocKy;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BangDiemGV extends javax.swing.JFrame {

    private DefaultTableModel myTable;
    public int maLTC;
    
    public BangDiemGV() {
        initComponents();
        tbDiem.setRowHeight(20);
        myTable = (DefaultTableModel) tbDiem.getModel();
        myTable.setRowCount(0);
        cbbHocKy.removeAllItems();
        cbbNienKhoa.removeAllItems();
        LoadDatabase.fillDistinctComboBox(cbbHocKy,"hocKy", "HOCKY");
        LoadDatabase.fillDistinctComboBox(cbbNienKhoa, "NienKhoa", "HOCKY");
        tfTenGV.setEditable(false);
        tfKhoa.setEditable(false);
    }
    
    private void showData() throws ClassNotFoundException {
        myTable.setRowCount(0);
        tfTenGV.setText(LoadDatabase.getTenGVfromMaGV(tfMaGV.getText()));
        tfKhoa.setText(LoadDatabase.getTenKhoafromMaGV(tfMaGV.getText()));
        cbbTenMH.removeAllItems();
        cbbNhom.removeAllItems();
        LoadDatabase.fillcbbTenMH(cbbTenMH, tfMaGV.getText(), LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa));
        LoadDatabase.fillcbbNhom(cbbNhom, tfMaGV.getText(), LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa), LoadDatabase.getMaMHfromTenMH((String)cbbTenMH.getSelectedItem()));

        String maGV = (String) tfMaGV.getText();
        String maHK = LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa);
        String maMH = LoadDatabase.getMaMHfromTenMH((String) cbbTenMH.getSelectedItem());
        int nhom = Integer.parseInt((String)cbbNhom.getSelectedItem());
        maLTC = LoadDatabase.getMaLTC(maMH, maHK, nhom);
        LoadDatabase.loadTableChiTietBangDiemHocKy(maLTC);
        myTable.setRowCount(0);
        int dem = 0;
        for (ChiTietBangDiemHocKy ctbd : Controller.controller.arrayListChiTietBangDiemHocKy) {
            dem++;
            Object[] row = new Object[]{
                dem, ctbd.getMaSV(), ctbd.getHoTenSV(), ctbd.getDiem(), ctbd.getKetQua()
            };
        myTable.addRow(row);
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
        btOut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lbMaMH = new javax.swing.JLabel();
        lbTenMH = new javax.swing.JLabel();
        lbstclt = new javax.swing.JLabel();
        tfTenGV = new javax.swing.JTextField();
        cbbHocKy = new javax.swing.JComboBox<>();
        cbbTenMH = new javax.swing.JComboBox<>();
        lbTenMH4 = new javax.swing.JLabel();
        lbMaMH1 = new javax.swing.JLabel();
        cbbNienKhoa = new javax.swing.JComboBox<>();
        lbstclt1 = new javax.swing.JLabel();
        tfMaGV = new javax.swing.JTextField();
        lbnhom = new javax.swing.JLabel();
        cbbNhom = new javax.swing.JComboBox<>();
        tfKhoa = new javax.swing.JTextField();
        btLoc = new javax.swing.JButton();
        btTimKiem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        btTaiLaiTrang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Bảng điểm lớp tín chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("XX - Ten người dùng");

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
                .addGap(13, 13, 13)
                .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btOut))
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH.setText("Niên khóa");

        lbTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH.setText("Khoa");

        lbstclt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt.setText("Tên GV");

        tfTenGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbbHocKy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbHocKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbHocKyActionPerformed(evt);
            }
        });

        cbbTenMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTenMH4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTenMH4.setText("Tên môn học");

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH1.setText("Học kỳ");

        cbbNienKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbNienKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNienKhoaActionPerformed(evt);
            }
        });

        lbstclt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt1.setText("Nhập mã giảng viên");

        tfMaGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbnhom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbnhom.setText("Nhóm");

        cbbNhom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btLoc.setBackground(new java.awt.Color(76, 124, 97));
        btLoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setIcon(new javax.swing.ImageIcon("D:\\Java\\student-management\\student-management\\Image\\icons8-filter-30.png")); // NOI18N
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Chọn lớp tín chỉ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbbHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbMaMH)
                                            .addGap(30, 30, 30)
                                            .addComponent(cbbNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lbstclt1)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btLoc)
                                                .addComponent(tfMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbTenMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbnhom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbbTenMH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbbNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(185, 185, 185))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbstclt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfTenGV)
                                                .addComponent(tfKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstclt1)
                    .addComponent(tfMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaMH1)
                    .addComponent(lbMaMH)
                    .addComponent(cbbNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstclt)
                    .addComponent(tfTenGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenMH))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbnhom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btTimKiem)
                .addGap(122, 122, 122))
        );

        tbDiem.setBorder(new javax.swing.border.MatteBorder(null));
        tbDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sinh viên", "Họ và tên", "Điểm", "Kết quả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDiem);
        if (tbDiem.getColumnModel().getColumnCount() > 0) {
            tbDiem.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbDiem.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbDiem.getColumnModel().getColumn(2).setPreferredWidth(400);
            tbDiem.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        btTaiLaiTrang.setBackground(new java.awt.Color(76, 124, 97));
        btTaiLaiTrang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTaiLaiTrang.setForeground(new java.awt.Color(255, 255, 255));
        btTaiLaiTrang.setText("Tải lại trang");
        btTaiLaiTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaiLaiTrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTaiLaiTrang)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTaiLaiTrang)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbHocKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbHocKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbHocKyActionPerformed

    private void cbbNienKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNienKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNienKhoaActionPerformed

    private void tbDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiemMouseClicked
        int index = tbDiem.getSelectedRow();
        String maSV = (String) tbDiem.getValueAt(index, 1);
        String hoTenSV = (String) tbDiem.getValueAt(index, 2);
        float diem = (float) tbDiem.getValueAt(index, 3);
        String ketQua = (String) tbDiem.getValueAt(index, 4);
        new SuaDiem(maSV, hoTenSV, diem, ketQua, maLTC).setVisible(true);
    }//GEN-LAST:event_tbDiemMouseClicked

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        if (evt.getSource() == btLoc){
            try {
                if (tfMaGV.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                myTable.setRowCount(0);
                tfTenGV.setText(LoadDatabase.getTenGVfromMaGV(tfMaGV.getText()));
                tfKhoa.setText(LoadDatabase.getTenKhoafromMaGV(tfMaGV.getText()));
                cbbTenMH.removeAllItems();
                cbbNhom.removeAllItems();
                LoadDatabase.fillcbbTenMH(cbbTenMH, tfMaGV.getText(), LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa));
                LoadDatabase.fillcbbNhom(cbbNhom, tfMaGV.getText(), LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa), LoadDatabase.getMaMHfromTenMH((String)cbbTenMH.getSelectedItem()));

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BangDiemGV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btLocActionPerformed

    private void btTaiLaiTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaiLaiTrangActionPerformed
        if (evt.getSource() == btTaiLaiTrang){
            try {
                myTable.setRowCount(0);
                showData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BangDiemGV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btTaiLaiTrangActionPerformed

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
        HomePage hp = new HomePage(Controller.controller.taiKhoan.getMaNDN());
        hp.setExtendedState(MAXIMIZED_BOTH);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btOutActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if (evt.getSource() == btTimKiem){
            try {
                if (tfMaGV.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                showData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BangDiemGV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btTimKiemActionPerformed


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
            java.util.logging.Logger.getLogger(ThongTinGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinGiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BangDiemGV bdgv = new BangDiemGV();
                bdgv.setVisible(true);
                bdgv.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLoc;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btTaiLaiTrang;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JComboBox<String> cbbHocKy;
    private javax.swing.JComboBox<String> cbbNhom;
    private javax.swing.JComboBox<String> cbbNienKhoa;
    private javax.swing.JComboBox<String> cbbTenMH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbTenMH;
    private javax.swing.JLabel lbTenMH4;
    private javax.swing.JLabel lbnhom;
    private javax.swing.JLabel lbstclt;
    private javax.swing.JLabel lbstclt1;
    private javax.swing.JTable tbDiem;
    private javax.swing.JTextField tfKhoa;
    private javax.swing.JTextField tfMaGV;
    private javax.swing.JTextField tfTenGV;
    // End of variables declaration//GEN-END:variables

    
}