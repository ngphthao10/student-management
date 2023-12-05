package View;

import Controller.LoadDatabase;
import Controller.controller;
import static Controller.controller.arrayListGiangVien;
import Model.GiangVien;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThongTinGiangVien extends javax.swing.JFrame {
    private DefaultTableModel gvienTable;
    private String selectedImageUrl;
    public ThongTinGiangVien() {
        initComponents();
        gvienTable = (DefaultTableModel) tbGiangVien.getModel();
        gvienTable.setRowCount(0);
    }
    
    public void showDataTable(){
        LoadDatabase.loadTableGiangVien();
        gvienTable.setRowCount(0);
        int dem = 0;
        for (GiangVien gv : Controller.controller.arrayListGiangVien) {
            dem++;
            gvienTable.addRow(new Object[]{dem, gv.getMaGV(), gv.getHoGV() + " " + gv.getTenlotGV() + " " + gv.getTenGV(), gv.getPhai(), 
                gv.getNgaySinh(), gv.getKhoa(), gv.getNgayBD(), gv.getNgayKT(), gv.getEmail(), gv.getTrangThai()});
        }
    }
    public void showData(){
        LoadDatabase.loadTableGiangVien();
        String maGiangVien = tfTimMaGV.getText();
        for (GiangVien gv : controller.arrayListGiangVien) {
            if(gv.getMaGV().equalsIgnoreCase(maGiangVien)){
                tfMaGV.setText(gv.getMaGV());
                tfHoTen.setText(gv.getHoGV() + " " + gv.getTenlotGV() + " " + gv.getTenGV());
                cbbPhai.setSelectedItem(gv.getPhai());
                tfNgaySinh.setDate(gv.getNgaySinh());
                tfKhoa.setText(gv.getKhoa());
                tfNgayBD.setDate(gv.getNgayBD());
                tfEmail.setText(gv.getEmail());
                ccbTrangThai.setSelectedItem(gv.getTrangThai());
                System.out.println(gv.getHinhAnh());
                anhGV.setIcon(new javax.swing.ImageIcon(gv.getHinhAnh())); 
                if (gv.getNgayKT()!=null) tfNgayKT.setDate(gv.getNgayKT());
            }
        }
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfTimMaGV = new javax.swing.JTextField();
        btTimKiem = new javax.swing.JButton();
        btXem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGiangVien = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btNhapMoi = new javax.swing.JButton();
        btChinhSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        ccbTrangThai = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfKhoa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        lb = new javax.swing.JLabel();
        tfMaGV = new javax.swing.JTextField();
        anhGV = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        cbbPhai = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        tfNgayBD = new com.toedter.calendar.JDateChooser();
        tfNgayKT = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 232, 195));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-user-64.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-cat-64.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student Management");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("MoliSM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Thông tin giảng viên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1069, 700));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(1069, 700));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-find-32.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Nhập mã giảng viên");

        tfTimMaGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btTimKiem.setBackground(new java.awt.Color(76, 124, 97));
        btTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        btXem.setBackground(new java.awt.Color(76, 124, 97));
        btXem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXem.setForeground(new java.awt.Color(255, 255, 255));
        btXem.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-list-24.png")); // NOI18N
        btXem.setText("Xem danh sách");
        btXem.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        tbGiangVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã giảng viên", "Họ và tên", "Phái", "Ngày Sinh", "Khoa", "Ngày bắt đầu", "Ngày kết thúc", "Email", "Trạng thái"
            }
        ));
        tbGiangVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGiangVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGiangVien);
        if (tbGiangVien.getColumnModel().getColumnCount() > 0) {
            tbGiangVien.getColumnModel().getColumn(0).setPreferredWidth(8);
            tbGiangVien.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbGiangVien.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbGiangVien.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbGiangVien.getColumnModel().getColumn(4).setPreferredWidth(45);
            tbGiangVien.getColumnModel().getColumn(5).setPreferredWidth(20);
            tbGiangVien.getColumnModel().getColumn(6).setPreferredWidth(45);
            tbGiangVien.getColumnModel().getColumn(7).setPreferredWidth(45);
            tbGiangVien.getColumnModel().getColumn(8).setPreferredWidth(100);
            tbGiangVien.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTimMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfTimMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btNhapMoi.setBackground(new java.awt.Color(76, 124, 97));
        btNhapMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhapMoi.setForeground(new java.awt.Color(255, 255, 255));
        btNhapMoi.setText("Nhập mới");
        btNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapMoiActionPerformed(evt);
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

        btXoa.setBackground(new java.awt.Color(76, 124, 97));
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btThem.setBackground(new java.awt.Color(76, 124, 97));
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("Thêm mới");
        btThem.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        ccbTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ccbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang công tác", "Đã nghỉ việc" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Trạng thái");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Email");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Ngày kết thúc");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Ngày bắt đầu");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Khoa");

        tfKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Ngày sinh");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Phái");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Họ và tên");

        tfHoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb.setText("Mã giảng viên");

        tfMaGV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        anhGV.setBackground(new java.awt.Color(255, 51, 51));
        anhGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anhGV.setIcon(new javax.swing.ImageIcon("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\icons8-user-64.png")); // NOI18N
        anhGV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        upload.setText("Upload:");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        cbbPhai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbPhai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        tfNgaySinh.setDateFormatString("dd/MM/yyyy");
        tfNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfNgayBD.setDateFormatString("dd/MM/yyyy");
        tfNgayBD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfNgayKT.setDateFormatString("dd/MM/yyyy");
        tfNgayKT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(btXoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(btNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ccbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfEmail)
                                        .addComponent(tfKhoa)
                                        .addComponent(tfHoTen)
                                        .addComponent(tfMaGV)
                                        .addComponent(cbbPhai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addComponent(anhGV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(upload)
                .addGap(69, 69, 69))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lb)
                                            .addComponent(tfMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(cbbPhai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(tfKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(anhGV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(upload)))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel14))
                            .addComponent(tfNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15))
                    .addComponent(tfNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(ccbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        showDataTable();
    }//GEN-LAST:event_btXemActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        showData();
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapMoiActionPerformed
        tfMaGV.setText("");
        tfHoTen.setText("");
        cbbPhai.setSelectedItem("Nam");
        tfNgaySinh.setDate(null);
        tfKhoa.setText("");
        tfNgayBD.setDate(null);
        tfEmail.setText("");
        ccbTrangThai.setSelectedItem("Đang công tác");
        anhGV.setIcon(null);
        tfNgayKT.setDate(null);
    }//GEN-LAST:event_btNhapMoiActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if (!tfNgayBD.getDate().after(tfNgaySinh.getDate())){
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải xảy ra sau ngày sinh!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfNgayBD.setDate(null);
            tfNgaySinh.setDate(null);
            return;
        }
        if (tfNgayKT.getDate() != null && !tfNgayKT.getDate().after(tfNgayKT.getDate())){
            JOptionPane.showMessageDialog(null, "Ngày kết thúc phải xảy ra sau ngày bắt đầu!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfNgayBD.setDate(null);
            tfNgayKT.setDate(null);
            return;
        }
        String regex = "^[a-zA-Z0-9_]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tfEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Địa chỉ email không hợp lệ", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfEmail.setText("");
            return;
        }
        
        if (tfMaGV.getText().equals("") || tfHoTen.getText().equals("") || cbbPhai.getSelectedItem().equals(null) || tfNgaySinh.getDate().equals(null) || tfKhoa.getText().equals("") ||
                tfNgayBD.getDate().equals(null) || tfEmail.getText().equals("") || ccbTrangThai.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = tbGiangVien.getSelectedRow();
            String tt = (String) ccbTrangThai.getSelectedItem();
            String phai = (String) cbbPhai.getSelectedItem();
            String HinhAnh = selectedImageUrl;
            String hoTen = tfHoTen.getText();
            String[] parts = hoTen.split(" ");
            String hoGV = "";
            String tenLotGV = "";
            String tenGV = "";

            if (parts.length >= 1) hoGV = parts[0];
            if (parts.length >= 2) {
                tenLotGV = parts[1];
            }
            if (parts.length >= 3) {
                tenGV = parts[2];
            }
            GiangVien gv = new GiangVien(tfMaGV.getText(), hoGV, tenLotGV, tenGV, phai, tfNgaySinh.getDate(), 
                    tfKhoa.getText(), tfNgayBD.getDate(), tfNgayKT.getDate(), tt, tfEmail.getText(), HinhAnh);
        
            if (tbGiangVien.getSelectedRow() == -1) {
                for (GiangVien gvien : Controller.controller.arrayListGiangVien) {
                    if (gvien.getMaGV().equals(tfMaGV.getText())) {
                        JOptionPane.showMessageDialog(null, "Mã giảng viên đã tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
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
                    Controller.InsertData.insertGiangVien(gv);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                tbGiangVien.getSelectionModel().setSelectionInterval(row, row);

            }
        tfMaGV.setText("");
        tfHoTen.setText("");
        cbbPhai.setSelectedItem(null);
        tfNgaySinh.setDate(null);
        tfKhoa.setText("");
        tfNgayBD.setDate(null);
        tfNgayKT.setDate(null);
        tfEmail.setText("");
        ccbTrangThai.setSelectedItem(null);
        anhGV.setIcon(null);
        showDataTable();
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Hiển thị ảnh đã chọn
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(anhGV.getWidth(), anhGV.getHeight(), Image.SCALE_SMOOTH);
            anhGV.setIcon(new ImageIcon(image));
            System.err.print(anhGV.getIcon());
            selectedImageUrl = selectedFile.getAbsolutePath();
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void tbGiangVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGiangVienMouseClicked
 
        int index = tbGiangVien.getSelectedRow();
        GiangVien gv = arrayListGiangVien.get(index);
        
        if (gv.getNgayKT() != null) {
            tfNgayKT.setDate(gv.getNgayKT());
        }
        else{
            tfNgayKT.setDate(null);
        }
        tfMaGV.setText(gv.getMaGV());
        tfHoTen.setText(gv.getHoGV() + " " + gv.getTenlotGV() + " " + gv.getTenGV());
        cbbPhai.setSelectedItem(gv.getPhai());
        ccbTrangThai.setSelectedItem(gv.getTrangThai());
        tfNgaySinh.setDate(gv.getNgaySinh());
        tfNgayBD.setDate(gv.getNgayBD());
        tfKhoa.setText(gv.getKhoa());
        tfEmail.setText(gv.getEmail());
        anhGV.setIcon(new javax.swing.ImageIcon(gv.getHinhAnh()));
        
    }//GEN-LAST:event_tbGiangVienMouseClicked

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (tbGiangVien.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Xác nhận xóa giảng viên?", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                try {
                    Controller.DeleteData.deleteGiangVien((String) tbGiangVien.getValueAt(tbGiangVien.getSelectedRow(), 1));
//                Controller.DeleteData.deleteTaiKhoan((String) tbMonHoc.getValueAt(tbMonHoc.getSelectedRow(), 1));
                    showDataTable();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuongTrinhDaoTao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        tfMaGV.setText("");
        tfHoTen.setText("");
        cbbPhai.setSelectedItem(null);
        tfNgaySinh.setDate(null);
        tfKhoa.setText("");
        tfNgayBD.setDate(null);
        tfNgayKT.setDate(null);
        tfEmail.setText("");
        ccbTrangThai.setSelectedItem(null);
        anhGV.setIcon(null);
        showDataTable();   
    }//GEN-LAST:event_btXoaActionPerformed

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        if (!tfNgayBD.getDate().after(tfNgaySinh.getDate())){
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải xảy ra sau ngày sinh!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfNgayBD.setDate(null);
            tfNgaySinh.setDate(null);
            return;
        }
        if (tfNgayKT.getDate() != null && !tfNgayKT.getDate().after(tfNgayKT.getDate())){
            JOptionPane.showMessageDialog(null, "Ngày kết thúc phải xảy ra sau ngày bắt đầu!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfNgayBD.setDate(null);
            tfNgayKT.setDate(null);
            return;
        }
        String regex = "^[a-zA-Z0-9_]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tfEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Địa chỉ email không hợp lệ", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
            tfEmail.setText("");
            return;
        }
        
        if (tfMaGV.getText().equals("") || tfHoTen.getText().equals("") || cbbPhai.getSelectedItem().equals(null) || tfNgaySinh.getDate().equals(null) || tfKhoa.getText().equals("") ||
                tfNgayBD.getDate().equals(null) || tfEmail.getText().equals("") || ccbTrangThai.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = tbGiangVien.getSelectedRow();
            String tt = (String) ccbTrangThai.getSelectedItem();
            String phai = (String) cbbPhai.getSelectedItem();
            String HinhAnh = selectedImageUrl;
            String hoTen = tfHoTen.getText();
            String[] parts = hoTen.split(" ");
            String hoGV = "";
            String tenLotGV = "";
            String tenGV = "";

            if (parts.length >= 1) hoGV = parts[0];
            if (parts.length >= 2) tenLotGV = parts[1];
            if (parts.length >= 3) tenGV = parts[2];
            
            GiangVien gv = new GiangVien(tfMaGV.getText(), hoGV, tenLotGV, tenGV, phai, tfNgaySinh.getDate(), 
                    tfKhoa.getText(), tfNgayBD.getDate(), tfNgayKT.getDate(), tt, tfEmail.getText(), HinhAnh);
            String maGVien = (String) tbGiangVien.getValueAt(tbGiangVien.getSelectedRow(), 1);
            for (GiangVien gvien : Controller.controller.arrayListGiangVien) {
                if (!gvien.getMaGV().equalsIgnoreCase(maGVien) && gvien.getEmail().equalsIgnoreCase(gv.getEmail())){
                    JOptionPane.showMessageDialog(null, "Email không được trùng nhau!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
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
                Controller.UpdateData.updateGiangVien(gv, maGVien);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            tbGiangVien.getSelectionModel().setSelectionInterval(row, row);

            
        tfMaGV.setText("");
        tfHoTen.setText("");
        cbbPhai.setSelectedItem(null);
        tfNgaySinh.setDate(null);
        tfKhoa.setText("");
        tfNgayBD.setDate(null);
        tfNgayKT.setDate(null);
        tfEmail.setText("");
        ccbTrangThai.setSelectedItem(null);
        anhGV.setIcon(null);
        showDataTable();
        }
    }//GEN-LAST:event_btChinhSuaActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinGiangVien ttgv = new ThongTinGiangVien();
                ttgv.setVisible(true);
                ttgv.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhGV;
    private javax.swing.JButton btChinhSua;
    private javax.swing.JButton btNhapMoi;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbPhai;
    private javax.swing.JComboBox<String> ccbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JTable tbGiangVien;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfKhoa;
    private javax.swing.JTextField tfMaGV;
    private com.toedter.calendar.JDateChooser tfNgayBD;
    private com.toedter.calendar.JDateChooser tfNgayKT;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfTimMaGV;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
