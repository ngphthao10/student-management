/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class LopTinChi {
    
    private int maLopTC;
    private String maMH;
    private String nienKhoa;
    private int hocKy;
    private int nhom;
    private int svMin;
    private int svMax;
    private boolean huyLop;
    
    public LopTinChi() {
        this.maLopTC = 0;
        this.maMH = "";
        this.nienKhoa = "";
        this.hocKy = 0;
        this.nhom = 0;
        this.svMin = -1;
        this.svMax = -1;
        this.huyLop = false;
    }

    public LopTinChi(int maLopTC, String maMH, String nienKhoa, int hocKy, int nhom, int svMin, int svMax, boolean huyLop) {
        this.maLopTC = maLopTC;
        this.maMH = maMH;
        this.nienKhoa = nienKhoa;
        this.hocKy = hocKy;
        this.nhom = nhom;
        this.svMin = svMin;
        this.svMax = svMax;
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

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
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
    
    
}
