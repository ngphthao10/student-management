/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class NhomNguoiDangNhap {
    
    private int maNDN;
    private String chucVu;
    
    public NhomNguoiDangNhap() {
        this.maNDN = 0;
        this.chucVu = "";
    }

    public NhomNguoiDangNhap(int maNDN, String chucVu) {
        this.maNDN = maNDN;
        this.chucVu = chucVu;
    }

    public int getMaNDN() {
        return maNDN;
    }

    public void setMaNDN(int maNDN) {
        this.maNDN = maNDN;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    
}
