package Controller;

import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoadDatabase {
    public static void loadTableMonHoc(){
        ResultSet rs = DataConnection.retrieveData("select * from MONHOC");
        try{
            while(rs.next()){
                MonHoc mh = new MonHoc(
                    rs.getString("maMH").trim(),
                    rs.getString("tenMH").trim(),
                    rs.getInt("stclt"),
                    rs.getInt("stcth"),
                    rs.getString("phanLoai").trim(),
                    rs.getString("khoa").trim());
                controller.arrayListMonHoc.add(mh);
            }
        }
        catch(SQLException e){
        }
    }

    public LoadDatabase() {
        loadTableMonHoc();
    }
    
    
}
