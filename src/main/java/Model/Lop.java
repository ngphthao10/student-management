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
    private String coVan;
    private List<SinhVien> dssvLop;

    public Lop() {
        this.maLop = "";
        this.tenLop = "";
        this.nganh = "";
        this.coVan = "";
        this.dssvLop = new ArrayList<>();
    }
    
    public Lop(String maLop, String tenLop, String nganh, String khoa, String coVan, List<SinhVien> dssvLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.nganh = nganh;
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

    public List<SinhVien> getDssvLop() {
        return dssvLop;
    }

    public void setDssvLop(List<SinhVien> dssvLop) {
        this.dssvLop = dssvLop;
    }
    
    
    
    
}
