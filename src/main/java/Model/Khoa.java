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
public class Khoa {
    
    private String maKhoa;
    private String tenKhoa;
    private String sdt;
    private String trgKhoa;
    private Date ngayNhanChuc;
    
    public Khoa() {
        this.maKhoa = "";
        this.tenKhoa = "";
        this.sdt = "";
        this.trgKhoa = "";
        this.ngayNhanChuc = null;
    }

    public Khoa(String maKhoa, String tenKhoa, String sdt, String trgKhoa, Date ngayNhanChuc) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.sdt = sdt;
        this.trgKhoa = trgKhoa;
        this.ngayNhanChuc = ngayNhanChuc;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTrgKhoa() {
        return trgKhoa;
    }

    public void setTrgKhoa(String trgKhoa) {
        this.trgKhoa = trgKhoa;
    }

    public Date getNgayNhanChuc() {
        return ngayNhanChuc;
    }

    public void setNgayNhanChuc(Date ngayNhanChuc) {
        this.ngayNhanChuc = ngayNhanChuc;
    }
    
    
    
}
