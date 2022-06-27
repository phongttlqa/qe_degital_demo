package OOP.BaiTap.Ly;

import java.util.Scanner;

public class Human {
    String name;
    int age;
    static Scanner sc = new Scanner(System.in);

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showinfo(){
        System.out.println(name+" "+age);
    }

    public void showAge(){
        System.out.println(age);
    }
    public void showName(){
        System.out.println(name);
    }
    public void showAgePlus1(){
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        age = age + a;
        System.out.println("Tuổi là: "+ age);
    }
    public void showAgePlus2(){
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        age = age + a + b;
        System.out.println("Tuổi là: "+ age);
    }
    public void showAgePlus3(){
        System.out.println("Nhap a");
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        System.out.println("Nhap c");
        int c = sc.nextInt();
        age = age + a + b + c;
        System.out.println("Tuổi là: "+ age);
    }
}
