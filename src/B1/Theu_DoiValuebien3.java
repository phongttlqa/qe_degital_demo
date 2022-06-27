package B1;

import java.util.Scanner;

    public class Theu_DoiValuebien3  {
        public static void main (String [] args ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Mời bạn nhập 2 số : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int newNumber;
                System.out.println ("Giá trị trước khi biến đổi là: "+ a + " " + b);

                newNumber = a; // gán newNumber = a
                a = b;          // gán a = b
                b = newNumber; // gán b = newNumber
                System.out.println ("Giá trị sau khi biến đổi là: " + a + " " + b);


        }
    }

