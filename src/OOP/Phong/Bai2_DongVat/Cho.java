package OOP.Phong.Bai2_DongVat;

public class Cho extends DongVat {

    private String mauLong;

    public Cho(String tenDongVat, float canNang, String nguonGocXuatSu, String mauLong) {
        super(tenDongVat, canNang, nguonGocXuatSu);
        this.mauLong = mauLong;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    @Override
    public void keu() {
//        super.keu();
        System.out.println("Chó kêu gâu gâu .");
    }

    @Override
    public void sinhSan() {
//        super.sinhSan();
        System.out.println("Chó đẻ con .\n");
    }
}
