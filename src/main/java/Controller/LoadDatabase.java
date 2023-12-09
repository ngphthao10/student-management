package Controller;

import static Controller.DataConnection.createStatement;
import Controller.controller;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoadDatabase {
//    public static void loadTableMonHoc(){
//        ResultSet rs = DataConnection.retrieveData("select * from MONHOC");
//        try{
//            while(rs.next()){
//                MonHoc mh = new MonHoc(
//                    rs.getString("maMH").trim(),
//                    rs.getString("tenMH").trim(),
//                    rs.getInt("stclt"),
//                    rs.getInt("stcth"),
//                    rs.getString("phanLoai").trim(),
//                    rs.getString("khoa").trim());
//                controller.arrayListMonHoc.add(mh);
//            }
//        }
//        catch(SQLException e){
//        }
//    }

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
            ResultSet rs = DataConnection.retrieveData("select " + column + " from " + tableName);
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
        try{
            createStatement();
            String query = "SELECT tenLop FROM LOP WHERE maNganh IN (SELECT maNganh FROM NGANH WHERE tenNganh = ?)";
            try(PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1,selectedValue);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String tenLop = resultSet.getString("tenLop");
                        subComboBox.addItem(tenLop);
                    }
                }
                
                DataConnection.connection.close();
            }
        }   catch (SQLException ex) {
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
                
                try(ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
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
    
    public static String selectMalop(String tenLop) throws ClassNotFoundException {
        try {
            createStatement();
            String sqlCommand = "SELECT maLop FROM LOP WHERE tenLop = ?";
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, tenLop);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
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

    //lấy mã ngành khi biết tên ngành
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
                
                try(ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
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
                    while(resultSet.next()) {
                        Nganh nganh = new Nganh(
                                resultSet.getString("maNganh"), resultSet.getString("tenNganh"), resultSet.getString("maKhoa")
                        );
                        DataConnection.connection.close();
                        return nganh;
                    }
                }
            }
        }   catch (SQLException ex) {
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
                if(rs.getString("hinhAnh") != null){
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
    
    public static String getKhoafromMaNganh(String maNganh) {
        try {
            createStatement();
            String sqlCommand = "SELECT tenKhoa from KHOA WHERE maKhoa IN (SELECT maKhoa FROM NGANH WHERE maNganh = ?)";
            
            try (PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(sqlCommand)) {
                prepareStatement.setString(1, maNganh);
                
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void fillSubComboBoxMaLop(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try{
            createStatement();
            String query = "SELECT maLop FROM LOP WHERE maNganh IN (SELECT maNganh FROM NGANH WHERE tenNganh = ?)";
            try(PreparedStatement prepareStatement = DataConnection.connection.prepareStatement(query)) {
                prepareStatement.setString(1,selectedValue);
                
                try (ResultSet resultSet = prepareStatement.executeQuery()) {
                    while(resultSet.next()) {
                        String maLop = resultSet.getString("maLop");
                        subComboBox.addItem(maLop);
                    }
                }
                DataConnection.connection.close();
            }
        }   catch (SQLException ex) {
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
                        LopTinChi ltc = new LopTinChi(
                                resultSet.getInt("maLopTC"), resultSet.getString("maMH"), resultSet.getString("maHK"),
                                resultSet.getInt("nhom"), resultSet.getInt("svMin"), resultSet.getInt("svMax"), 
                                resultSet.getBoolean("huyLop"), resultSet.getString("maLop"), null
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
        JOptionPane.showMessageDialog(null, "Không tìm thấy mã môn học!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
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
        JOptionPane.showMessageDialog(null, "Không tồn tại mã lóp tín chỉ trên!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
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
    
    public LoadDatabase() {
//        Controller.controller.arrayListNganh.removeAll(Controller.controller.arrayListNganh);
//        loadTableGiangVien();
    }
    
    

}
