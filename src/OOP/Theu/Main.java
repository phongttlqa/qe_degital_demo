package OOP.Theu;

import org.w3c.dom.ranges.DocumentRange;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Bài ví dụ trên lớp===");
        Human human1 = new Human("Ly", 16);
        System.out.println("Người số 1 là:" + human1.getName());
        System.out.println("Số tuổi là:" + human1.getAge());
        System.out.println("");

        //bai 1: class study kế thừa class Human
        System.out.println("===Bài số 1: class con có thuộc tính riêng===");
        Study Hoc = new Study("Lan Anh", 17, "THCS Nguyen Binh Khiem");
        Hoc.printInfor();
        System.out.println("");


        //bai2: class Student kế thừa Class BaiTap2
        System.out.println("===In tên tuổi hàm showName, showAge===");
        BaiTap2 human2 = new BaiTap2(29, "Trang");
        human2.showName();
        human2.showAge();
        System.out.println("");

        System.out.println("===In tên tuổi trường - override method ===");
        Student hs1 = new Student(13, "Hải", "Lý Thái Tổ");
        hs1.showName();
        hs1.showAge();
        System.out.println("");

        //bai3: tại class BaiTap2 tạo 3 phương thức
        System.out.println("==ShowAge1===");
        Human student1 = new Human("Ngọc", 11);
        student1.showAgePlus1();

        System.out.println("===ShowAge2===");
        Human student2 = new Human("Ngọc", 18);
        student2.showAgePlus2();

        System.out.println("===ShowAge3===");
        Human student3 = new Human("Ngọc", 15);
        student3.showAgePlus3();
    }
}
