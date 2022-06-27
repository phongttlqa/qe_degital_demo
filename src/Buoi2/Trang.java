package Buoi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trang {
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Trang buoi_2 = new Trang();
        buoi_2.bai_1();
        System.out.print("a="); // in ra màn hình thông tin mong muốn
        int a = buoi_2.nhap(); // gọi hàm  nhập để nhập vào từ bàn phím 1 số nguyên, gán vào biến đã khai báo
        System.out.print("b=");
        int b = buoi_2.nhap();
        buoi_2.bai_2(a, b);
        buoi_2.bai_3();
        buoi_2.bai_4();
        System.out.print("n=");
        int n = buoi_2.nhap();
        buoi_2.bai_5(n);
    }

    int nhap() { // hàm này để nhập số nguyên từ bàn phím
        return input.nextInt();
    }

    // Bài tập 1_
    void bai_1() {
        System.out.println("Bài 1: In các số chẵn");
        List<String> listSoChan = new ArrayList<>(); // khai báo 1 ds có tên là listSoChan
        for (int i = 0; i <= 100; i++) { // giới hạn ds bằng cách chỉ set phần tử từ 0 -> 100
            if (i % 2 == 0) { // nếu phần tử đang kiểm tra là số
                listSoChan.add(String.valueOf(i)); // thì phần tử đó được add vào ds listSoChan
            }
        }
        System.out.println(String.join(",", listSoChan));  // giữa các phần tử của list listSoChan, được kết nối với nhau bằng dấu phẩy

        System.out.println("Bài 1:In các số lẻ");
        List<String> listSoLe = new ArrayList<>();
        for (int j = 0; j <= 100; j++) {
            if (j % 2 != 0) {
                listSoLe.add(String.valueOf(j));
            }
        }
        System.out.println(String.join(",", listSoLe));
    }

    // Bài tập 2
    void bai_2(int a, int b) {
        int i;
        if (a <= b) // vì in ra các số trong đoạn a, b nếu  phải kiểm tra nếu a<b thế mới cho in
        {
            System.out.print("Bài 2: Dãy số thuộc [a,b] là:");
            for (i = a; i <= b; i++)
            {
               System.out.print(i + ",");
            }
        }
        else{ // nếu b<a thì không hợp lệ -> Chỗ này in dãy số giảm dần cũng được
            System.out.println("Bài 2:không có dãy số thuộc [a,b]");
        }
    }
        // Bài 3
        void bai_3 () {
            System.out.println("\nBài 3: List các số thỏa mãn điều kiện thuộc [0;100] và (chia hết cho 3 và không chia hết cho 5) là:");
            int i = 1;
            while (i < 100 ) {
                    if ((i % 3 == 0) && (i % 5 != 0))
                    {
                        System.out.print(i+",");
                    }
                    i++; // Chỗ này vì chia hết cho 3 nên có thể tăng 3 đơn vị 1 lúc cho nó nhanh

            }
        }
        // Bài 4
        void bai_4 () {
            //Scanner input = new Scanner(System.in);
            int n;
            System.out.println("\nBài 4");
            do {
                System.out.print("Nhập phần tử # 0 : "); // câu lệnh được thực thi ít nhất 1 lần, đầu tiên  in ra màn hình thông điệp muốn user nhập và cho phép user nhập 1 giá trị số nguyên
                n = input.nextInt();
            }
            while (n != 0); // sau khi người dùng nhập xong lần 1, nó sẽ kiểm tra điều kiện này, nếu thỏa mãn nó thực hiện lặp lại câu lệnh trong ngoặc, nếu không hỏa mãn dừng vòng lặp và chuyển sang bước sau là in ra tb
            System.out.println("Kết thúc chương trình ");
        }
        //Bài 5
        void bai_5 ( int n){
            int sum = 0; //  ban đầu chưa được tính toán gì , lúc nãy tổng = 0
            int giaithua = 1; // ban đầu chưa được tính toán gì , lúc nãy  giai thừa = 1
            int i;
            for (i = 0; i <= n; i++) {
                sum = sum + i; // duyệt từng phần tử rồi tính tổng
            }
            System.out.println("Bài 5: Tổng các số từ  0 -> n=" + sum);
            for (i = 1; i <= n; i++) {
                giaithua = giaithua * i; // duyệt từng phần tử rồi tính giai thừa
            }
            System.out.println("Bài 5:Giai thừa của n=" + giaithua);

        }

    }

