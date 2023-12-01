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
}
