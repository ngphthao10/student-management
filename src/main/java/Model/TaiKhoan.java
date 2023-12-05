/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh Thu
 */
public class TaiKhoan {
    
    private String maTK;
    private String matKhau;
    private boolean trangThaiXoa;
    private int maNDN;
    
    public TaiKhoan() {
        this.maTK = "";
        this.matKhau = "";
        this.trangThaiXoa = false;
        this.maNDN = 0;
    }

    public TaiKhoan(String maTK, String matKhau, boolean trangThaiXoa, int maNDN) {
        this.maTK = maTK;
        this.matKhau = matKhau;
        this.trangThaiXoa = trangThaiXoa;
        this.maNDN = maNDN;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(boolean trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    public int getMaNDN() {
        return maNDN;
    }

    public void setMaNDN(int maNDN) {
        this.maNDN = maNDN;
    }
    
    
    
}
