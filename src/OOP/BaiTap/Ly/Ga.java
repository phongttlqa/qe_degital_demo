package OOP.BaiTap.Ly;

public class Ga extends Dongvat{

    public Ga(int cannang, String nguongoc) {
        super(cannang, nguongoc);
    }
    @Override
    public void Keu(){
        System.out.println("Con Gà");
        super.Keu();
        System.out.println("Ò Ó O");
        super.Sinhsan();
        System.out.println("Trứng");
    }
}
