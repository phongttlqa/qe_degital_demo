package B3;

public class HocSinh extends ConNguoi {


    private String tenTruong;

    public HocSinh(int tuoi, String ten, boolean gioiTinh, String tenTruong) {
        super(tuoi, ten, gioiTinh);
        this.tenTruong = tenTruong;
    }

    public String layThongTinHocSinh() {
        return this.ten + " HocSinh{" +
                "tenTruong='" + tenTruong + '\'' +
                '}';
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
}
