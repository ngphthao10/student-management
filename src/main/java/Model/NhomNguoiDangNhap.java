
package Model;

public class NhomNguoiDangNhap {
    
    private String maNhomNguoiDung;
    private String tenNhomNguoiDung;

    public NhomNguoiDangNhap(){
        this.maNhomNguoiDung = "";
        this.tenNhomNguoiDung = "";
    }
    
    public NhomNguoiDangNhap(String maNhomNguoiDung, String tenNhomNguoiDung) {
        this.maNhomNguoiDung = maNhomNguoiDung;
        this.tenNhomNguoiDung = tenNhomNguoiDung;
    }

    public String getMaNhomNguoiDung() {
        return maNhomNguoiDung;
    }

    public void setMaNhomNguoiDung(String maNhomNguoiDung) {
        this.maNhomNguoiDung = maNhomNguoiDung;
    }

    public String getTenNhomNguoiDung() {
        return tenNhomNguoiDung;
    }

    public void setTenNhomNguoiDung(String tenNhomNguoiDung) {
        this.tenNhomNguoiDung = tenNhomNguoiDung;
    }
    
    
}
