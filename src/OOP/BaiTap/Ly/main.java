package OOP.BaiTap.Ly;

public class main {
    public static void main(String[] args) {
        BTOOPNC1();
        //BT3OOP();
        //BT2OOP();
        //bai4();
        // baitapmau();
        //bai2();
        //bai3();

    }

    private static void BTOOPNC1() {
        System.out.println("Bài tập hướng đối tượng nâng cao 1");
    }

    private static void BT3OOP() {
        System.out.println("Bài tập OOP Số 3");
        Circle CirecleK = new Circle();
        CirecleK.toString();
    }

    private static void BT2OOP() {
        System.out.println("Bài tập OOP Số 2");
        Ga Ga1 = new Ga(2,"Đông Tảo");
        Ga1.Keu();
        Meo Meo1 = new Meo(3,"Mướp");
        Meo1.Keu();
    }

    private static void BT1OOP() {
    }

    private static void bai4() {
        System.out.println("Bài tập 4");
        Study Hocsinh1 = new Study("Linh",26,"Tieu Hoc De La Thanh");
        Hocsinh1.showAgePlus1();
        Study Hocsinh2 = new Study("Ly",18,"Tieu Hoc Dien Xuan");
        Hocsinh2.showAgePlus2();
        Study Hocsinh3 = new Study("Theu",30,"He Chua");
        Hocsinh3.showAgePlus3();
    }

    private static void bai3() {
        System.out.println("Bài tập 3");
        Study Hocsinhgioi = new Study("Lý", 18,"Học viện Tài Chính");
        Hocsinhgioi.showAge();
        Hocsinhgioi.showName();
    }

    private static void baitapmau() {
        Human Human1 = new Human("Lý", 18);
        Human Human2 = new Human("Ly");

        System.out.println(Human1.getAge()+" "+ Human1.getName());
        System.out.println(Human2.getName());
    }

    private static void bai2() {
        System.out.println("Bài tập 2");
        Study Hocsinh = new Study("Lily", 18, "Tiểu học Diễn Xuân");
        Hocsinh.showin4();
    }
}
