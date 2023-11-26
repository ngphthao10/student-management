/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class Nganh {
    
    private String maNganh;
    private String tenNganh;
    private String khoa;

    public Nganh() {
        this.maNganh = "";
        this.tenNganh = "";
        this.khoa = "";
    }
    
    public Nganh(String maNganh, String tenNganh, String khoa) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.khoa = khoa;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    
    
}
