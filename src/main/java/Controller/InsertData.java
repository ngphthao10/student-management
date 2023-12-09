package Controller;

import Model.*;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class InsertData {
    public static boolean insertMonHoc(MonHoc mh) throws ClassNotFoundException {
        String sqlCommand = "INSERT INTO MONHOC VALUES(?, ?, ?, ?, ?, ?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, mh.getMaMH());
            ps.setString(2, mh.getTenMH());
            ps.setInt(3, mh.getStclt());
            ps.setInt(4, mh.getStcth());
            ps.setString(5, mh.getPhanLoai());
            ps.setString(6, mh.getKhoa());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm môn học thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm môn học thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean insertSinhVien(SinhVien sv) throws ClassNotFoundException {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String sqlCommand = "INSERT INTO SINHVIEN VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoSV());
            ps.setString(3, sv.getTenlotSV());
            ps.setString(4, sv.getTenSV());
            ps.setString(5, sv.getPhai());
            ps.setDate(6, new java.sql.Date(sv.getNgaySinh().getTime()));
            ps.setString(7, sv.getEmail());
            ps.setString(8, sv.getSdt());
            ps.setString(9, sv.getMaLop());
            ps.setInt(10, sv.getNamNhapHoc());
            ps.setString(11, sv.getTrangThai());
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sinh viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm sinh viên thất bại!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }

    public static boolean insertKhoa(Khoa khoa) throws ClassNotFoundException {
        String sqlCommand = "INSERT INTO KHOA VALUES(?, ?, ?, ?, ?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, khoa.getMaKhoa());
            ps.setString(2, khoa.getTenKhoa());
            ps.setString(3, khoa.getSdt());
            ps.setString(4, khoa.getTrgKhoa());
            ps.setDate(5, new java.sql.Date(khoa.getNgayNhanChuc().getTime()));
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm khoa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm khoa thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean insertNganh(Nganh nganh) throws ClassNotFoundException {
        String sqlCommand = "INSERT INTO NGANH (maNganh, tenNganh, maKhoa) VALUES(?, ?, ?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nganh.getMaNganh());
            ps.setString(2, nganh.getTenNganh());
            ps.setString(3, nganh.getKhoa());  
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm ngành thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm ngành thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
     public static boolean insertGiangVien(GiangVien gv) throws ClassNotFoundException {
        String sqlCommand = "INSERT INTO GIANGVIEN (maGV, hoGV, tenLotGV, tenGV, phai, ngaySinh, maKhoa, ngayBD, email, ngayKT, trangThai, hinhAnh) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, gv.getMaGV());
            ps.setString(2, gv.getHoGV());
            ps.setString(3, gv.getTenlotGV());  
            ps.setString(4, gv.getTenGV());  
            ps.setString(5, gv.getPhai());  
            ps.setDate(6,  new java.sql.Date(gv.getNgaySinh().getTime())); 
            ps.setString(7, gv.getKhoa()); 
            ps.setDate(8, new java.sql.Date(gv.getNgayBD().getTime())); 
            ps.setString(9, gv.getEmail()); 
            if(gv.getNgayKT() != null)
                ps.setDate(10, new java.sql.Date(gv.getNgayKT().getTime())); 
            else{
                ps.setString(10, null);
            }
            ps.setString(11, gv.getTrangThai()); 
            if(gv.getHinhAnh() != null){
                ps.setString(12, gv.getHinhAnh()); 
            }
            else{
                ps.setString(12, null);
            }
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm giảng viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm giảng viên thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
     
    public static boolean insertLopTinChi(LopTinChi ltc) throws ClassNotFoundException {
        try {
            String sqlCommand = "INSERT INTO LOPTINCHI VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ltc.getMaLopTC());
            ps.setString(2, ltc.getMaMH());
            ps.setString(3, ltc.getMaHK());
            ps.setInt(4, ltc.getNhom());
            ps.setInt(5, ltc.getSvMin());
            ps.setInt(6, ltc.getSvMax());
            ps.setBoolean(7, ltc.isHuyLop());
            ps.setString(8, ltc.getMaLop());
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm lớp tín chỉ thành công!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm lớp tín chỉ thất bại!!", "Thông báo",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean insertDangKy(DangKy dk) throws ClassNotFoundException {
        try {
            String sqlCommand = "INSERT INTO DANGKY VALUES (?, ?)";
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, dk.getMaSV());
            ps.setInt(2, dk.getMaLTC());
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Đăng ký thành công!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Đăng ký thất bại!!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
   
}
