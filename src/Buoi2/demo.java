package Buoi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap n = ");
//        int n = scanner.nextInt();
//        int[] soNguyens = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhap so thu " + i);
//            soNguyens[i] = scanner.nextInt();
//        }
//        System.out.println("\nMảng trước khi sắp xếp");
//        inMangSoNguyen(soNguyens);
//        Arrays.sort(soNguyens);
//        System.out.println("\nMảng sau khi sắp xếp");
//        inMangSoNguyen(soNguyens);

        String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";


        StringBuilder builder = new StringBuilder();
        builder.append("a");
        System.out.println(builder);  // a
        builder.append("b");
        System.out.println(builder);  // ab
        builder.reverse();
        System.out.println(builder);  // ba
        builder.insert(1,"c");
        System.out.println(builder);  // bca
        builder.delete(0,1);
        System.out.println(builder);  // ca
        builder.append("d").append("e").append("g");
        System.out.println(builder);  // cadeg
        builder.replace(2,3,"THEU");
        System.out.println(builder);  // caTHEUeg
    }


    public static void inMangSoNguyen(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
