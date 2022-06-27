package B3;

public class main {
    public static void main(String[] args) {

       HocSinh hocSinh = new HocSinh(20, "Hoc sinh A", true, "PTIT");
//       hocSinh.XYZ();
        System.out.println(hocSinh.layThongTinHocSinh());

        String a = hocSinh.layThongTinConNguoi();
        String b = hocSinh.layThongTinHocSinh();

       Nhanvien nhanvien = new Nhanvien(30, "B", false, "Tech");
       nhanvien.XYZ();

       nhanvien.layThongTinConNguoi();
       String d = nhanvien.layThongTinNhanVien();
//       String e = nhanvien.layThongTinHocSinh();
    }
}
