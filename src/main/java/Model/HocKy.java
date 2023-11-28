/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class HocKy {
    
    private String maHK;
    private int hocKy;
    private String nienKhoa;
    
    public HocKy() {
        this.maHK = "";
        this.hocKy = 0;
        this.nienKhoa = "";
    }

    public HocKy(String maHK, int hocKy, String nienKhoa) {
        this.maHK = maHK;
        this.hocKy = hocKy;
        this.nienKhoa = nienKhoa;
    }

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }
    
    
    
}
