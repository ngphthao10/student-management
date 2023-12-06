package Controller;


import Model.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateData {
    
    public static boolean updateMonHoc(MonHoc mh, String maMonHoc) throws ClassNotFoundException {
        String sqlCommand = "update MONHOC set maMH=?, tenMH=?, stclt=?, stcth=?, phanLoai=?, khoa=? WHERE maMH = ?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, mh.getMaMH());
            ps.setString(2, mh.getTenMH());
            ps.setInt(3, mh.getStclt());
            ps.setInt(4, mh.getStcth());
            ps.setString(5, mh.getPhanLoai());
            ps.setString(6, mh.getKhoa());
            ps.setString(7, maMonHoc);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa môn học thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean updateSinhVien(String maSV, SinhVien sv) throws ClassNotFoundException {
        String sqlCommand = "update SINHVIEN set maSV = ?, hoSV = ?, tenlotSV = ?, tenSV = ?, phai = ?, ngaySinh = ?, email = ?, sdt = ?, maLop = ?, namNhapHoc = ?, trangThai = ? WHERE maSV = ?";
        try {
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
            ps.setString(12, maSV);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Sửa môn học thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa môn học thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean updateKhoa(Khoa khoa, String maKhoa) throws ClassNotFoundException {
        String sqlCommand = "update KHOA set maKhoa=?, tenKhoa=?, sdt=?, trgKhoa=?, ngayNhanChuc=? WHERE maKhoa = ?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, khoa.getMaKhoa());
            ps.setString(2, khoa.getTenKhoa());
            ps.setString(3, khoa.getSdt());
            ps.setString(4, khoa.getTrgKhoa());
            ps.setDate(5, new java.sql.Date(khoa.getNgayNhanChuc().getTime()));
            ps.setString(6, maKhoa);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa khoa thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean updateNganh(Nganh nganh, String maNganh) throws ClassNotFoundException {
        String sqlCommand = "update NGANH set maNganh=?, tenNganh=?, maKhoa=? where maNganh = ?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nganh.getMaNganh());
            ps.setString(2, nganh.getTenNganh());
            ps.setString(3, nganh.getKhoa());
            ps.setString(4, maNganh);
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa ngành thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean updateGiangVien(GiangVien gv, String maGVien) throws ClassNotFoundException {
        String sqlCommand = "update GIANGVIEN set maGV=?, hoGV=?, tenLotGV=?, tenGV=?, phai=?, ngaySinh=?, maKhoa=?, ngayBD=?, email=?"
                + ", ngayKT=?, trangThai=?, hinhAnh=? where maGV=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, gv.getMaGV());
            ps.setString(2, gv.getHoGV());
            ps.setString(3, gv.getTenlotGV());
            ps.setString(4, gv.getTenGV());
            ps.setString(5, gv.getPhai());
            ps.setDate(6, new java.sql.Date (gv.getNgaySinh().getTime()));
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
            ps.setString(13, maGVien);
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa giảng viên thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
