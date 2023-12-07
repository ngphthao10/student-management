package Model;

public class TaiKhoan {
    
    private String maNDN;
    private String tenNguoiDung;
    private String tenDangNhap;
    private String matKhau;
    private boolean trangThaiXoa;
    
    public TaiKhoan() {
        this.maNDN = "";
        this.tenNguoiDung = "";
        this.tenDangNhap = "";
        this.matKhau = "";
        this.trangThaiXoa = false;
    }

    public TaiKhoan(String maNDN, String tenNguoiDung, String tenDangNhap, String matKhau, boolean trangThaiXoa) {
        this.maNDN = maNDN;
        this.tenNguoiDung = tenNguoiDung;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.trangThaiXoa = trangThaiXoa;
    }

    public String getMaNDN() {
        return maNDN;
    }

    public void setMaNDN(String maNDN) {
        this.maNDN = maNDN;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
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
    
}
