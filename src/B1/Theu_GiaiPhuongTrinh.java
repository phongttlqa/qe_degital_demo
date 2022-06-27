package B1;

import java.util.Scanner;

public class Theu_GiaiPhuongTrinh {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Phương trình có dạng ax^2 + bx+ c= 0 . Mời bạn nhập  a ");
        float a = scanner.nextFloat();
        System.out.println(" Phương trình có dạng ax^2 + bx+ c= 0 . Mời bạn nhập b ");
        float b = scanner.nextFloat();
        System.out.println(" Phương trình có dạng ax^2 + bx+ c= 0 . Mời bạn nhập c ");
        float c = scanner.nextFloat();
// viết cho trường hợp phương trình có a và b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float dta = b*b - 4*a*c;
        float x1;
        float x2;

        // tính nghiệm
        if (dta > 0) {
            x1 = (float) ((-b + Math.sqrt(dta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(dta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (dta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else
            System.out.println("Phương trình vô nghiệm!");

    }

}
