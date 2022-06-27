package OOP.BaiTap.Ly;

public class Meo extends Dongvat{


    public Meo(int cannang, String nguongoc) {
        super(cannang, nguongoc);
    }

    @Override
    public void Keu(){
        System.out.println("Con Mèo");
        super.Keu();
        System.out.println("Meo meo");
        super.Sinhsan();
        System.out.println("Con");
    }
}
