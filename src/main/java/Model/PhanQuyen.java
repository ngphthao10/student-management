package Model;

public class PhanQuyen {
    
    private String maNhomNguoiDung;
    private int maChucNang;

    public PhanQuyen(String maNhomNguoiDung, int maChucNang) {
        this.maNhomNguoiDung = maNhomNguoiDung;
        this.maChucNang = maChucNang;
    }

    public String getMaNhomNguoiDung() {
        return maNhomNguoiDung;
    }

    public void setMaNhomNguoiDung(String maNhomNguoiDung) {
        this.maNhomNguoiDung = maNhomNguoiDung;
    }

    public int getMaChucNang() {
        return maChucNang;
    }

    public void setMaChucNang(int maChucNang) {
        this.maChucNang = maChucNang;
    }
    
}
