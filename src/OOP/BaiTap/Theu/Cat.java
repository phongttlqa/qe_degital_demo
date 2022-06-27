package OOP.BaiTap.Theu;

public class Cat extends Animal{
     public Cat(int weight, String from) {
        super(weight, from);
    }

    @Override
    public void Say() {
//        super.Say();
        System.out.println("Con mèo kêu meow meow.");
    }

    @Override
    public void reproduction() {
//        super.reproduction();
        System.out.println("Con mèo đẻ con.");
    }
}
