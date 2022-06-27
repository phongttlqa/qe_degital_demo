import java.util.Arrays;
import java.util.Scanner;

public class practiceJavaMang_Hai {
  public static void main(String[] args) {
    java1();
    soChan();
    maxmin();
    string();
  }

  private static void string() {
    String name[] = {"Anh", "Phong", "Hải" ,"Thêu", "Trang", "Linh", "Lý"};
    Arrays.sort(name);
    for(String array : name) {
      System.out.println(array + " ");
    }
  }

  private static void maxmin() {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Nhập số phần tử của mảng số nguyên");
    int soNguyen[] = new int[10];
    for (int i = 0; i < soNguyen.length; i++) {
      System.out.println("Nhập phần tử thứ: " + i);
      soNguyen[i] = scan.nextInt();
    }
    System.out.println(" Phần tử lớn nhất trong mảng là: ");
    int max = soNguyen[0];
    for (int i = 0 ; i< soNguyen.length; i++){
      if(max < soNguyen[i]){
        max = soNguyen[i];
      }
    }
    System.out.println(max);
    System.out.println(" Phần tử nhỏ nhất trong mảng là: ");
    int min = soNguyen[0];
    for (int i = 0; i<soNguyen.length; i++){
      if(min> soNguyen[i]){
        min=soNguyen[i];
      }
    }
    System.out.println(min);

    System.out.println(" Phần tử lớn thú 2 trong mảng là: ");
    int lagest2 = soNguyen[0];
    for (int i =0; i < soNguyen.length; i++){
      if(soNguyen[i] > lagest2 && soNguyen[i] < max){
        lagest2 = soNguyen[i];
      }
    }
    System.out.println(lagest2);
  }

  private static void soChan() {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Nhập số phần tử của mảng số nguyên");
    int soNguyen[] = new int[10];
    for (int i = 0; i < soNguyen.length; i++) {
      System.out.println("Nhập phần tử thứ: " + i);
      soNguyen[i] = scan.nextInt();
    }
    System.out.println(" Số chẵn trong mảng là: ");
    for (int i = 0; i < soNguyen.length; i++) {
      if (soNguyen[i] % 2 == 0) {
        System.out.println(soNguyen[i] + " \t ");
      }
    }
  }

  private static void java1() {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Nhập số phần tử của mảng số nguyên");
    int soNguyen[] = new int[10];
    for (int i = 0; i < soNguyen.length; i++) {
      System.out.println("Nhập phần tử thứ: " + i);
      soNguyen[i] = scan.nextInt();
    }
    System.out.println(" Các phần tử của mảng đã nhập là: ");
    for (int i = 0; i < soNguyen.length; i++) {
      System.out.print(soNguyen[i] + "\t");
    }

    System.out.println(" Đảo ngược các vị trí phần tử của mảng: ");
    for (int i = 0; i < soNguyen.length / 2; i++) { //điều kiện là độ dài của mảng /2 vì mỗi lần lặp đổi chỗ, ta được 1 cặp sắp xếp, i++, khi i< n/2 => các vị trí của mảng đã đảo ngược
      int temp = soNguyen[i]; //gán temp với vị trí đầu tiên của mảng, i=0
      soNguyen[i] = soNguyen[soNguyen.length - i - 1]; //đổi chỗ vị trí soNguyen[0] = soNguyen[10-0-1] = 9 = soNguyen[9] tức là giá trị cuối cùng n-1
      soNguyen[soNguyen.length - i - 1] = temp; //gán lại
    }
    for (int i = 0; i < soNguyen.length; i++) {
      System.out.println(soNguyen[i]);
    }
  }
}
