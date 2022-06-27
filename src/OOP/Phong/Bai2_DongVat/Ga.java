package OOP.Phong.Bai2_DongVat;

public class Ga extends DongVat {
    public enum LoaiGa{
        Ga_Mai, Ga_Trong, Ga_Con;
    }
    private LoaiGa loaiGa;

    public Ga(String tenDongVat, float canNang, String nguonGocXuatSu, LoaiGa loaiGa) {
        super(tenDongVat, canNang, nguonGocXuatSu);
        this.loaiGa = loaiGa;
    }

    public LoaiGa getLoaiGa() {
        return loaiGa;
    }

    public void setLoaiGa(LoaiGa loaiGa) {
        this.loaiGa = loaiGa;
    }

    @Override
    public void keu() {
//        super.keu();
        switch (this.loaiGa){
            case Ga_Con:
                System.out.println("Gà con kêu chíp chíp");
                break;
            case Ga_Mai:
                System.out.println("Gà mái kêu cục tác");
                break;
            case Ga_Trong:
                System.out.println("Gà trống kêu ò ó o");
                break;
            default:
                System.out.println("Con gà này bị câm !");
                break;
        }
    }

    @Override
    public void sinhSan() {
//        super.sinhSan();
        switch (this.loaiGa){
            case Ga_Mai:
                System.out.println("Gà mái đẻ trứng.\n");
                break;
            default:
                System.out.println("Con gà này không đẻ được !\n");
                break;
        }
    }
}
