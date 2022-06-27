import java.util.*;

public class Buoi_2_Mang_Trang {
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buoi_2_Mang_Trang buoi_2 = new Buoi_2_Mang_Trang();
        buoi_2.bai1();
        buoi_2.bai2();
        buoi_2.bai3();
        buoi_2.bai4();
    }

    void bai1() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Nhập từng phần tử của mảng");
        for (int i = 0; i <= 9; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu đã nhập " + Arrays.toString(arr)); // Mảng ban đầu đã nhập
        System.out.println("\nMảng sau khi đảo ngược "); // in mảng theo chiều đảo ngược
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr); // sắp xếp mảng tăng dần
        int new_arr[] = new int[arr.length]; // tạo a 1 mảng mới có độ dài = mảng arr
        new_arr = arr; // coppy data từ mảng cũ
        System.out.println("\nPhần tử lớn nhất là " + new_arr[9]); // phần tử cuối cùng là phẩn tử lớn nhất
        System.out.println("\nPhần tử lớn thứ 2  là " + new_arr[8]);
        System.out.println("\nPhần tử bé nhất là " + new_arr[0]); // phần từ đầu tiên là phần tử nhỏ nhất
        System.out.println("\nCác số chẵn trong mảng "); // in ra các số chẵn trong mảng
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }

    }

    void bai2() {
        System.out.print("Số thành viên team Digital ");
        int n = input.nextInt();
        String[] arr = new String[n];
        System.out.println("Nhập từng thành viên của Team");
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        Arrays.sort(arr);
        System.out.println("\nSắp xếp:" + Arrays.toString(arr));
    }

    void bai3() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        System.out.println("Nhập 10 phần tử của List");
        for (int i = 0; i < 10; i++) {
            list1.add(input.next());
        }
        System.out.println("List đã nhập là: " + list1);
        System.out.println("List đảo ngược là");
        for (int i = 9; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
//        System.out.println("Các phần tử chẵn trong List là: ");
//        for(int i=0; i<10; i++)
//        {
//            if(list1.get(i) %2==0)
//            {
//                System.out.print(list1.get(i)+ " ");
//            }
//        }
        Collections.sort(list1);
        //list2 = list1;
        //System.out.println("\nPhần tử lớn nhất trong List là " + list1.get(10)); // phần tử cuối cùng là phẩn tử lớn nhất
        System.out.println("\nPhần tử lớn thứ 2 trong List  là " + list1.get(9));
        System.out.println("\nPhần tử bé nhất  trong Listlà " + list1.get(0)); // phần từ đầu tiên là phần tử nhỏ nhất

    }

    void bai4() {
        List<String> list1 = new ArrayList<String>();
        System.out.print("Số thành viên team Digital ");
        int n = input.nextInt();
        System.out.println("Nhập từng thành viên của Team");
        for (int i = 0; i < n; i++) {
            list1.add(input.next());
        }
        Collections.sort(list1);
        System.out.println("\nSắp xếp:" + list1);

    }
}
