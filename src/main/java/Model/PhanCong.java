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
    private int maLTC;
    
    public PhanCong() {
        this.maGV = "";
        this.maLTC = 0;
    }

    public PhanCong(String maGV, int maLTC) {
        this.maGV = maGV;
        this.maLTC = maLTC;
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
