package Controller;


import Model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateData {
    
    public static boolean updateMonHoc(MonHoc mh) throws ClassNotFoundException {
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
            ps.setString(7, mh.getMaMH());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Sửa môn học thất bại!", "Báo lỗi", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
