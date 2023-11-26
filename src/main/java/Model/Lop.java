/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thu
 */
public class Lop {
    
    private String maLop;
    private String tenLop;
    private String nganh;
    private String khoa;
    private String coVan;
    private List dssvLop;

    public Lop() {
        this.maLop = "";
        this.tenLop = "";
        this.nganh = "";
        this.khoa = "";
        this.coVan = "";
        this.dssvLop = new ArrayList<>();
    }
    
    public Lop(String maLop, String tenLop, String nganh, String khoa, String coVan, List dssvLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.nganh = nganh;
        this.khoa = khoa;
        this.coVan = coVan;
        this.dssvLop = dssvLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getCoVan() {
        return coVan;
    }

    public void setCoVan(String coVan) {
        this.coVan = coVan;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public List getDssvLop() {
        return dssvLop;
    }

    public void setDssvLop(List dssvLop) {
        this.dssvLop = dssvLop;
    }
    
    
    
    
}
