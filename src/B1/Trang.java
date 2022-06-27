package B1;

import java.util.Scanner;


public class Trang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a ban đầu="); // in ra màn hình thông tin mong muốn
        int a = input.nextInt(); // nhập vào từ bàn phím 1 số nguyên, gán vào biến đã khai báo . Các đoạn bên dưới cũng tương tự
        System.out.print("b ban đầuu=");
        int b = input.nextInt();
        int temp = 0;
        swing_with_temp(a, b, temp);

        System.out.print("c ban đầu=");
        int c = input.nextInt();
        System.out.print("d ban đầu=");
        int d = input.nextInt();
        swing_not_temp(c, d);
        caculate(a, b); // gọi hàm caculate để tính tổng hiệu tích thương của a và b
        caculate_Sosanhbaso(a, b, c); //gọi hàm caculate để so sánh 3 giá trị a,b,c
        caculate_chan_le(a); // gọi hàm để  kiểm tra xem a là số chẵn hay lẻ
        caculate_am_duong(a); // gọi hàm để  kiểm tra xem a là số âm hay dương
        System.out.print("Year=");
        int year = input.nextInt(); // nhập vào số năm mà user muốn kiểm tra từ bàn phím
        if (checking_year(year) == true) //dùng hàm checking_year để kiểm tra hàm đó.
            System.out.println("BT5:" +year + " là năm nhuận");  // nếu hàm trả về true thì năm đó là năm nhuận.
        else
            System.out.println("BT5:" +year + " không là năm nhuận"); // nếu hàm trả về false thì năm đó không phải năm nhuận
        phuong_trinh(a,b,c); // giải phương trình bậc 2 với a,b,c đã nhập tư bàn phím
    }

    // BT1:
    static void caculate(int a, int b) {
        float addition, subtraction, multiplication, divide, divide2;
        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        divide = (float) a/b;
        divide2 = a % b;
        System.out.println("Bài tập 1");
        System.out.println("Tổng a+b=" + addition);
        System.out.println("Hiệu a-b=" + subtraction);
        System.out.println("Tích a*b=" + multiplication);
        System.out.println("Thương a/b lấy phần nguyên=" + divide);
        System.out.println("Thương a/b lấy phần dư=" + divide2);

    }

    //Bt2:
    static void caculate_Sosanhbaso(int a, int b, int c) {

        System.out.println("Bài tập 2");
        if (c > b && c > a) {
            System.out.println("c > b và c> a");
        }
        if (b > a && b > c) {
            System.out.println("b> c và b>c");
        }
        if (a > c && a > b) {
            System.out.println("a>c và a>b");

        }
    }

    // BT3
    static void caculate_chan_le(int b) {
        System.out.println("Bài tập 3 và 4");
        String result = (b % 2 == 0) ? "số chẵn" : "số lẻ";
        System.out.println(b+ " là " + result);
    }
    //BT4
    static void caculate_am_duong(int b) {
        //  System.out.println("Bài tập 4");
        if (b>0)
        {
            System.out.println(b + " là số dương ");
        }if (b<0)
        {
            System.out.println(b + " là số âm ");
        }
        if (b==0)
        {
            System.out.println(b + " không là âm, cũng không là dương ");
        }
    }



    // BT5
    public static boolean checking_year(int year) {
        // năm nhuận là năm chia hết cho 400 hoặc (chia hết cho 4 và không chia hết cho 100)
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    //BT6: hoán đổi có dùng biến tạm
    // dổi giá trị biến tạm = a ban đầu, sau đó a bàn đầu được hoán đổi thành  b, cuối cùng là đổi b được hoán đổi thành a ban đầu. rồi in ra a,b sau khi hoán đổi
    static void swing_with_temp(int a, int b, int temp) {
        temp = a;
        a = b;
        b = temp;
        System.out.println("Bài tập 6");
        System.out.println("a sau khi đổi là: " + a);
        System.out.println("b sau khi đổi là: " + b);
    }

    // BT7: hoán đổi không dùng biến tạm
    static void swing_not_temp(int c, int d) {
        // đầu tiên gán c = tổng của (c ban đầu + d ban đầu), sau đó d mới = ( c mới - d ban đầu); c sau khi được hoán đổi = c mới - d mới
        // sau khi hoán đổi xong, in ra các số đã được hoán đổi
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("Bài tập 7");
        System.out.println("c sau khi đổi là : " + c);
        System.out.println("d sau khi đổi là : " + d);
    }

    // BT8:Giải phương trình
    static void phuong_trinh(float a, float b, float c) {
        float delta = b*b - 4*a*c; // công thức tính delta bằng= b bình thường - 4 *a*c
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) { // nếu delta > 0 thì phuowg trình có 2 nghiệm phân biết như ở dưới
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("BT8: Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) { // nếu delta = 0 thì phương trình có 1 nghiệm kép
            x1 = (-b / (2 * a));
            System.out.println("BT8:Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else { // nếu delta < 0 thì phương trình vô nghiệm
            System.out.println("BT8:Phương trình vô nghiệm!");
        }
    }
}
