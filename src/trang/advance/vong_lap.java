package trang.advance;

import java.util.Scanner;
public class vong_lap {
    public static  void  fibonacci() {
        int  num1 = 0, num2 = 1;
        System.out.print("Nhập số phần tử: ");
        Scanner scanner = new Scanner(System.in);
        int count= scanner.nextInt();
        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;

        }
        System.out.print("\nPhần tử n là:" + ( num2 - num1));

    }

    public static void main(String[] args) {

        fibonacci();
    }
}
