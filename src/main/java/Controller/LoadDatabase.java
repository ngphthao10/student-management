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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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

    public static ArrayList<String> getNganh_KhoafromMaLop(String maLop) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT tenNganh, tenKhoa FROM NGANH\n" +
                                "JOIN LOP ON NGANH.maNganh = LOP.maNganh\n" +
                                "JOIN KHOA ON KHOA.maKhoa = NGANH.maKhoa\n" +
                                "WHERE maLop = ?";
            ArrayList<String> list = new ArrayList<String>();
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maLop);

                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while (resultSet.next()) {
                        list.add(resultSet.getString("tenNganh"));
                        list.add(resultSet.getString("tenKhoa"));
                        DataConnection.connection.close();
                        return list;
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

    public static void fillSubComboMonHoc(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT tenMH FROM MONHOC WHERE khoa IN (SELECT maKhoa FROM KHOA WHERE tenKhoa = ?)";
            try(PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String tenMH = resultSet.getString("tenMH");
                        subComboBox.addItem(tenMH);
                    }
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableLopTinChi(String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT * FROM LOPTINCHI WHERE maMH IN (SELECT maMH FROM MONHOC JOIN KHOA ON khoa = maKhoa WHERE tenKhoa = ?)";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    controller.arrayListLopTinChi.clear();
                    while(resultSet.next()) {
                        LopTinChi ltc;
                        ltc = new LopTinChi(
                                resultSet.getInt("maLopTC"), resultSet.getString("maMH"), resultSet.getString("maHK"),
                                resultSet.getString("maLop"), resultSet.getInt("nhom"), resultSet.getInt("svMin"),
                                resultSet.getInt("svMax"), resultSet.getBoolean("huyLop")
                        );
                        controller.arrayListLopTinChi.add(ltc);
                    }
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static String getTenMH(String maMH) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT tenMH FROM MONHOC WHERE maMH = ?";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maMH);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String tenMH = resultSet.getString("tenMH");
                        DataConnection.connection.close();
                        return tenMH;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Không tìm thấy mã môn học!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getTenKhoaFromMaKhoa(String maKhoa) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT tenKhoa FROM KHOA WHERE maKhoa = ?";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maKhoa);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String tenKhoa = resultSet.getString("tenKhoa");
                        DataConnection.connection.close();
                        return tenKhoa;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void fillSubComboLopFromKhoa(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT maLop FROM LOP WHERE maNganh IN (SELECT maNganh FROM NGANH JOIN KHOA ON KHOA.maKhoa = NGANH.maKhoa WHERE tenKhoa = ?)";
            try(PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1, selectedValue);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
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
    
    public static void fillDistinctComboBox(JComboBox<String> comboBox, String column, String tableName) {
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

    
    public static int getMaLTC() throws ClassNotFoundException {
        ResultSet rs = DataConnection.retrieveData("SELECT MAX(maLopTC) FROM LOPTINCHI");
        int maLopTC = 0;
        
        try {
            while(rs.next()) {
                maLopTC = rs.getInt(1);
                ++maLopTC;
            }
            rs.close();
            return maLopTC;
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return -1;
    }
    
    public static String getColumnFromMonHoc(String value, String selectColumn, String column) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT " + selectColumn + " FROM MONHOC WHERE " + column + " = ?";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, value);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String result = resultSet.getString(1);
                        DataConnection.connection.close();
                        return result;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Tên môn học không tồn tại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getTenGiangVienFromLTC(int maLTC) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "select CONCAT(hoGV, ' ', tenlotGV, ' ', tenGV) from giangvien where maGV = (select maGV from phancong where maLTC = ?)";
            try (PreparedStatement ps = DataConnection.connection.prepareCall(query)) {
                ps.setInt(1, maLTC);
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        String hotenGV = rs.getString(1);
                        DataConnection.connection.close();
                        return hotenGV;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lớp tín chỉ hiện chưa được phân công!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static void loadTableDSSVDK(int maLTC) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT * FROM DANGKY WHERE maLTC = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setInt(1, maLTC);
                try (ResultSet rs = ps.executeQuery()) {
                    controller.arrayListDangKy.clear();
                    while(rs.next()) {
                        DangKy dk = new DangKy(
                            rs.getString("maSV"), rs.getInt("maLTC")
                        );
                        controller.arrayListDangKy.add(dk);
                    }
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void fillSubComboBoxMaLTC(JComboBox<String> comboBox, String tenKhoa) throws ClassNotFoundException {
        try {
            String query = "SELECT maLopTC FROM LOPTINCHI WHERE maMH IN (SELECT maMH FROM MONHOC JOIN KHOA ON khoa = maKhoa WHERE tenKhoa = ?)";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, tenKhoa);
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        String maLTC = String.valueOf(rs.getInt("maLopTC"));
                        comboBox.addItem(maLTC);
                    }
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableDangKy() {
        try {
            ResultSet rs = DataConnection.retrieveData("SELECT * FROM DANGKY");
            controller.arrayListDangKy.clear();
            while(rs.next()) {
                DangKy dk = new DangKy(rs.getString("maSV"), rs.getInt("maLTC"));
                controller.arrayListDangKy.add(dk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
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
                query = "SELECT maLopTC, maHK, tenMH, LTC.maLop, ltc.Nhom, PC.maGV, CONCAT(hoGV, ' ', tenLotGV, ' ', tenGV) AS hoTen, huyLop "
                        + "FROM LOPTINCHI LTC "
                        + "JOIN MONHOC MH ON MH.maMH = LTC.maMH "
                        + "JOIN PHANCONG PC ON PC.maLTC = LTC.maLopTC "
                        + "JOIN GIANGVIEN GV ON GV.maGV = PC.maGV "
                        + "WHERE MH.khoa IN (SELECT maKhoa from khoa where tenKhoa = ?)";
            } else {
                query = "SELECT maLopTC, maHK, tenMH, LTC.maLop, ltc.Nhom, PC.maGV, CONCAT(hoGV, ' ', tenLotGV, ' ', tenGV) AS hoTen, huyLop "
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
    
//    public static void getPhanCong(int maLTC) throws ClassNotFoundException {
//        try {
//            createStatement();
//            String query = "SELECT * FROM PHANCONG WHERE maLTC = ?";
//            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
//                ps.setInt(1, maLTC);
//                controller.
//                try (ResultSet rs = ps.executeQuery()) {
//                    while(rs.next()) {
//                        PhanCong pc = new PhanCong();
//                        pc.setMaLTC(rs.getInt("maLTC"));
//                        pc.setMaGV(rs.getString("maGV"));
//                        controller.arrayListPhanCong.add(pc);
//                        DataConnection.connection.close();
//                    }
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    //Lấy mã ltc khi biết 3 thuộc tính maHK, tenMH, maLop
    public static int getMaLTC(String maHK, String tenMH, String maLop, int nhom) throws ClassNotFoundException {
        String sqlQuery = "SELECT maLopTC FROM LOPTINCHI WHERE maHK = ? AND maMH IN (SELECT maMH from MONHOC where tenMH = ?) AND maLop = ? AND nhom=?";

        int maLTC = -1;
        try {
            createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlQuery);
            ps.setString(1, maHK);
            ps.setString(2, tenMH);
            ps.setString(3, maLop);
            ps.setInt(4, nhom);
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

    //lấy maHK khi biết học kỳ và niên khóa
    public static String getMaHK (JComboBox<String> ComboBox1, JComboBox<String> ComboBox2) throws ClassNotFoundException {
        String hocKy = (String) ComboBox1.getSelectedItem();
        String nienKhoa = (String) ComboBox2.getSelectedItem();
        if (hocKy == null || nienKhoa == null) {
            return null;
        }
        try {
            createStatement();
            String sqlQuery = "SELECT maHK FROM HOCKY WHERE hocKy = ? AND nienKhoa = ?";
            String maHK = "000";

            try(PreparedStatement ps = DataConnection.connection.prepareStatement(sqlQuery)){
                ps.setString(1, hocKy);
                ps.setString(2, nienKhoa);
                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        maHK = rs.getString("maHK");
                    }
                }
                DataConnection.connection.close();
            }
           return maHK;
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static void loadTableChiTietBangDiemHocKy(String MaSV, String MaHK) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT * FROM CHITIETBANGDIEMHOCKY WHERE CHITIETBANGDIEMHOCKY.maBD = (SELECT BANGDIEMHOCKY.maBD FROM BANGDIEMHOCKY WHERE BANGDIEMHOCKY.maSV = ? AND BANGDIEMHOCKY.maHK = ?)";
            try(PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1, MaSV);
                ps.setString(2, MaHK);
                try(ResultSet rs = ps.executeQuery()) {
                    controller.arrayListChiTietBangDiemHocKy.clear();
                    while(rs.next()){
                        ChiTietBangDiemHocKy ctbdhk;
                        ctbdhk = new ChiTietBangDiemHocKy(
                                rs.getString("maBD"), 
                                rs.getInt("maLTC"), 
                                rs.getFloat("diem"), 
                                rs.getString("ketQua")
                        );
                        controller.arrayListChiTietBangDiemHocKy.add(ctbdhk);
                    }
                }
            DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableChiTietBangDiemHocKy(String maBD, int maLTC) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT * FROM CHITIETBANGDIEMHOCKY WHERE maBD = ? AND maLTC = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maBD);
                ps.setInt(2, maLTC);
                ResultSet rs = ps.executeQuery();
                controller.arrayListChiTietBangDiemHocKy.clear();
                
                while(rs.next()) {
                    ChiTietBangDiemHocKy ctbdhk = new ChiTietBangDiemHocKy(
                        rs.getString("maBD"), rs.getInt("maLTC"), rs.getFloat("diem"), rs.getString("ketQua")
                    );
                    controller.arrayListChiTietBangDiemHocKy.add(ctbdhk);
                }
                DataConnection.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getMaMHfromMaLTC(int maLTC) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT maMH FROM LOPTINCHI WHERE maLopTC = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setInt(1, maLTC);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String maMH = rs.getString("maMH");
                        DataConnection.connection.close();
                        return maMH;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Không tìm thấy mã lớp tín chỉ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static int getSTCLTfromMaMH(String maMH) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT STCLT FROM MONHOC WHERE maMH = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maMH);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        int STCLT = rs.getInt("STCLT");
                        DataConnection.connection.close();
                        return STCLT;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Chưa có thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
    
    public static int getSTCTHfromMaMH(String maMH) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT STCTH FROM MONHOC WHERE maMH = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maMH);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        int STCTH = rs.getInt("STCTH");
                        DataConnection.connection.close();
                        return STCTH;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Chưa có thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
    
    public static Float getDiemTB(String maBD) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT diemTB FROM BANGDIEMHOCKY WHERE maBD = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maBD);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        Float diemTB = rs.getFloat("diemTB");
                        DataConnection.connection.close();
                        return diemTB;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Chưa có thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return 0.0f;
    }
    
    public static String getXepLoai(String maBD) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT xeploai FROM BANGDIEMHOCKY WHERE maBD = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maBD);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        String xeploai = rs.getString("xeploai");
                        DataConnection.connection.close();
                        return xeploai;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Chưa có thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getTenGVfromMaGV(String MaGV) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT CONCAT(hoGV, ' ', tenlotGV, ' ', tenGV) AS hoTenGV FROM GIANGVIEN WHERE maGV = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1, MaGV);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String hoTenGV = rs.getString("hoTenGV");
                        DataConnection.connection.close();
                        return hoTenGV;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getTenKhoafromMaGV(String MaGV) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT tenKhoa FROM KHOA INNER JOIN GIANGVIEN ON KHOA.maKhoa = GIANGVIEN.maKhoa WHERE maGV = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1, MaGV);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String tenKhoa = rs.getString("tenKhoa");
                        DataConnection.connection.close();
                        return tenKhoa;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Xin vui lòng kiểm tra lại mã giảng viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static void fillcbbTenMH(JComboBox<String> ComboBox, String MaGV, String MaHK) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT tenMH FROM MONHOC \n" +
                    "INNER JOIN LOPTINCHI ON MONHOC.maMH = LOPTINCHI.maMH \n" +
                    "INNER JOIN PHANCONG ON PHANCONG.maLTC = LOPTINCHI.maLopTC \n" +
                    "WHERE PHANCONG.maGV = ? AND LOPTINCHI.maHK = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1, MaGV);
                ps.setString(2, MaHK);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String tenMH = rs.getString("tenMH");
                        ComboBox.addItem(tenMH);
                    }
                    DataConnection.connection.close();
                }
            }
        }   catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getMaMHfromTenMH(String TenMH) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT maMH FROM MONHOC WHERE tenMH = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1,TenMH);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String maMH = rs.getString("maMH");
                        DataConnection.connection.close();
                        return maMH;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Không tìm thấy tên môn học!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static void fillcbbNhom(JComboBox<String> ComboBox, String MaGV, String MaHK, String MaMH) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT nhom FROM LOPTINCHI INNER JOIN PHANCONG ON PHANCONG.maLTC = LOPTINCHI.maLopTC\n" +
                            "WHERE PHANCONG.maGV = ? AND LOPTINCHI.maHK = ? AND LOPTINCHI.maMH = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1, MaGV);
                ps.setString(2, MaHK);
                ps.setString(3, MaMH);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        int nhom = rs.getInt("nhom");
                        ComboBox.addItem(String.valueOf(nhom));
                    }
                    DataConnection.connection.close();
                }
            }
        }   catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getMaLTC(String MaMH, String maHK, int nhom) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT maLopTC FROM LOPTINCHI WHERE maMH = ? AND maHK = ? AND nhom = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1,MaMH);
                ps.setString(2,maHK);
                ps.setInt(3,nhom);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        int MaLTC = rs.getInt("MaLopTC");
                        DataConnection.connection.close();
                        return MaLTC;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy lớp tín chỉ!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
    
    public static String getMaSVfromMaLTC(String MaLTC) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT maSV FROM BANGDIEMHOCKY WHERE maBD IN (SELECT maBD FROM CHITIETBANGDIEMHOCKY WHERE maLTC = ?)";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1,MaLTC);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String maSV = rs.getString("maSV");
                        DataConnection.connection.close();
                        return maSV;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy sinh viên nào!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getHotenSVfromMaSV(String MaSV) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT CONCAT(hoSV, ' ', tenlotSV, ' ', tenSV) AS hotenSV FROM SINHVIEN WHERE maSV = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1,MaSV);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        String tenSV = rs.getString("hotenSV");
                        DataConnection.connection.close();
                        return tenSV;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Không tìm thấy sinh viên!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static int getSTCTLTongKet(String maSV) throws ClassNotFoundException{
        try {
            createStatement();
            String query = "SELECT COALESCE(SUM(mh.stclt), 0) + COALESCE(SUM(mh.stcth), 0) AS stctl\n" +
                            "FROM BANGDIEMHOCKY bdhk\n" +
                            "LEFT JOIN CHITIETBANGDIEMHOCKY ctbd ON bdhk.maBD = ctbd.maBD\n" +
                            "LEFT JOIN LOPTINCHI lt ON ctbd.maLTC = lt.maLopTC\n" +
                            "LEFT JOIN MONHOC mh ON lt.maMH = mh.maMH\n" +
                            "GROUP BY bdhk.maSV, ctbd.ketQua\n" +
                            "HAVING bdhk.maSV = ? AND ctbd.ketQua = N'Đạt'";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)){
                ps.setString(1,maSV);
                try (ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        int STCTL = rs.getInt("stctl");
                        DataConnection.connection.close();
                        return STCTL;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "Chưa có thông tin!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
    
    public static int getSTCTLHocKy(String maBD) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT COALESCE(SUM(stclt), 0) + COALESCE(SUM(stcth), 0)\n" +
                            "FROM CHITIETBANGDIEMHOCKY\n" +
                            "LEFT JOIN LOPTINCHI ON LOPTINCHI.maLopTC = CHITIETBANGDIEMHOCKY.maLTC\n" +
                            "LEFT JOIN MONHOC ON MONHOC.maMH = LOPTINCHI.maMH\n" +
                            "WHERE maBD = ? AND CHITIETBANGDIEMHOCKY.ketQua = N'Đạt'";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maBD);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int soTCTLHocKy = rs.getInt(1);
                    DataConnection.connection.close();
                    return soTCTLHocKy;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy giá trị số tín chỉ tích lũy học kỳ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return -1;
    }
    
    public static void loadTableSinhVien() {
        ResultSet rs = DataConnection.retrieveData("SELECT * FROM SINHVIEN");

        try {
            controller.arrayListSinhVien.clear();
            while (rs.next()) {
                String hanh = "";
                if (rs.getString("hinhAnh") != null) {
                    hanh = rs.getString("hinhAnh").trim();
                }

                SinhVien sv = new SinhVien(
                        rs.getString("maSV").trim(),
                        rs.getString("hoSV").trim(),
                        rs.getString("tenLotSV").trim(),
                        rs.getString("tenSV").trim(),
                        rs.getString("phai").trim(),
                        rs.getDate("ngaySinh"),
                        rs.getString("email").trim(),
                        rs.getString("sdt"),
                        rs.getString("maLop").trim(),
                        rs.getInt("namNhapHoc"),
                        rs.getString("trangThai").trim(),
                        hanh
                );

                controller.arrayListSinhVien.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableBangDiemHocKy() {
        ResultSet rs = DataConnection.retrieveData("SELECT * FROM BANGDIEMHOCKY");
        try {
            while (rs.next()) {
                BangDiemHocKy bdhk = new BangDiemHocKy(
                        rs.getString("maBD").trim(),
                        rs.getString("maSV").trim(),
                        rs.getString("maHK").trim(),
                        rs.getFloat("diemTB"),
                        rs.getString("xeploai").trim());
                controller.arrayListBangDiemHocKy.add(bdhk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableChiTietBangDiemHocKy(int MaLTC) throws ClassNotFoundException {
        try {
            createStatement();
            if (MaLTC == 0) {
                return;
            }
            String query = "SELECT ctbd.maBD, maLTC, bdhk.maSV, CONCAT(hoSV, ' ', tenlotSV, ' ', tenSV) AS hoTenSV, diem, ketQua FROM CHITIETBANGDIEMHOCKY ctbd " +
                    "JOIN BANGDIEMHOCKY bdhk ON ctbd.maBD = bdhk.maBD " +
                    "JOIN SINHVIEN sv ON bdhk.maSV = sv.maSV " +
                    "WHERE maLTC = ?";
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {           
                ps.setInt(1, MaLTC);
                ResultSet rs = ps.executeQuery();
                controller.arrayListChiTietBangDiemHocKy.clear();
                while (rs.next()) {
                    ChiTietBangDiemHocKy ctbd = new ChiTietBangDiemHocKy(
                            rs.getString("maBD"),
                            rs.getInt("maLTC"),
                            rs.getFloat("diem"), 
                            rs.getString("ketQua")
                    );
                    controller.arrayListChiTietBangDiemHocKy.add(ctbd);
                }
            }
            DataConnection.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static float getDiemTBTongKet(String maSV) throws ClassNotFoundException {
        try {
            String query = "SELECT ROUND(SUM(diem * (stcth + stclt)) / ?, 1) FROM MONHOC\n" +
                            "JOIN LOPTINCHI ON MONHOC.maMH = LOPTINCHI.maMH\n" +
                            "JOIN CHITIETBANGDIEMHOCKY ON LOPTINCHI.maLopTC = CHITIETBANGDIEMHOCKY.maLTC\n" +
                            "JOIN BANGDIEMHOCKY ON BANGDIEMHOCKY.maBD = CHITIETBANGDIEMHOCKY.maBD\n" +
                            "WHERE maSV = ? AND CHITIETBANGDIEMHOCKY.ketQua = N'Đạt';";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setInt(1, LoadDatabase.getSTCTLTongKet(maSV));
                ps.setString(2, maSV);
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    float diemTB = rs.getFloat(1);
                    DataConnection.connection.close();
                    return diemTB;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu số tín chỉ tích lũy tổng kết!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return -1;
    }
    
    public static float getDiemTBHocKy(String maBD) throws ClassNotFoundException {
        try {
            String query = "SELECT ROUND(SUM(diem * (stcth + stclt)) / ?, 1) FROM MONHOC\n" +
                    "JOIN LOPTINCHI ON MONHOC.maMH = LOPTINCHI.maMH\n" +
                    "JOIN CHITIETBANGDIEMHOCKY ON LOPTINCHI.maLopTC = CHITIETBANGDIEMHOCKY.maLTC\n" +
                    "WHERE maBD = ? AND CHITIETBANGDIEMHOCKY.ketQua = N'Đạt'";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setInt(1, LoadDatabase.getSTCTLHocKy(maBD));
                ps.setString(2, maBD);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    float diemTBHocKy = rs.getFloat(1);
                    DataConnection.connection.close();
                    return diemTBHocKy;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu số tín chỉ tích lũy học kỳ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return -1;
    }
    
    public static String getMaBD(String maHK, String maSV) throws ClassNotFoundException {
        try {
            String query = "SELECT DISTINCT maBD FROM BANGDIEMHOCKY JOIN DANGKY ON BANGDIEMHOCKY.maSV = DANGKY.maSV\n" +
                    "JOIN LOPTINCHI ON DANGKY.maLTC = LOPTINCHI.maLopTC\n" +
                    "WHERE BANGDIEMHOCKY.maHK = ? AND BANGDIEMHOCKY.maSV = ?";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maHK);
                ps.setString(2, maSV);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String maBD = rs.getString("maBD");
                    DataConnection.connection.close();
                    return maBD;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy mã bảng điểm!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getMaHKFROMmaLTC(int maLTC) throws ClassNotFoundException {
        try {
            String query = "SELECT maHK FROM LOPTINCHI WHERE maLopTC = ?";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setInt(1, maLTC);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    String maHK = rs.getString("maHK");
                    DataConnection.connection.close();
                    return maHK;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy mã học kỳ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getMaBD(int maLTC, String maSV) throws ClassNotFoundException {
        try {
            String query = "SELECT maBD FROM BANGDIEMHOCKY\n" +
                            "WHERE maSV = ?\n" +
                            "AND maHK IN (SELECT maHK FROM LOPTINCHI WHERE maLopTC = ?)";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maSV);
                ps.setInt(2, maLTC);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    String maBD = rs.getString("maBD");
                    DataConnection.connection.close();
                    return maBD;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy mã bảng điểm!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static String getMaHK(String maBD) throws ClassNotFoundException {
        try {
            String query = "SELECT maHK FROM BANGDIEMHOCKY WHERE maBD = ?";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setString(1, maBD);
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    String maHK = rs.getString("maHK");
                    DataConnection.connection.close();
                    return maHK;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy mã học kỳ!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static void fillSubComboBoxLopForCB2(JComboBox<String> subCombobox) throws ClassNotFoundException {
        try {
            String query = "SELECT maLop FROM LOP";
            ResultSet rs = DataConnection.retrieveData(query);
            subCombobox.removeAllItems();
            while (rs.next()) {
                String maLop = rs.getString("maLop");
                subCombobox.addItem(maLop);
            }
            DataConnection.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static LopTinChi getLopTinChi(int maLTC) throws ClassNotFoundException {
        try {
            String query = "SELECT * FROM LOPTINCHI WHERE maLopTC = ?";
            createStatement();
            try (PreparedStatement ps = DataConnection.connection.prepareStatement(query)) {
                ps.setInt(1, maLTC);
                
                ResultSet resultSet = ps.executeQuery();
                while(resultSet.next()) {
                    LopTinChi ltc = new LopTinChi(
                                resultSet.getInt("maLopTC"), resultSet.getString("maMH"), resultSet.getString("maHK"),
                                resultSet.getString("maLop"), resultSet.getInt("nhom"), resultSet.getInt("svMin"),
                                resultSet.getInt("svMax"), resultSet.getBoolean("huyLop")
                        );
                    DataConnection.connection.close();
                    return ltc;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lớp tín chỉ không tồn tại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
