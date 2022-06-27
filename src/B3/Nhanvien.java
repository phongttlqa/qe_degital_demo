package B3;

public class Nhanvien extends ConNguoi{
    @Override
    public void XYZ() {
//        super.XYZ();
        System.out.println("xyz from nhan vien");
    }

    private String tenCongTy;

    public Nhanvien(int tuoi, String ten, boolean gioiTinh, String tenCongTy) {
        super(tuoi, ten, gioiTinh);
        this.tenCongTy = tenCongTy;
    }

    public String layThongTinNhanVien() {
        return "HocSinh{" +
                "tenTruong='" + tenCongTy + '\'' +
                '}';
    }
}
