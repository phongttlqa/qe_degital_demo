package B1;

import java.util.Scanner;
public class Theu_TimMax {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất");
        int a = scanner.nextInt();

        System.out.println("Nhập số thứ hai");
        int b = scanner.nextInt();

        System.out.println("Nhập số thứ ba");
        int c = scanner.nextInt();

        if (a >= b && a >= c) // nếu a lớn hơn b,c
            System.out.println ( a + " là số lớn nhất");
        else if (b >= a && b >= c) // nếu a lớn hơn a,c
            System.out.println ( b + " là số lớn nhất");
        else
            System.out.println ( c + " là số lớn nhất");

    }
}
