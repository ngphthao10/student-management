/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.LoadDatabase;

public class ChiTietBangDiemHocKy {
    
    private String maBD;
    private int maLTC;
    private float diem;
    private String ketQua;
    SinhVien sv;
    BangDiemHocKy bdhk;
    
    public ChiTietBangDiemHocKy() {
        this.maBD = "";
        this.maLTC = 0;
        this.diem = 0.0f;
        this.ketQua = "";
    }

    public ChiTietBangDiemHocKy(String maBD, int maLTC, float diem, String ketQua) {
        this.maBD = maBD;
        this.maLTC = maLTC;
        this.diem = diem;
        this.ketQua = ketQua;
        LoadDatabase.loadTableBangDiemHocKy();
        LoadDatabase.loadTableSinhVien();
        
        for (BangDiemHocKy bdhk : Controller.controller.arrayListBangDiemHocKy){
            if(bdhk.getMaBD().equals(this.maBD)){
                this.bdhk = bdhk;
                break;
            }
        }
        for (SinhVien svien : Controller.controller.arrayListSinhVien){
            if (svien.getMaSV().equals(bdhk.getMaSV())){
                this.sv = svien;
                break;
            }
        }
    }

    public String getMaBD() {
        return maBD;
    }

    public void setMaBD(String maBD) {
        this.maBD = maBD;
    }

    public int getMaLTC() {
        return maLTC;
    }

    public void setMaLTC(int maLTC) {
        this.maLTC = maLTC;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }
    
    public String getMaSV(){
        return sv.getMaSV();
    }
    
    public String getHoTenSV(){
        return sv.getHoSV() + " " + sv.getTenlotSV() + " " + sv.getTenSV();
    }
    
}
