package B1;

import java.util.Scanner;

public class Theu_AmDuong {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số vào đây: ");
        int a = scanner.nextInt();
        if (a == 0) // nếu a = 0
            System.out.println ( a + " là Số không âm ko dương");
        else if (a < 0 ) // nếu a < 0 và a khác 0
            System.out.println("Đây là số âm!");
        else
            System.out.println("Đây là số dương!");
    }

}
