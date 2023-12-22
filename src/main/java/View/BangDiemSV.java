package View;

import Controller.LoadDatabase;
import Controller.controller;
import Model.ChiTietBangDiemHocKy;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BangDiemSV extends javax.swing.JFrame {

    private DefaultTableModel myTable;
    
    public BangDiemSV() {
        initComponents();
        myTable = (DefaultTableModel) tbBangDiemSV.getModel();
        myTable.setRowCount(0);
        LoadDatabase.fillDistinctComboBox(cbbHocKy, "hocKy", "HOCKY");
        LoadDatabase.fillDistinctComboBox(cbbNienKhoa, "nienKhoa", "HOCKY");
        tfDiemTB.setEditable(false);
        tfXeploai.setEditable(false);
        tfSTCTL.setEditable(false);
        tbBangDiemSV.setRowHeight(20);
        
    }
    
    public void showData() throws ClassNotFoundException {
        try {
            String maSV = (String) tfMaSV.getText();
            String maHK = LoadDatabase.getMaHK(cbbHocKy, cbbNienKhoa);
            LoadDatabase.loadTableChiTietBangDiemHocKy(maSV, maHK);
            myTable.setRowCount(0);
            int dem = 0;
            
            for (ChiTietBangDiemHocKy ctbdhk: controller.arrayListChiTietBangDiemHocKy){
                dem ++;
                Object[] row = new Object[]{
                    dem, ctbdhk.getMaLTC(), LoadDatabase.getMaMHfromMaLTC(ctbdhk.getMaLTC()), LoadDatabase.getTenMH(LoadDatabase.getMaMHfromMaLTC(ctbdhk.getMaLTC())),
                    maHK, LoadDatabase.getSTCLTfromMaMH(LoadDatabase.getMaMHfromMaLTC(ctbdhk.getMaLTC())),
                    LoadDatabase.getSTCTHfromMaMH(LoadDatabase.getMaMHfromMaLTC(ctbdhk.getMaLTC())), ctbdhk.getDiem(), ctbdhk.getKetQua()
                };
                myTable.addRow(row);
            }
            // thong tin diem hoc ky
            String maBD = LoadDatabase.getMaBD(maHK, maSV);
            Float DiemTB = LoadDatabase.getDiemTB(maBD);
            String xeploai = LoadDatabase.getXepLoai(maBD);
            tfDiemTB.setText(String.valueOf(DiemTB));
            tfXeploai.setText(xeploai);
            tfSTCTL.setText(String.valueOf(LoadDatabase.getSTCTLHocKy(maBD)));
            
            // thong tin diem tong ket
            float diemTBTK = LoadDatabase.getDiemTBTongKet(maSV);
            tfDiemTBTK.setText(String.valueOf(diemTBTK));
            tfXepLoaiTK.setText(getKQXL(diemTBTK));
            tfSTCTLTK.setText(String.valueOf(LoadDatabase.getSTCTLTongKet(maSV)));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BangDiemSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getKQXL(float diemTB) {
        if (diemTB >= 8.0) {
            return "Giỏi";
        }
        else if (diemTB >= 6.5) {
            return "Khá";
        }
        else if (diemTB > 4.0) {
            return "Trung bình";
        }
        else if (diemTB >= 0.0) {
            return "Yếu";
        }
        else {
            return "Không xác định";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBangDiemSV = new javax.swing.JTable();
        lbNhapMaSV = new javax.swing.JLabel();
        tfMaSV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbMaMH1 = new javax.swing.JLabel();
        cbbHocKy = new javax.swing.JComboBox<>();
        lbMaMH2 = new javax.swing.JLabel();
        cbbNienKhoa = new javax.swing.JComboBox<>();
        btLoc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbMaMH = new javax.swing.JLabel();
        tfDiemTB = new javax.swing.JTextField();
        lbstclt = new javax.swing.JLabel();
        tfXeploai = new javax.swing.JTextField();
        lbstclt1 = new javax.swing.JLabel();
        tfSTCTL = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbMaMH4 = new javax.swing.JLabel();
        tfDiemTBTK = new javax.swing.JTextField();
        LB = new javax.swing.JLabel();
        tfXepLoaiTK = new javax.swing.JTextField();
        lbstclt5 = new javax.swing.JLabel();
        tfSTCTLTK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Bảng điểm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("XX - Ten người dùng");

        jButton1.setBackground(new java.awt.Color(209, 232, 195));
        jButton1.setBorder(null);

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

        tbBangDiemSV.setBorder(new javax.swing.border.MatteBorder(null));
        tbBangDiemSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbBangDiemSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã LTC", "Mã môn học", "Tên môn học", "Mã HK", "STCLT", "STCTH", "Điểm", "Kết quả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBangDiemSV);
        if (tbBangDiemSV.getColumnModel().getColumnCount() > 0) {
            tbBangDiemSV.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbBangDiemSV.getColumnModel().getColumn(1).setPreferredWidth(40);
            tbBangDiemSV.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbBangDiemSV.getColumnModel().getColumn(3).setPreferredWidth(400);
            tbBangDiemSV.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbBangDiemSV.getColumnModel().getColumn(5).setPreferredWidth(40);
            tbBangDiemSV.getColumnModel().getColumn(6).setPreferredWidth(40);
            tbBangDiemSV.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        lbNhapMaSV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNhapMaSV.setText("Nhập mã sinh viên");

        tfMaSV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbNhapMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhapMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbMaMH1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH1.setText("Học kỳ");

        cbbHocKy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbHocKy.setToolTipText("");
        cbbHocKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbHocKyActionPerformed(evt);
            }
        });

        lbMaMH2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH2.setText("Niên khóa");

        cbbNienKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbNienKhoa.setToolTipText("");
        cbbNienKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNienKhoaActionPerformed(evt);
            }
        });

        btLoc.setBackground(new java.awt.Color(76, 124, 97));
        btLoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbMaMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbMaMH2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaMH1)
                    .addComponent(cbbHocKy)
                    .addComponent(lbMaMH2)
                    .addComponent(cbbNienKhoa))
                .addGap(27, 27, 27)
                .addComponent(btLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setText("Thông tin điểm học kỳ");

        lbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH.setText("Điểm TB");

        tfDiemTB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstclt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt.setText("STCTL");

        tfXeploai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstclt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt1.setText("Xếp loại");

        tfSTCTL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbstclt1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfXeploai))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbstclt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSTCTL))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMaMH)
                    .addComponent(tfDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSTCTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbstclt))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstclt1)
                    .addComponent(tfXeploai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(76, 124, 97));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thông tin điểm tổng kết");

        lbMaMH4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMaMH4.setForeground(new java.awt.Color(255, 255, 255));
        lbMaMH4.setText("Điểm TB");

        tfDiemTBTK.setEditable(false);
        tfDiemTBTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        LB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LB.setForeground(new java.awt.Color(255, 255, 255));
        LB.setText("STCTL");

        tfXepLoaiTK.setEditable(false);
        tfXepLoaiTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbstclt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbstclt5.setForeground(new java.awt.Color(255, 255, 255));
        lbstclt5.setText("Xếp loại");

        tfSTCTLTK.setEditable(false);
        tfSTCTLTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbstclt5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfXepLoaiTK))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSTCTLTK))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbMaMH4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDiemTBTK, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMaMH4)
                    .addComponent(tfDiemTBTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSTCTLTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstclt5)
                    .addComponent(tfXepLoaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void cbbHocKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbHocKyActionPerformed

    }//GEN-LAST:event_cbbHocKyActionPerformed

    private void cbbNienKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNienKhoaActionPerformed

    }//GEN-LAST:event_cbbNienKhoaActionPerformed

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        if (evt.getSource() == btLoc){
            try {
                if (tfMaSV.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Bạn phải nhập mã sinh viên!","Báo lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                showData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BangDiemSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btLocActionPerformed

    
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
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BangDiemSV bdsv = new BangDiemSV();
                bdsv.setVisible(true);
                bdsv.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB;
    private javax.swing.JButton btLoc;
    private javax.swing.JComboBox<String> cbbHocKy;
    private javax.swing.JComboBox<String> cbbNienKhoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMaMH;
    private javax.swing.JLabel lbMaMH1;
    private javax.swing.JLabel lbMaMH2;
    private javax.swing.JLabel lbMaMH4;
    private javax.swing.JLabel lbNhapMaSV;
    private javax.swing.JLabel lbstclt;
    private javax.swing.JLabel lbstclt1;
    private javax.swing.JLabel lbstclt5;
    private javax.swing.JTable tbBangDiemSV;
    private javax.swing.JTextField tfDiemTB;
    private javax.swing.JTextField tfDiemTBTK;
    private javax.swing.JTextField tfMaSV;
    private javax.swing.JTextField tfSTCTL;
    private javax.swing.JTextField tfSTCTLTK;
    private javax.swing.JTextField tfXepLoaiTK;
    private javax.swing.JTextField tfXeploai;
    // End of variables declaration//GEN-END:variables

    
}