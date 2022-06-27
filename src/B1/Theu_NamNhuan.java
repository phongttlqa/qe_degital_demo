package B1;

import java.util.Scanner;

public class Theu_NamNhuan {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số năm vào đây: ");
        int a = scanner.nextInt(); // nhập a từ bàn phím
        if (a == 0 || a < 0 ) // nếu a nhở hơn hoặc bằng 0
            System.out.println ( a + " nhập không chính xác");
        else if (a > 0 && a % 4 == 0 && a % 100 == 0 ) // nếu a lớn hơn 0, chia hết cho 100 và chia hết cho 4

            System.out.println("Đây là năm nhuận!");
        else

            System.out.println("Đây không phải là năm nhuận!");

    }

}

