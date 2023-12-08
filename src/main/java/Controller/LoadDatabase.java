package Controller;

import static Controller.DataConnection.createStatement;
import Model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoadDatabase {

    public static void loadTableTaiKhoan() {
        ResultSet rs = DataConnection.retrieveData("select * from TAIKHOAN");
        try {
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(
                        rs.getString("maNND").trim(),
                        rs.getString("maTK").trim(),
                        rs.getString("tenNguoiDung").trim(),
                        rs.getString("tenDangNhap").trim(),
                        rs.getString("matKhau").trim(),
                        rs.getBoolean("trangThaiXoa"));
                controller.arrayListTaiKhoan.add(tk);

            }
        } catch (SQLException e) {
        }
    }

    public static void loadTableMonHoc() {
        ResultSet rs = DataConnection.retrieveData("select * from MONHOC");
        try {
            while (rs.next()) {
                MonHoc mh = new MonHoc(
                        rs.getString("maMH").trim(),
                        rs.getString("tenMH").trim(),
                        rs.getInt("stclt"),
                        rs.getInt("stcth"),
                        rs.getString("phanLoai").trim(),
                        rs.getString("khoa").trim());
                controller.arrayListMonHoc.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTablePhanQuyen() {
        ResultSet rs = DataConnection.retrieveData("select * from PHANQUYEN");
        try {
            while (rs.next()) {
                PhanQuyen pq = new PhanQuyen(
                        rs.getString("maNhomNguoiDung").trim(),
                        rs.getInt("maChucNang"));
                controller.arrayListPhanQuyen.add(pq);

            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Hiển thị TABLE MONHOC sau khi lọc Khoa, ngành
    public static void filterAndDisplayTableMonHoc(JComboBox<String> mainComboBox, JComboBox<String> subComboBox) throws ClassNotFoundException {
        try {
            createStatement();
            String selectedKhoa = (String) mainComboBox.getSelectedItem();
            String selectedNganh = (String) subComboBox.getSelectedItem();
            if (selectedKhoa == null || selectedNganh == null) {
                return;
            }
            String query = "SELECT * FROM MONHOC "
                    + "JOIN NGANH ON NGANH.maKhoa = MONHOC.khoa "
                    + "JOIN KHOA ON KHOA.maKhoa = MONHOC.khoa "
                    + "WHERE tenkhoa  = ? and tenNganh = ?";
            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, selectedKhoa);
                preparedStatement.setString(2, selectedNganh);

                ResultSet resultSet = preparedStatement.executeQuery();
                controller.arrayListMonHoc.clear();
                while (resultSet.next()) {
                    MonHoc mh = new MonHoc(
                            resultSet.getString("maMH").trim(),
                            resultSet.getString("tenMH").trim(),
                            resultSet.getInt("stclt"),
                            resultSet.getInt("stcth"),
                            resultSet.getString("phanLoai").trim(),
                            resultSet.getString("khoa").trim());
                    controller.arrayListMonHoc.add(mh);
                }

                // Đặt DefaultTableModel vào bảng
//                tableMH.setModel(model);
            }

            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Hiện thị dữ liệu vào comboBox
    public static void fillComboBox(JComboBox<String> comboBox, String column, String tableName) {
        try {
            ResultSet rs = DataConnection.retrieveData("select DISTINCT " + column + " from " + tableName);
            // Chèn dữ liệu từ kết quả truy vấn vào JComboBox
            while (rs.next()) {
                String columnName = rs.getString(column);
                comboBox.addItem(columnName);
            }
            // Đóng tài nguyên
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Hiện thị dữ liệu vào subComboBox
    public static void fillSubComboBox(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT tenNganh FROM NGANH WHERE maKhoa IN (SELECT maKhoa from khoa where tenKhoa = ?)";
            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, selectedValue);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String tenNganh = resultSet.getString("tenNganh");
                        subComboBox.addItem(tenNganh);
                    }
                }
            }

            // Đóng kết nối
            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fillSubComboBoxLop(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT tenLop FROM LOP WHERE maNganh IN (SELECT maNganh FROM NGANH WHERE tenNganh = ?)";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String tenLop = resultSet.getString("tenLop");
                        subComboBox.addItem(tenLop);
                    }
                }

                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableLop(JComboBox<String> subComboBox) throws ParseException {
        try {
            createStatement();
            String selectedValue = (String) subComboBox.getSelectedItem();
            String query = "SELECT * FROM SINHVIEN WHERE maLop IN (SELECT maLop FROM LOP WHERE tenLop = ?)";

            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);
                controller.arrayListSinhVien.clear();

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String maSV = resultSet.getString("maSV").trim();
                        String hoSV = resultSet.getString("hoSV").trim();
                        String tenlotSV = resultSet.getString("tenLotSV").trim();
                        String tenSV = resultSet.getString("tenSV").trim();
                        String phai = resultSet.getString("phai").trim();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date ngaySinh = dateFormat.parse(resultSet.getString("ngaySinh"));
                        String email = resultSet.getString("email").trim();
                        String sdt = resultSet.getString("sdt");
                        String maLop = resultSet.getString("maLop").trim();
                        int namNhapHoc = Integer.parseInt(resultSet.getString("namNhapHoc"));
                        String trangThai = resultSet.getString("trangThai").trim();
                        SinhVien sv = new SinhVien(maSV, hoSV, tenlotSV, tenSV, phai, ngaySinh, email, sdt, maLop, namNhapHoc, trangThai, "");
                        controller.arrayListSinhVien.add(sv);
                    }
                }
            }
            DataConnection.connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //lấy mã lớp khi biết tên lớp
    public static String selectMalop(String tenLop) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT maLop FROM LOP WHERE tenLop = ?";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, tenLop);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String maLop = resultSet.getString("maLop");
                        DataConnection.connection.close();
                        return maLop;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void loadTableKhoa() {
        ResultSet rs = DataConnection.retrieveData("select * from KHOA");
        try {
            controller.arrayListKhoa.clear();
            while (rs.next()) {
                Khoa khoa = new Khoa(
                        rs.getString("maKhoa").trim(),
                        rs.getString("tenKhoa").trim(),
                        rs.getString("sdt").trim(),
                        rs.getString("trgKhoa").trim(),
                        rs.getDate("ngayNhanChuc"));
                controller.arrayListKhoa.add(khoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void loadTableNganh(){
//        ResultSet rs = DataConnection.retrieveData("select * from NGANH");
//        try{
//            while(rs.next()){
//                Nganh nganh = new Nganh(
//                    rs.getString("maNganh").trim(),
//                    rs.getString("tenNganh").trim(),
//                    rs.getString("maKhoa").trim());
//                controller.arrayListNganh.add(nganh);
//            }
//        }
//        catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
    //Hiển thị bảng ngành được lọc theo khoa
    public static void filterAndDisplayTableNganh(JComboBox<String> mainComboBox) throws ClassNotFoundException {
        try {
            createStatement();
            String selectedKhoa = (String) mainComboBox.getSelectedItem();
            if (selectedKhoa == null) {
                return;
            }

            String query = "SELECT * FROM NGANH WHERE maKhoa IN (SELECT maKhoa from khoa where tenKhoa = ?)";
            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, selectedKhoa);

                ResultSet resultSet = preparedStatement.executeQuery();
                controller.arrayListNganh.clear();
                while (resultSet.next()) {
                    Nganh nganh = new Nganh(
                            resultSet.getString("maNganh").trim(),
                            resultSet.getString("tenNganh").trim(),
                            resultSet.getString("maKhoa").trim());
                    controller.arrayListNganh.add(nganh);
                }

                // Đặt DefaultTableModel vào bảng
//                tableMH.setModel(model);
            }

            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //lấy mã ngành khi biết tên khoa
    public static String getMaKhoa(String tenKhoa) throws ClassNotFoundException {

        String sqlQuery = "SELECT maKhoa FROM KHOA WHERE tenKhoa = ?";
        String maKhoa = "000";
        try {
            createStatement();
            // Tạo và thực thi truy vấn
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlQuery);
            ps.setString(1, tenKhoa);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                maKhoa = rs.getString("maKhoa");
            }
            DataConnection.connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }

        return maKhoa;
    }

    public static SinhVien getThongTinSV(String maSV) throws ParseException {
        SinhVien sv;
        try {
            createStatement();
            String sqlCommand = "SELECT * FROM SINHVIEN WHERE maSV = ?";

            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maSV);
                controller.arrayListSinhVien.clear();

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date ngaySinh = dateFormat.parse(resultSet.getString("ngaySinh"));
                        int namNhapHoc = Integer.parseInt(resultSet.getString("namNhapHoc"));
                        sv = new SinhVien(
                                resultSet.getString("maSV"), resultSet.getString("hoSV"), resultSet.getString("tenlotSV"),
                                resultSet.getString("tenSV"), resultSet.getString("phai"), ngaySinh,
                                resultSet.getString("email"), resultSet.getString("sdt"), resultSet.getString("maLop"),
                                namNhapHoc, resultSet.getString("trangThai"), resultSet.getString("hinhAnh")
                        );
                        DataConnection.connection.close();
                        return sv;
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Mã sinh viên không tồn tại", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    public static Nganh getNganhfromMaLop(String maLop) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT * from NGANH WHERE maNganh IN (SELECT maNganh FROM LOP WHERE maLop = ?)";

            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maLop);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Nganh nganh = new Nganh(
                                resultSet.getString("maNganh"), resultSet.getString("tenNganh"), resultSet.getString("maKhoa")
                        );
                        DataConnection.connection.close();
                        return nganh;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Mã lớp không tồn tại", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    public static void loadTableGiangVien() {
        ResultSet rs = DataConnection.retrieveData("select * from giangvien");

        try {
            controller.arrayListGiangVien.clear();
            while (rs.next()) {
                String hanh = "";
                if (rs.getString("hinhAnh") != null) {
                    hanh = rs.getString("hinhAnh").trim();
                }

                GiangVien gv = new GiangVien(
                        rs.getString("maGV").trim(),
                        rs.getString("hoGV").trim(),
                        rs.getString("tenLotGV").trim(),
                        rs.getString("tenGV").trim(),
                        rs.getString("phai").trim(),
                        rs.getDate("ngaySinh"),
                        rs.getString("maKhoa").trim(),
                        rs.getDate("ngayBD"),
                        rs.getDate("ngayKT"),
                        rs.getString("trangThai").trim(),
                        rs.getString("email").trim(),
                        hanh
                );

                controller.arrayListGiangVien.add(gv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //lấy tên môn học khi biết maMH
    public static String getTenMH(String maMH) throws ClassNotFoundException {
        String sqlQuery = "SELECT tenMH FROM KHOA WHERE maMH = ?";
        String tenMH = "000";
        try {
            createStatement();
            // Tạo và thực thi truy vấn
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlQuery);
            ps.setString(1, maMH);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tenMH = rs.getString("maKhoa");
            }
            DataConnection.connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }

        return tenMH;
    }

    //Hiển thị tên môn học đã được đăng kí lớp tín chỉ vào comboBox
    public static void fillTenMonHocComboBox(JComboBox<String> comboBox) {
        try {
            ResultSet rs = DataConnection.retrieveData("SELECT DISTINCT tenMH FROM MONHOC MH JOIN LOPTINCHI LTC ON LTC.maMH = MH.maMH");
            // Chèn dữ liệu từ kết quả truy vấn vào JComboBox
            while (rs.next()) {
                String columnName = rs.getString("tenMH");
                comboBox.addItem(columnName);
            }
            // Đóng tài nguyên
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getKhoafromMaNganh(String maNganh) {
        try {
            createStatement();
            String sqlCommand = "SELECT tenKhoa from KHOA WHERE maKhoa IN (SELECT maKhoa FROM NGANH WHERE maNganh = ?)";

            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maNganh);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String tenKhoa = resultSet.getString("tenKhoa");
                        DataConnection.connection.close();
                        return tenKhoa;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void fillSubComboBoxMaLop(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT maLop FROM LOP WHERE maNganh IN (SELECT maNganh FROM NGANH WHERE tenNganh = ?)";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String maLop = resultSet.getString("maLop");
                        subComboBox.addItem(maLop);
                    }
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Hiển thị tên giảng viên vào comboBox
    public static void fillTenGiangVienComboBox(JComboBox<String> comboBox) {
        try {
            ResultSet rs = DataConnection.retrieveData("SELECT CONCAT(maGV + '-' + hoGV, ' ', tenLotGV, ' ', tenGV) as hoTen from giangvien");
            // Chèn dữ liệu từ kết quả truy vấn vào JComboBox
            while (rs.next()) {
                String columnName = rs.getString("hoTen");
                comboBox.addItem(columnName);
            }
            // Đóng tài nguyên
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Hiển thị trạng thái hủy lớp trong Phân công giảng viên 
    public static void fillTrangThaiComboBox(JComboBox<String> comboBox) {
        try {
            ResultSet rs = DataConnection.retrieveData("SELECT DISTINCT huyLop from LOPTINCHI");
            comboBox.addItem("Tất cả");
            while (rs.next()) {
                int huyLopValue = rs.getInt("huyLop");
                String trangThai;

                if (huyLopValue == 0) {
                    trangThai = "Chưa hủy";
                } else {
                    trangThai = "Đã hủy";
                }

                // Thêm vào JComboBox
                comboBox.addItem(trangThai);
            }
            // Đóng tài nguyên
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Hiển thị bảng Phân Công theo khoa và lọc trạng thái hủy lớp
    public static void filterAndDisplayTablePhanCong(JComboBox<String> mainComboBox, JComboBox<String> comboBox) {
        try {
            try {
                createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
            String selectedKhoa = (String) mainComboBox.getSelectedItem();
            String selectedTrangThai = (String) comboBox.getSelectedItem();
            if (selectedKhoa == null) {
                return;
            }

            String query;
            if ("Tất cả".equals(selectedTrangThai)) {
                query = "SELECT maLopTC, maHK, tenMH, LTC.maLop, PC.maGV, CONCAT(hoGV, ' ', tenLotGV, ' ', tenGV) AS hoTen, huyLop "
                        + "FROM LOPTINCHI LTC "
                        + "JOIN MONHOC MH ON MH.maMH = LTC.maMH "
                        + "JOIN PHANCONG PC ON PC.maLTC = LTC.maLopTC "
                        + "JOIN GIANGVIEN GV ON GV.maGV = PC.maGV "
                        + "WHERE MH.khoa IN (SELECT maKhoa from khoa where tenKhoa = ?)";
            } else {
                query = "SELECT maLopTC, maHK, tenMH, LTC.maLop, PC.maGV, CONCAT(hoGV, ' ', tenLotGV, ' ', tenGV) AS hoTen, huyLop "
                        + "FROM LOPTINCHI LTC "
                        + "JOIN MONHOC MH ON MH.maMH = LTC.maMH "
                        + "JOIN PHANCONG PC ON PC.maLTC = LTC.maLopTC "
                        + "JOIN GIANGVIEN GV ON GV.maGV = PC.maGV "
                        + "WHERE MH.Khoa IN (SELECT maKhoa from khoa where tenKhoa = ?) AND huyLop = ?";
            }

            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, selectedKhoa);

                // Thêm điều kiện về trạng thái dựa trên giá trị comboBox
                if ("Chưa hủy".equals(selectedTrangThai)) {
                    preparedStatement.setInt(2, 0);
                } else if ("Đã hủy".equals(selectedTrangThai)) {
                    preparedStatement.setInt(2, 1);
                }

                ResultSet resultSet = preparedStatement.executeQuery();
                controller.arrayListPhanCong.clear();
                while (resultSet.next()) {
                    PhanCong pc = new PhanCong(
                            resultSet.getString("maGV").trim(),
                            resultSet.getInt("maLopTC")
                    );
                    controller.arrayListPhanCong.add(pc);
                }
            }

            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Hiển thị bảng lớp tín chỉ
    public static void loadTableLopTinChi() {
        ResultSet rs = DataConnection.retrieveData("select * from LOPTINCHI");
        try {
            controller.arrayListLopTinChi.clear();
            while (rs.next()) {
                LopTinChi ltc = new LopTinChi(
                        rs.getInt("maLopTC"),
                        rs.getString("maMH").trim(),
                        rs.getString("maHK"),
                        rs.getString("maLop").trim(),
                        rs.getInt("nhom"),
                        rs.getInt("svMin"),
                        rs.getInt("svMax"),
                        rs.getBoolean("huyLop"));
                controller.arrayListLopTinChi.add(ltc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void loadTablePhanCong() {
        ResultSet rs = DataConnection.retrieveData("select * from phancong");
        try {
            controller.arrayListPhanCong.clear();
            while (rs.next()) {
                PhanCong pc = new PhanCong(
                        rs.getString("maGV").trim(),
                        rs.getInt("maLTC"));
                controller.arrayListPhanCong.add(pc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Lấy mã ltc khi biết 3 thuộc tính maHK, tenMH, maLop
    public static int getMaLTC(String maHK, String tenMH, String maLop) throws ClassNotFoundException {
        String sqlQuery = "SELECT maLopTC FROM LOPTINCHI WHERE maHK = ? AND maMH IN (SELECT maMH from MONHOC where tenMH = ?) AND maLop = ?";

        int maLTC = -1;
        try {
            createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlQuery);
            ps.setString(1, maHK);
            ps.setString(2, tenMH);
            ps.setString(3, maLop);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                maLTC = rs.getInt("maLopTC");
            }
            DataConnection.connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }

        return maLTC;
    }

    public static String getMaGV(JComboBox<String> comboBoxGV) {
        String selectedGiangVien = (String) comboBoxGV.getSelectedItem();
        String[] parts = selectedGiangVien.split("-");
        String maGV = parts[0];
        return maGV;
    }

    //lọc danh sách phân công theo lớp
    public static void filterTablePhanCongBySth(JComboBox<String> mainComboBox, String columnName) {
        try {
            try {
                createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "SELECT maLopTC, maHK, tenMH, LTC.maLop, PC.maGV, CONCAT(hoGV, ' ', tenLotGV, ' ', tenGV) AS hoTen, huyLop "
                    + "FROM LOPTINCHI LTC "
                    + "JOIN MONHOC MH ON MH.maMH = LTC.maMH "
                    + "JOIN PHANCONG PC ON PC.maLTC = LTC.maLopTC "
                    + "JOIN GIANGVIEN GV ON GV.maGV = PC.maGV "
                    + "WHERE " + columnName + "=?";

            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, (String) mainComboBox.getSelectedItem());

                ResultSet resultSet = preparedStatement.executeQuery();
                controller.arrayListPhanCong.clear();
                while (resultSet.next()) {
                    PhanCong pc = new PhanCong(
                            resultSet.getString("maGV").trim(),
                            resultSet.getInt("maLopTC")
                    );
                    controller.arrayListPhanCong.add(pc);
                }
            }

            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> loadQuyenByNND(String maNND) {
        ArrayList<String> quyen = new ArrayList<String>();
        try {
            try {
                createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "SELECT * FROM NHOMNGUOIDANGNHAP NNDN "
                    + "JOIN PHANQUYEN PQ ON NNDN.maNhomNguoiDung = PQ.maNhomNguoiDung "
                    + "JOIN CHUCNANG CN ON CN.id = PQ.maChucNang "
                    + "WHERE NNDN.maNhomNguoiDung = ?";

            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                preparedStatement.setString(1, maNND);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    quyen.add(resultSet.getString("tenManHinh").trim());
                }
            }

            DataConnection.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quyen;
    }

    public LoadDatabase() {
//        Controller.controller.arrayListNganh.removeAll(Controller.controller.arrayListNganh);
//        loadTableGiangVien();
    }

}
