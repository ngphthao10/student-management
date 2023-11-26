/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class PhanCong {
    
    private String maGV;
    private String maMH;
    private int khoaHT;
    
    public PhanCong() {
        this.maGV = "";
        this.maMH = "";
        this.khoaHT = 0;
    }

    public PhanCong(String maGV, String maMH, int khoaHT) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.khoaHT = khoaHT;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getKhoaHT() {
        return khoaHT;
    }

    public void setKhoaHT(int khoaHT) {
        this.khoaHT = khoaHT;
    }
    
    
    
}
