package B1;

import java.util.Scanner;

public class Linh {

    public static void main(String[] args) {
        hw01Operator();
        hw02Max();
        hw03OddEven();
        hw04PositiveNegative();
        hw05LeapYear();
        hw06();
        hw07();
        hw08QuadraticEquation();


    }

    public  static  void  hw01Operator(){
        Scanner scan = new Scanner(System.in);
        int  a = scan.nextInt();
        int b = scan.nextInt();

        // In ra số lớn nhất
        if (a > b){
            System.out.println(a + " lớn hơn " + b);
        }

        // Tính tổng
        System.out.println("Tổng là: " + (a + b));
        //Tính hiệu
        System.out.println("Hiệu là: " + (a - b));
        //Tính thương
        System.out.println("Thương là: " + (a / b));
        //Tính lấy dư
        System.out.println("Dư là: " + (a % b));

    }

    public static void hw02Max(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // In ra số lớn nhất
        if (a>=b && a>c){
            System.out.println("Số lớn nhất: " + a);
        } else if (b>=a && b>c){
            System.out.println("Số lớn nhất: " + b);
        }
        else if (c>=a && c>b){
            System.out.println("Số lớn nhất: " + c);
        }
        else {
            System.out.println("3 số bằng nhau");
        }
        // dòng 50 đang hiển thị cảnh báo trong điều kiện của else if.

    }

    public static void hw03OddEven(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check odd or even number
        if (a%2==0){
            System.out.println(a +"  is a even number");
        }else if (a==0){
            System.out.println(a +"  is not odd or even number");
        } else{
            System.out.println(a +"  is a odd number");
        }
    }

    public  static  void hw04PositiveNegative(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check odd or even number
        if (a>=0){
            System.out.println(a +"  is a positive number");
        } else{
            System.out.println(a +"  is a negative  number");
        }

    }

    public static void hw05LeapYear(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check leap year
        if (a>0 && a%400 ==0){

        } else if (a<0){
            System.out.println(a +" is invalid number");
        }

        else{
            System.out.println(a +"  is not a leap year");
        }

    }

    public static  void hw06(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        // biến thứ 3
        int c = a+b;
        //  value of  a = value of b
        System.out.println("Đổi giá trị của a là " + (c-a) + " và giá tri của b là " + (c-b) );

    }

    public static void hw07(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Đổi giá trị của a là " + a + " và giá tri của b là " + b );

    }

    public static void hw08QuadraticEquation(){
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();
        double x1;
        double x2;
        float delta = ((b*b) - (4*a*c));
        double sqrtDelta = Math.sqrt(delta);

        // a = 0 -> Phương trình thành bx +c = 0
        if (a==0) {
            x1 = (-c/b);
            System.out.println("Phương trình có 1 nghiệm " + x1);

        }

        // a !=0 -> Phương trình có nghiệm
        else{

            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");

            }
            else if (delta==0){
                x1 = (-b/2*a);
                x2 = x1;
                System.out.println("Phương trình có 1 nghiệm x1 = " + x1 +"; x2= " + x2 );

            }
            else if (delta>0){
                x1 = ((-b + sqrtDelta)/(2*a));
                x2 = ((-b - sqrtDelta)/(2*a));
                System.out.println("Phuong trình có 2 nghiệm x1 = " + x1 + "; x2= " +x2);
            }


        }


    }
}
