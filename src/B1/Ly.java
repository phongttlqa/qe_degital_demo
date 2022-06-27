package B1;

import java.util.Scanner;

public class Ly {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        bai2();
        bai3();
        bai4();
        bai5();
        bai6();
    }

    private static void bai6() {
        System.out.println("Bài 6 - Chương trình java để tráo đổi giá trị bởi sử dụng biến thứ ba");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Ket qua la: a =" + a + ", b = " + b);
    }

    private static void bai5() {
        System.out.println("Bài 5 - Nhập từ bàn phím 1 năm bất kì . Kiểm tra xem có phải năm nhuận hay không:");
        int nam = sc.nextInt();
        if(nam < 1000){
            System.out.println("Sai dinh dang!");
        }
        if(nam >= 1000 && nam % 400 == 0){
            System.out.println("Day la nam nhuan!");
        }
        if(nam >= 1000 && nam % 4 == 0 && nam % 100 == 0){
            System.out.println("Day khong phai nam nhuan!");
        }
        if(nam >= 1000 && nam % 4 == 0 && nam % 100 != 0){
            System.out.println("Day la nam nhuan!");
        }
        if(nam >= 1000 && nam % 4 != 0){
            System.out.println("Day khong phai nam nhuan!");
        }

    }

    private static void bai4() {
        System.out.println("Bài 4 - Kiểm tra số âm, dương trong java:");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Đây là số dương!");
        }
        else if(a < 0){
            System.out.println("Đây là số âm!");
        }
        else{
            System.out.println("Đây là số không âm không dương!");
        }
    }


    private static void bai3() {
        System.out.println("Bài 3 - Kiểm tra số chẵn, lẻ trong java:");
        int so = sc.nextInt();
        if(so % 2 == 0){
            System.out.println("Số này là số chẵn!");
        }
        else {
            System.out.println("Số này là số lẻ!");
        }
    }

    private static void bai2() {
        System.out.println("Bài 2 - Chương trình java tìm giá trị lớn nhất (So sánh ba số nguyên):");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a; // gán max = a
        if(b > max){
            max = b;// nếu b > max -> gán max = b
        }
        if(c > max){
            max = c;//nếu c > max -> gán max = c
        }
        System.out.println("So lon nhat la: " + max); //in max
    }
}
