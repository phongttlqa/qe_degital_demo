package Bonus;

import java.util.Date;

public class Human {
    private String ho;
    private String ten;
    private String gioiTinh;
    private String sinhNhat;

    public Human(String ho, String ten, String gioiTinh, String sinhNhat) {
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.sinhNhat = sinhNhat;
    }

    public Human() {
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(String sinhNhat) {
        this.sinhNhat = sinhNhat;
    }
}
