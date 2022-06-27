import java.util.*;

public class Lý {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        bai10();
        bai9();
        bai8();
        bai6();
        bai7();
        bai5();
        bai4();
        bai3();
        bai2();
        bai1();
    }

    private static void bai10() {
        System.out.println("Bài 10: BT chuỗi kí tự");
        //Tạo đối tượng String
        String s1 = new String("abcdefg");
        String s2 = new String("jdk8");
        //Nối chuỗi
    }

    private static void bai9() {
        System.out.println("\nBài 9: In ra danh sách thành viên nhập từ bàn phím");
        //Khai báo list
        List<String> QE = new ArrayList<>();
        System.out.println("Nhập số lượng thành viên: ");
        int n = sc.nextInt();
        int i; //khai báo biến i để sử dụng nhiều lần
        //Sử dụng vòng lặp nhập tên từng thành viên
        for(i = 0; i < n; i++){
            System.out.println("Nhập tên thành viên:");
            String name = sc.next();
            QE.add(name);
        }
        Collections.sort(QE);
        System.out.println("In ra danh sach cac thanh vien");
        System.out.print(QE);
    }

    private static void bai8() {
        System.out.println("\nBài 8- Giống bài 6 sử dụng list");
        System.out.println("Khai báo list số nguyên n phần tử nhập từ bàn phím");
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int i;
        System.out.println("Nhập phần tử: ");
        List<Integer> songuyen = new ArrayList<>();
        for(i = 0; i < n;i++){
            int phantu = sc.nextInt();
            songuyen.add(phantu);// add mới phần tử của list dùng add, thay đổi giá trị dùng set, lấy ra dùng get
        }
        System.out.println("\nIn xuôi:");
        for (int number:songuyen) {
            System.out.print(number+" ");
        }
        System.out.println("\nIn ngược:");
        for (i = n - 1; i >= 0; i--){
            System.out.print(songuyen.get(i)+ " ");
        }
        System.out.println("\nIn số chẵn:");
        for (i = 0; i < n; i++){
            if(songuyen.get(i) % 2 == 0){
                System.out.print(songuyen.get(i)+ " ");
            }
        }
        System.out.println("\nIn số lớn nhất, nhỏ nhất, lớn nhì");
        Collections.sort(songuyen);
        System.out.println("Số lớn nhất là: "+ songuyen.get(n-1));
        System.out.println("Số lớn nhì là: "+ songuyen.get(n-2));
        System.out.println("Số nhỏ nhất là: "+ songuyen.get(0));
    }

    private static void bai7() {
        System.out.println("\nBài 7: Khai báo mảng String chứa tên các thành viên của team QE ,Sắp xếp mảng theo bảng chữ cái a b c -> in ra");
        System.out.println("Nhập số lượng thành viên team:");
        int n = sc.nextInt();
        String[] qes = new String[n];//độ dài mảng = số lượng thành viên
        for (int i = 0; i < n; i++){
            System.out.printf("member[%d] =", i);//Nhập tên thành viên
            qes[i] = sc.next();
        }
        Arrays.sort(qes);//sort mảng
        for (String member:qes) { //tạo vòng lặp để in thành viên
            System.out.print(member + " ");
        }
    }

    private static void bai6() {
        System.out.print("\nBài 6  ");
        System.out.println("Khai báo mảng số nguyên n phần tử nhập từ bàn phím");
         //Tạo loop nhập từ bàn phím
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] songuyens = new int[n];//khai báo mảng
        System.out.println("Nhập phần tử cho mảng");
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            songuyens[i] = sc.nextInt();
        }
        System.out.println("In xuôi:"); //Dùng vòng lặp for each in các số ra màn hình
        for (int number:songuyens) {
            System.out.print(number+ " ");
        }
        System.out.println("\nIn ngược:");//Dùng vòng lặp for each in ngược
        for(i = (n -1); i >= 0; i--){
            System.out.print(songuyens[i]+ " ");
        }
        System.out.println("\nIn ra các số chẵn trong mảng");
        for (i = 0; i < n; i++){
            if(songuyens[i] % 2 == 0){
                System.out.print(songuyens[i]+ " ");
            }
        }
        System.out.println("\nIn ra phần tử có giá trị lớn nhất, lớn nhì , nhỏ nhất trong mảng");
        int max = songuyens[0];
        int min = songuyens[0];
        for(i = 0; i < n; i++) {
            //Tìm số lớn nhất
            if(songuyens[i]>max){
                max = songuyens[i];
            }
            //Tìm số nhỏ nhất
            if(songuyens[i]<min){
                min = songuyens[i];
            }
        }
        //Tìm số lớn nhì
        Arrays.sort(songuyens);
        System.out.println("Số lớn nhì là: "+ songuyens[n-2]);
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: "+ min);
    }

    private static void bai5() {
        System.out.println("\nBài 5 - Tính tổng từ 0 đến n và Tính giai thừa của n;");
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        int tong = 0;
        int giaithua = 0;
        int i = 0;
        while (i < n){
            i++;
            tong += i;
            giaithua = i*(i+1);
        }
        System.out.println("Tổng là: " + tong + "\nGiai thừa là: " + giaithua);
    }

    private static void bai4() {
        System.out.println("\nBài 4 - Dùng do...while để viết một chương trình nhập số tự nhiên từ bàn phím");
        int a;
        do {
            System.out.println("Nhập số:");
            a = sc.nextInt();
        } while (a != 0);
        System.out.println("Chương trình kết thúc");
    }

    private static void bai3() {
        System.out.println("\nBài 3 - Sử dụng while để tìm tất cả các số a thỏa mãn");
        int a = 1;
        while (a < 100){
            a++;
            if((a % 5 != 0) && (a % 3 == 0)){
                System.out.print(a + " ");
            }
        }
    }

    private static void bai2() {
        System.out.println("\nBài 2 - Sử dụng vòng lặp in ra màn hình dãy số có bắt đầu và kết thúc là 2 số vừa nhập");
        System.out.println("Mời bạn nhập lần lượt 2 số nguyên dương a và b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= b){
            System.out.print("Dãy số có bắt đầu và kết thúc là 2 số vừa nhập là: ");
            for (int i = a; i <= b; i++ ){
                System.out.print(i + " ");
            }
        }
        if(a > b){
            System.out.print("Dãy số có bắt đầu và kết thúc là 2 số vừa nhập là: ");
            for (int i = b; i <= a; i++ )
                System.out.print(i + " ");
        }

    }

    private static void bai1() {
        System.out.println("\nBài 1 - Dùng vòng lặp in ra dãy số chẵn từ 0 - 100");
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println("\nDùng vòng lặp in ra dãy số lẻ từ 0 - 100");
        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }

        }
    }
}
