package B1;

import java.util.Scanner;

public class Theu_ChanLe {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số vào đây: ");
        int a = scanner.nextInt();
        if (a == 0) // nếu a = 0
            System.out.println ( a + " là Số không chẵn ko lẻ");
        else if (a != 0 && a %2 ==0 ) // nếu a khác 0 và a chia hết cho 2

            System.out.println("Đây là số chẵn!");
        else

            System.out.println("Đây là số lẻ!");

    }

}
