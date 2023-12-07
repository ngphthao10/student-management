package Model;

public class ChucNang {
    
    private String maChucNang;
    private String tenChucNang;
    private String tenManHinh;

    public ChucNang(){
        this.maChucNang = "";
        this.tenChucNang = "";
        this.tenManHinh = "";
    }
    
    public ChucNang(String maChucNang, String tenChucNang, String tenManHinh) {
        this.maChucNang = maChucNang;
        this.tenChucNang = tenChucNang;
        this.tenManHinh = tenManHinh;
    }

    public String getMaChucNang() {
        return maChucNang;
    }

    public void setMaChucNang(String maChucNang) {
        this.maChucNang = maChucNang;
    }

    public String getTenChucNang() {
        return tenChucNang;
    }

    public void setTenChucNang(String tenChucNang) {
        this.tenChucNang = tenChucNang;
    }

    public String getTenManHinh() {
        return tenManHinh;
    }

    public void setTenManHinh(String tenManHinh) {
        this.tenManHinh = tenManHinh;
    }
    
}
