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
    private int maLTC;
    
    public DangKy() {
        this.maSV = "";
        this.maLTC = 0;
    }

    public DangKy(String maSV, int maLTC) {
        this.maSV = maSV;
        this.maLTC = maLTC;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getMaLTC() {
        return maLTC;
    }

    public void setMaLTC(int maLTC) {
        this.maLTC = maLTC;
    }
}
