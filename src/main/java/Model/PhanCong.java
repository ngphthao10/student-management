package Model;

import Controller.LoadDatabase;

public class PhanCong {
    GiangVien gv;
    LopTinChi ltc;
    MonHoc mh;
    private String maGV;
    private int maLTC;
    
    public PhanCong() {
        this.maGV = "";
        this.maLTC = 0;
    }

    public PhanCong(String maGV, int maLTC) {
        this.maGV = maGV;
        this.maLTC = maLTC;
        LoadDatabase.loadTableMonHoc();
        LoadDatabase.loadTableLopTinChi();
        LoadDatabase.loadTableGiangVien();
        for (GiangVien gv : Controller.controller.arrayListGiangVien) {
            if (gv.getMaGV().equals(this.maGV)) {
                this.gv = gv;
                break;
            }
        }
        for (LopTinChi ltc : Controller.controller.arrayListLopTinChi){
            if (ltc.getMaLopTC() == this.maLTC){
                this.ltc = ltc;
                break;
            }
        }
        for (MonHoc mh : Controller.controller.arrayListMonHoc){
            if (mh.getMaMH().equals(ltc.getMaMH())){
                this.mh = mh;
                break;
            }
        }
    }

    public int getNhomLtc(){
        return ltc.getNhom();
    }
    
    public Boolean isHuyLopLtc(){
        return ltc.isHuyLop();
    }
    
    public String getMaLopLtc(){
        return ltc.getMaLop();
    }
    
    public String getMaHKLtc() {
        return ltc.getMaHK();
    }

    public String getHoTenGV(){
        return gv.getHoGV() + " " + gv.getTenlotGV() + " " + gv.getTenGV();
    }

    public String getTenMH(){
        return mh.getTenMH();
    }
    
    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public int getMaLTC() {
        return maLTC;
    }

    public void setMaLTC(int maLTC) {
        this.maLTC = maLTC;
    }
    
}
