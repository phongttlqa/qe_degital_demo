package OOP.BaiTap.Trang;

public class Main {
    // Bài 2 advance
    public static void main(String[] args) {
//        // Bài 1 basic
//        Bai1_basic Employee=new Bai1_basic("nham","trang" , 1,1000);
//        Employee.showInformation();
//        // Bài 1 advance

        // Bài 2 advance
        Bai2_advance acc1 = new Bai2_advance(1,"Trang",200000);
        acc1.credit(1000); // gọi hàm nạp tiền
        acc1.debit(200000); // gọi hàm rút tiền

        Bai2_advance acc2= new Bai2_advance(2,"Nham Trang",55000);
        acc2.credit(5000);
        acc2.debit(2000);
        acc1.transfer(acc1,acc2);
//        // Bài 2 basic
//        System.out.print("\nThông tin của mèo là:");
//        Cat cat1= new Cat(12,"Viêt Nam", 2);
//        cat1.reproduction();
//        cat1.sound();
//        cat1.showInformation();
//
//        System.out.print("\nThông tin của gà là:");
//        Chicken ga1_ =new Chicken(1,"Việt nam", 2);
//        ga1_.reproduction();
//        ga1_.sound();
//        ga1_.showInformation();
//        // Bài 3 basic
//        Bai3_basic circle1 = new Bai3_basic(3, "Xanh");
//        circle1.showInformation();
    }

}
