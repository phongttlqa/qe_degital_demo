package OOP.BaiTap.Theu;

public class Hen extends Animal {
    public Hen(int weight, String from) {
        super(weight, from);
    }

    @Override
    public void Say() {
//        super.Say();
        System.out.println("Con gà kêu cục tác.");
    }

    @Override
    public void reproduction() {
//        super.reproduction();
        System.out.println("Con gà đẻ trứng.");
    }
}
