package OOP.BaiTap.Linh;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Diện tích hình tròn có radius = 1 và color red là: "  + circle.getCircleArea());

        circle.setColor("green");
        System.out.println("Input radius 1 = ");
        double inputRadius = scan.nextDouble();
        circle.setRadius(inputRadius);
        System.out.println("Diện tích hình tròn có radius = " + circle.getRadius() + " và color " + circle.getColor() + " là " + circle.getCircleArea() );


        System.out.println("Input radius 2 = ");
        scan.nextDouble();
        circle.setColor("yellow");
        circle.setRadius(inputRadius);
        System.out.println("Diện tích hình tròn có radius = " + circle.getRadius() + " và color " + circle.getColor() + " là " + circle.getCircleArea());

    }

}
