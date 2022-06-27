package javafortester;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hw_lesson2_linh {

    public static void main(String[] args) {
        //--> Bài tập vòng lặp
        hw01();
        hw02();
        hw03();
        hw04();
        hw05();
        //--> Bài tập mảng
        hw06();
        hw07();
        hw08();
        hw09();
    }

        public static void hw01 () {
            System.out.println("Dãy số chẵn là ");
            // i = 0 -> i+2 là số chẵn
            for (int i = 0; i <= 100; i += 2) {
                System.out.println(i);
            }
            // i = 1 -> i +2 là số lẻ
            System.out.println("Dãy số lẻ là ");
            for (int i = 1; i < 100; i += 2) {
                System.out.println(i);
            }

        }


        public static void hw02 () {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("A list of numbers starting with a and ending with b: ");
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        // missing case a > b
        }

        public static void hw03 () {

            int a = 1;
            System.out.println("A list of numbers which smaller than 100 are divisible by 3 and are not  divisible by 5: ");
            while (a < 100) {
                if (a % 3 == 0 && a % 5 != 0) {
                    System.out.println(a);

                }
                a++;  // nên sử dụng a += 3 để tăng hiệu năng
            }

        }

        public static void hw04 () {
            Scanner scan = new Scanner(System.in);
            int a;

            do {
                System.out.println("Nhập");
                a = scan.nextInt();

            }
            while (a != 0);
            System.out.println("Chương trình kết thúc");


        }

        public static void hw05 () {
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhập số: ");
            int n = scan.nextInt();
            int sum = 0;
            int multiple = 1;
            //Tính tổng
            for (int i = 0; i <= n; ++i) {
                //sum = sum +i -> Công sum với i rồi mới in ra giá trị sum
                sum += i;


            }
            System.out.println("Tổng các số từ 0 đến n: " + sum);

            //tính giai thừa
            System.out.println("Nhập số: ");
            n = scan.nextInt();

            for (int i = 1; i <= n; ++i) {
                //multiple = multiple *i -> Nhân trước rồi mới in ra giá trị
                multiple *= i;

            }
            System.out.println("Giai thừa các số n: " + multiple);
        }

        public static void hw06 () {
            int numbers[] = {99, 98, 55, 64, 82, 56, 74, 33, 10, 5};
            // In ra màn hình các phần tử
            System.out.println("In ra màn hình các phần từ trong mảng");

            for (int j = 0; j < 10; j++) {

                System.out.println("Phần tử thứ " + j + ": " + numbers[j]);

            }

            System.out.println("In ra màn hình các phần từ theo chiều đảo ngược");
            //Sắp xếp mảng theo chiều đảo ngược
            for (int i = numbers.length - 1; i >= 0; --i) {
                System.out.println("Phần tử thứ " + i + ": " + numbers[i]);


            }

            System.out.println("In ra màn hình  số chẵn trong mảng");
            for (int x : numbers) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }

            }


            int min = numbers[0];
            int max = numbers[0];

            for (int x = 0; x < numbers.length; x++) {

                if (numbers[x] < min) {
                    min = numbers[x];
                }
                if (numbers[x]>max) {
                    max = numbers[x];
                }

            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }

        public static void hw07 () {
        String digitals[] = {"Thắng","Phan", "Công Anh","Đức","Trình","Thảo","Dũng1","Sơn","Dũng3","Thành","Hiển","Hải", "Oanh","Luyến","Thêu","Mai","Nhâm Trang","Toàn","Tuyên","Linh", "Lý","Quốc" };
        System.out.println("In ra theo alphabet");
        Arrays.sort(digitals,0,9); // sort theo vị trí
            for (String digital: digitals) {
                System.out.println(digital);

            }

    }


        public static void hw08 () {
            Scanner scan = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<Integer>();
            //Nhập phần tử từ bàn phím
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                int a = scan.nextInt();
                numbers.add(a);


            }

            // In ra màn hình các phần tử
            System.out.println("In ra màn hình các phần từ trong mảng");

            for (int j = 0; j < 3; j++) { // Sao chỗ này ko dùng numbers.size() giông bên dưới

                System.out.println("Phần tử thứ " + j + ": " + numbers.get(j));

            }

            System.out.println("In ra màn hình các phần từ theo chiều đảo ngược");
            //Sắp xếp mảng theo chiều đảo ngược
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.println("Phần tử thứ " + i + ": " + numbers.get(i));


            }

            System.out.println("In ra màn hình  số chẵn trong mảng");
            for (int x : numbers) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }

            }


            int min = numbers.get(0);
            int max = numbers.get(0);

            for (int x = 0; x < numbers.size(); x++) {

                if (numbers.get(x) < min) {
                    min = numbers.get(x);
                }
                if (numbers.get(x) > max) {
                    max = numbers.get(x);
                }

            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);


        }

        public static void hw09 () {
        String arrayDigitals[] = {"Thắng","Phan", "Công Anh","Đức","Trình","Thảo","Dũng1","Sơn","Dũng3","Thành","Hiển","Hải", "Oanh","Luyến","Thêu","Mai","Nhâm Trang","Toàn","Tuyên","Linh", "Lý","Quốc" };
        Arrays.sort(arrayDigitals,0,9);

        List<String> listDigitals = new ArrayList<String>();
            for (String digital:arrayDigitals) {
                listDigitals.add(digital);
            }

         System.out.println("In ra theo alphabet trong listDigital");
            for (String i:listDigitals) {
                System.out.println(i);

            }





    }
    }


