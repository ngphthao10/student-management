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
public class GiangVien {
    
    private String maGV;
    private String hoGV;
    private String tenlotGV;
    private String tenGV;
    private String phai;
    private Date ngaySinh;
    private String khoa;
    private Date ngBD;
    private String email;
    
    public GiangVien() {
        this.maGV = "";
        this.hoGV = "";
        this.tenlotGV = "";
        this.tenGV = "";
        this.phai = "";
        this.ngaySinh = null;
        this.khoa = "";
        this.ngBD = null;
        this.email = "";
    }

    public GiangVien(String maGV, String hoGV, String tenlotGV, String tenGV, String phai, Date ngaySinh, String khoa, Date ngBD, String email) {
        this.maGV = maGV;
        this.hoGV = hoGV;
        this.tenlotGV = tenlotGV;
        this.tenGV = tenGV;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.khoa = khoa;
        this.ngBD = ngBD;
        this.email = email;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoGV() {
        return hoGV;
    }

    public void setHoGV(String hoGV) {
        this.hoGV = hoGV;
    }

    public String getTenlotGV() {
        return tenlotGV;
    }

    public void setTenlotGV(String tenlotGV) {
        this.tenlotGV = tenlotGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public Date getNgBD() {
        return ngBD;
    }

    public void setNgBD(Date ngBD) {
        this.ngBD = ngBD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
