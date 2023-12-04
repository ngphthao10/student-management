package Controller;

import static Controller.DataConnection.createStatement;
import Controller.controller;
import Model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    public static void filterAndDisplayTableMonHoc(JComboBox<String> mainComboBox, JComboBox<String> subComboBox) throws ClassNotFoundException {
        try {
            createStatement();
            String selectedKhoa = (String) mainComboBox.getSelectedItem();
            String selectedNganh = (String) subComboBox.getSelectedItem();
            if (selectedKhoa == null || selectedNganh == null) {
                 return;
            }
            String query = "SELECT * FROM MONHOC " +
                            "JOIN NGANH ON NGANH.maKhoa = MONHOC.khoa "+
                            "JOIN KHOA ON KHOA.maKhoa = MONHOC.khoa " +
                            "WHERE tenkhoa  = ? and tenNganh = ?";
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
    public static void fillComboBox(JComboBox<String> comboBox, String column, String tableName){
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
    
    public static void fillSubComboBox(JComboBox<String> subComboBox, String selectedValue) throws ClassNotFoundException {
        try {
            createStatement();
            String query = "SELECT tenNganh FROM NGANH WHERE maKhoa IN (SELECT maKhoa from khoa where tenKhoa = ?)";
            try (PreparedStatement preparedStatement = DataConnection.connection.prepareStatement(query)) {
                // Gán giá trị cho tham số
                preparedStatement.setString(1, selectedValue);

                // Thực hiện truy vấn
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Thêm kết quả vào subComboBox
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
                        SinhVien sv = new SinhVien(maSV, hoSV, tenlotSV, tenSV, phai, ngaySinh, email, sdt, maLop, namNhapHoc, trangThai);
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
                        return maLop;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public LoadDatabase() {
        
    }
    
    
}
