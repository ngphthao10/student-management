package Model;
public class MonHoc {
    
    private String maMH;
    private String tenMH;
    private int stcth;
    private int stclt;
    private String phanLoai;
    private String khoa;
    
    public MonHoc() {
        maMH = "";
        tenMH = "";
        stcth = 0;
        stclt = 0;
        phanLoai = "";
        khoa = "";
    }
    
    public MonHoc(String maMH, String tenMH, int stclt, int stcth, String phanLoai, String khoa) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.stclt = stclt;
        this.stcth = stcth;
        this.phanLoai = phanLoai;
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getStcth() {
        return stcth;
    }

    public void setStcth(int stcth) {
        this.stcth = stcth;
    }

    public int getStclt() {
        return stclt;
    }

    public void setStclt(int stclt) {
        this.stclt = stclt;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }
    
    
    
}
