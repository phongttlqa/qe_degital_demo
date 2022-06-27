package OOP.BaiTap.Ly;

public class Dongvat {
    int cannang;
    String nguongoc;
    public void Keu(){
        System.out.print("Kêu: ");
    }
    public void Sinhsan(){
        System.out.print("Đẻ: ");
    }

    public Dongvat(int cannang, String nguongoc) {
        this.cannang = cannang;
        this.nguongoc = nguongoc;
    }
}
