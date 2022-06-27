package OOP.Phong.Bai2_DongVat;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("Husky", 10, "China", "Vàng");
        cho.keu();
        cho.sinhSan();
        cho.toString();

        // Khai báo + khởi tạo 1 con gà trống
        Ga ga1 =  new Ga("Gà A", 3, "VN", Ga.LoaiGa.Ga_Trong);
        ga1.keu();
        ga1.sinhSan();

        // Khai báo + khởi tạo 1 con gà mái
        Ga ga2 =  new Ga("Gà B", 3, "VN", Ga.LoaiGa.Ga_Mai);
        ga2.keu();
        ga2.sinhSan();

        // Khai báo + khởi tạo 1 con gà con
        Ga ga3 =  new Ga("Gà C", 1, "VN", Ga.LoaiGa.Ga_Con);
        ga3.keu();
        ga3.sinhSan();
    }
}
