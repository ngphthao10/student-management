/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class DangKy {
    
    private String maSV;
    private String maMH;
    private int nhom;
    private float diem;
    
    public DangKy() {
        this.maSV = "";
        this.maMH = "";
        this.nhom = 0;
        this.diem = 0.0f;
    }

    public DangKy(String maSV, String maMH, int nhom, float diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.nhom = nhom;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    
    
}
