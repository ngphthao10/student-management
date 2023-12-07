package Model;

import Controller.LoadDatabase;
import java.util.ArrayList;
import java.util.List;

public class LopTinChi {
    
    private int maLopTC;
    private String maMH;
    private String maHK;
    private String maLop;
    private int nhom;
    private int svMin;
    private int svMax;
    private boolean huyLop;
    private List<DangKy> dssvdk;
    
    MonHoc mh;
    
    public LopTinChi() {
        this.maLopTC = 0;
        this.maMH = "";
        this.maHK = "";
        this.maLop = "";
        this.nhom = 0;
        this.svMin = -1;
        this.svMax = -1;
        this.dssvdk = new ArrayList<>();
        this.huyLop = false;
    }
    
    public LopTinChi(int maLopTC, String maMH, String maHK, String maLop, int nhom, int svMin, int svMax, boolean huyLop) {
        this.maLopTC = maLopTC;
        this.maMH = maMH;
        this.maHK = maHK;
        this.maLop = maLop;
        this.nhom = nhom;
        this.svMin = svMin;
        this.svMax = svMax;
        this.huyLop = huyLop;
    }
    
    public LopTinChi(int maLopTC, String maMH, String maHK, String maLop, int nhom, int svMin, int svMax, boolean huyLop, List<DangKy> dssvdk) {
        this.maLopTC = maLopTC;
        this.maMH = maMH;
        this.maHK = maHK;
        this.maLop = maLop;
        this.nhom = nhom;
        this.svMin = svMin;
        this.svMax = svMax;
        this.huyLop = huyLop;
        this.dssvdk = dssvdk;
    }
    
    public String getTenMH(){
        LoadDatabase.loadTableMonHoc();
        for (MonHoc mh : Controller.controller.arrayListMonHoc){
            if (mh.getMaMH().equals(this.maMH)){
                this.mh = mh;
                break;
            }
        }
        return mh.getTenMH();
    }
    
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
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

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public List<DangKy> getDssvdk() {
        return dssvdk;
    }

    public void setDssvdk(List<DangKy> dssvdk) {
        this.dssvdk = dssvdk;
    }
}
