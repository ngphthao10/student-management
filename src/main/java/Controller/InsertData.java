package Controller;

import Model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
}
