package Bonus;

import java.util.Date;

public class SinhVien extends Human {

    private String maSV;
    private String khoa;
    private String nganh;
    private String xepLoai;

    public SinhVien(String ho, String ten, String gioiTinh, String sinhNhat, String maSV, String khoa, String nganh, String xepLoai) {
        super(ho, ten, gioiTinh, sinhNhat);
        this.maSV = maSV;
        this.khoa = khoa;
        this.nganh = nganh;
        this.xepLoai = xepLoai;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void showInformation() {
        System.out.println(
                        maSV + " : " +
                        getHo() + " " +
                        getTen() + " : " +
                        getSinhNhat() + " : " +
                        khoa + " : " +
                        nganh + " : " +
                        xepLoai);
    }
}


