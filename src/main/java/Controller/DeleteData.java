package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DeleteData {
    public static boolean deleteMonHoc(String MaMH) throws ClassNotFoundException {
        String sqlCommand = "delete from MONHOC where MaMH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaMH);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa môn học thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa môn học thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
        
    public static boolean deleteSinhVien(String maSV) throws ClassNotFoundException {
        try {
            String sqlCommand = "delete from SINHVIEN WHERE maSV = ?";
            
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maSV);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa môn học thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa môn học thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean deleteKhoa(String MaKhoa) throws ClassNotFoundException {
        String sqlCommand = "delete from khoa where MaKhoa=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaKhoa);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa khoa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa khoa thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean deleteNganh(String maNganh) throws ClassNotFoundException {
        String sqlCommand = "delete from nganh where maNganh=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maNganh);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa ngành thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa ngành thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean deleteGiangVien(String maGV) throws ClassNotFoundException {
        String sqlCommand = "delete from GIANGVIEN where maGV=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maGV);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa giảng viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa giảng viên thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean deletePhanCong(int maLTC) throws ClassNotFoundException {
        String sqlCommand = "delete from PHANCONG where maLTC=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, maLTC);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Xóa phân công thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa phân công thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
