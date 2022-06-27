package OOP.Theu;

import java.util.Scanner;

public class Human {
    String name;
    int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void showAgePlus1() { // tại sao ko nên để là static chỗ này
        System.out.println("Mời bạn nhập 1 số bất kỳ: ");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        age += a;
        System.out.println("Show Age 1: " + age + "");
    }

    public void showAgePlus2() { // tại sao ko nên để là static chỗ này
        System.out.println("Mời bạn nhập 2 số bất kỳ: ");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        age = age + a + b;
        System.out.println("Show Age 2: " + age + "");
    }
    public void showAgePlus3(){
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        age = age + a + b + c;
        System.out.println("Show Age 3: " + age + "");
    }
}

