/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Minh Thu
 */
public class SinhVien {
    
    private String maSV;
    private String hoSV;
    private String tenlotSV;
    private String tenSV;
    private String phai;
    private Date ngaySinh;
    private String email;
    private String sdt;
    private String maLop;
    private int namNhapHoc;
    private String trangThai;
    
    public SinhVien() {
        this.maSV = "";
        this.hoSV = "";
        this.tenlotSV = "";
        this.tenSV = "";
        this.phai = "";
        this.ngaySinh = null;
        this.email = "";
        this.sdt = "";
        this.maLop = "";
        this.namNhapHoc = 0;
        this.trangThai = "";
    }

    public SinhVien(String maSV, String hoSV, String tenlotSV, String tenSV, String phai, Date ngaySinh, String email, String sdt, String maLop, int namNhapHoc, String trangThai) {
        this.maSV = maSV;
        this.hoSV = hoSV;
        this.tenlotSV = tenlotSV;
        this.tenSV = tenSV;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.sdt = sdt;
        this.maLop = maLop;
        this.namNhapHoc = namNhapHoc;
        this.trangThai = trangThai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoSV() {
        return hoSV;
    }

    public void setHoSV(String hoSV) {
        this.hoSV = hoSV;
    }

    public String getTenlotSV() {
        return tenlotSV;
    }

    public void setTenlotSV(String tenlotSV) {
        this.tenlotSV = tenlotSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public Date getNamSinh() {
        return ngaySinh;
    }

    public void setNamSinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public int getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(int namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
