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
public class LopTinChi {
    
    private int maLopTC;
    private String maMH;
    private int maHK;
    private int nhom;
    private int svMin;
    private int svMax;
    private boolean huyLop;
    private List<DangKy> dssvdk;
    
    public LopTinChi() {
        this.maLopTC = 0;
        this.maMH = "";
        this.maHK = 0;
        this.nhom = 0;
        this.svMin = -1;
        this.svMax = -1;
        this.dssvdk = new ArrayList<>();
        this.huyLop = false;
    }

    public LopTinChi(int maLopTC, String maMH, int maHK, int nhom, int svMin, int svMax, List<DangKy> dssvdk, boolean huyLop) {
        this.maLopTC = maLopTC;
        this.maMH = maMH;
        this.maHK = maHK;
        this.nhom = nhom;
        this.svMin = svMin;
        this.svMax = svMax;
        this.dssvdk = dssvdk;
        this.huyLop = huyLop;
    }

    public int getMaLopTC() {
        return maLopTC;
    }

    public void setMaLopTC(int maLopTC) {
        this.maLopTC = maLopTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public int getSvMin() {
        return svMin;
    }

    public void setSvMin(int svMin) {
        this.svMin = svMin;
    }

    public int getSvMax() {
        return svMax;
    }

    public void setSvMax(int svMax) {
        this.svMax = svMax;
    }

    public boolean isHuyLop() {
        return huyLop;
    }

    public void setHuyLop(boolean huyLop) {
        this.huyLop = huyLop;
    }

    public int getMaHK() {
        return maHK;
    }

    public void setMaHK(int maHK) {
        this.maHK = maHK;
    }

    public List<DangKy> getDssvdk() {
        return dssvdk;
    }

    public void setDssvdk(List<DangKy> dssvdk) {
        this.dssvdk = dssvdk;
    }
}
