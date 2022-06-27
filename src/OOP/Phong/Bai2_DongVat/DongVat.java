package OOP.Phong.Bai2_DongVat;

public class DongVat {
    private String tenDongVat;
    private float canNang;
    private String nguonGocXuatSu;

    public DongVat(String tenDongVat, float canNang, String nguonGocXuatSu) {
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.nguonGocXuatSu = nguonGocXuatSu;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public String getNguonGocXuatSu() {
        return nguonGocXuatSu;
    }

    public void setNguonGocXuatSu(String nguonGocXuatSu) {
        this.nguonGocXuatSu = nguonGocXuatSu;
    }

    public void keu(){
        System.out.println("Tiếng động vật kêu");
    }

    public void sinhSan(){
        System.out.println("Hình thức động vật sinh sản");
    }
}
