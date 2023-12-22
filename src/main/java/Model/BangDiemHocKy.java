/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class BangDiemHocKy {
    
    private String maBD;
    private String maSV;
    private String maHK;
    private float diemTB;
    private String xepLoai;
    
    public BangDiemHocKy() {
        this.maBD = "";
        this.maSV = "";
        this.maHK = "";
        this.diemTB = 0;
        this.xepLoai = "";
    }

    public BangDiemHocKy(String maBD, String maSV, String maHK, float diemTB, String xepLoai) {
        this.maBD = maBD;
        this.maSV = maSV;
        this.maHK = maHK;
        this.diemTB = diemTB;
        this.xepLoai = xepLoai;
    }
    
    public String getMaBD() {
        return maBD;
    }

    public void setMaBD(String maBD) {
        this.maBD = maBD;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
}
