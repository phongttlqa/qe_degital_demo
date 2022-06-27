import java.util.Scanner;

public class practiceJava2_Hai {
  public static void main(String[] args){
    java1();
    java2();
    java3();
    java4();
    java5();
    factorial();
  }

  private static void factorial() {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Mời bạn nhập số number");
    int n = scan.nextInt();
    int factorial=1;
    if(n == 0 || n == 1){ //Bắt trường hợp nếu n=0 hoặc n=1 thì sẽ return luôn factorial = 1
      System.out.println(factorial);
    } else { //ngược lại
      for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
      }
      System.out.println(" Giai thừa của số number là " + factorial);
    }
  }

  private static void java1() {
    for(int i = 0; i < 100; i++){
      if( i == 0 ){
        System.out.println(i + " không là số chẵn lẻ ");
        System.out.print("Các số chẵn từ 0 đến 100 là: ");
      } else if (i % 2 == 0){
        System.out.print(i + " ");
      }
    }
    System.out.println( " ");
    System.out.print("Các số lẻ từ 0 đến 100 là: ");
    for(int i = 0; i < 100; i++){
      if(i % 2 != 0 ){
        System.out.print(i+ " ");
      }
    }
    System.out.println(" ");
  }

  private static void java2() {
    Scanner scan = new Scanner(System.in);
    System.out.println("B2. Nhap số bắt đầu");
    int a = scan.nextInt();
    System.out.println("B2. Nhap số kết thúc");
    int b = scan.nextInt();
    System.out.print("Dãy số bắt đầu từ a và kết thúc ở b là: ");
    if( a < b) {
      for (int i = a; i <= b; i++) {
        System.out.print(i + " ");
      }
    } else if (a > b){
        for(int i = a; i >= b; i--){
          System.out.println(i + " ");
        }
      } else {
      System.out.println(a);
    }
    System.out.println(" ");
  }

  private static void java3() {
    int a = 0;
    System.out.print(" Các số từ 0 -> 100 chia hết cho 3 nhưng không chia hết cho 5 là: ");
    while (a  < 100 ){
        a++;
        if( a % 3 == 0 && a % 5 != 0){
          System.out.print(a + " ");
        }
    }
  }
  private static void java4() {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    do {
      System.out.println(" Lần nhập thứ " +num);
      num--;
      if(num == 0){ //Nếu num=0 thì in kết thúc luôn
        System.out.println(" Lần nhập thứ "+num);
        System.out.println(" End");
      }
    } while (num > 0);
  }

  private static void java5() {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Mời bạn nhập số n: ");
    int n = scan.nextInt();
    int sum = 0;
    for(int i=0; i <= n; i++){
      sum = sum + i;
    }
    System.out.println(" Tổng các số từ 1 -> n là: " +sum);
  }


}
