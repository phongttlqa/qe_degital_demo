package baitap2;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class Theu {


    //Bài tập vòng lặp
    public static void Bai1() {
        System.out.println("Số chẵn từ 0-100 bao gồm:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            }
        System.out.println("\nSố lẻ từ 0-100 bao gồm:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
               System.out.print(i + " ");
        }
    }

    public static void Bai2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMời bạn nhập a:");
        int a = scan.nextInt();
        System.out.println("Mời bạn nhập b:");
        int b = scan.nextInt();
        System.out.println("Dãy số hợp lí:" );
//        if (a >= b) {
//            for (int i = a; i>=b ; i--) {
//                System.out.print(" " + i);
//            }
//        } else {
//            for (int i = a; i<=b ; i++) {
//                System.out.print(" " + i);
//            }
//        }

//        System.out.println("");
//        while(x<=y){
//            System.out.print(" " + y);
//            y--;
//        }
    }

    public static void Bai3(){
        int a = 0;
        System.out.print("\nCác số thỏa mãn là:" );
        while (a <100) {
            a++;
           if (a%3 ==0 && a%5 != 0) {
                System.out.print(" " +a);
            }
        }
    }

    public static void Bai4(){
        int a;
        do {
            System.out.println("Mời bạn nhập số bất kỳ từ bàn phím:");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("Số đã nhập là:" + a);
        } while (a != 0);
        System.out.println("Bạn đã nhập số 0. Game over.");
    }

    public static void Bai5() {
        System.out.println("Mời bạn nhập số bất kỳ từ bàn phím:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
            fact = fact*i;
        }
            System.out.println("Tổng các số từ 0 tới n là:" +sum);
            System.out.println("Giai thừa tới n là:" +fact);
     }

// Bài tập mảng
    public static void Baim1(){
         int[] mangs;
            mangs = new int[10];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập 10 số vào đây:");
            int i;
            for (i = 0; i<10; i++){
                mangs[i] = scanner.nextInt();
            }
            System.out.print("In ra toàn bộ mảng: " );
            for (i = 0; i < 10;i++) {
 //in ra các phần tử của mảng trên cùng 1 dòng
                System.out.print(mangs[i] + "\t"); // \t in cùng dấu cách
            }
            System.out.print("\nIn mảng theo thứ tự tăng dần: ");
            Arrays.sort(mangs);
            for (i = 0; i < 10;i++) {
 //in ra các phần tử của mảng đã được sắp xếp trên cùng 1 dòng
                System.out.print(mangs[i] + "\t"); // \t in cùng dấu cách
            }
// in mảng theo chiều đảo ngược: chưa biết làm

// in ra các số chẵn trong mảng
            System.out.print("\nCác số chẵn trong mảng là: ");
            for (i = 0; i < 10;i++) {
                if (mangs[i] %2 == 0 ) {
                    System.out.print(mangs[i] + "\t");
                }
            }
// in ra phần thử có giá trị lớn nhất
            System.out.print("\nSố lớn nhất trong mảng là: ");
            for (i = 0; i < 10;i++) {
                Arrays.sort(mangs);
            }
                System.out.print(mangs[i-1]);

// in ra phần thử có giá trị lớn nhì
            System.out.print("\nSố lớn nhì trong mảng là: ");
            for (i = 0; i < 10;i++) {
                Arrays.sort(mangs);
            }
            System.out.print(mangs[i-2]);
// in ra phần thử có giá trị nhỏ nhất
            System.out.print("\nSố nhỏ nhất trong mảng là: ");
            for (i = 0; i < 10;i++) {
                Arrays.sort(mangs);
            }
            System.out.print(mangs[0]);
    }
// In ra tên của thành viên Digital theo alphabel
    static String[] Digital;
    public static void Baim2(){

            Digital = new String[] {"Linh", "Trang", "Vân Anh", "Lý", "Phong", "Hải", "Toàn", "T.Anh", "Thảo", "Dũng1", "Dũng 3", "Đức", "Oanh", "Mai", "Luyến"};
            Arrays.sort(Digital);
            for (int i = 0; i < Digital.length;i++) {
            System.out.print(Digital[i] + "\t"); // \t in cùng dấu cách
        }
    }

//Bài 3 về list

    public static void Baim3(){
          List<Integer> list3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập 10 số vào đây:");
        int i;
        for (i = 0; i<10; i++){
            int num= scanner.nextInt();
            list3.add(num); // add mới phần tử của list dùng add, thay đổi giá trị dùng set, lấy ra dùng get
        }
        System.out.print("In ra toàn bộ mảng: " );
        for (i = 0; i < 10;i++) {
            //in ra các phần tử của mảng trên cùng 1 dòng
            System.out.print(list3.get(i) + "\t"); // \t in cùng dấu cách
        }
        System.out.print("In ra toàn bộ mảng: " );
        for (i = 0; i < 10;i++) {
            //in ra các phần tử của mảng trên cùng 1 dòng
            System.out.print(list3.get(i) + "\t"); // \t in cùng dấu cách
        }
    }



    public static void main(String[] args) {
//        Bai1();
//        Bai2();
//        Bai3();
//        Bai4();
//        Bai5();
//        Baim1();
//        Baim2();
        Baim3();

    }
}
