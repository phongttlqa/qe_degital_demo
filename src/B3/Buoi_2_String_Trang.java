package B3;

import java.util.Scanner;

public class Buoi_2_String_Trang {
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Buoi_2_String_Trang buoi_2 = new Buoi_2_String_Trang();
        buoi_2.bai1_nc();
//        buoi_2.bai2_nc();
//        bai1_nc();
    }

    void bai1_nc() {
        System.out.print("Nhập chuỗi 1:");
        String str1 = input.nextLine();
        System.out.print("Nhập chuỗi 2:");
        String str2 = input.nextLine();
        String str3 = str1.concat(str2);
        System.out.print("Nối chuỗi 1 và 2 như sau: " + str3);
        System.out.print("\nChuỗi sau khi remove phần tử số là: " + str3.replaceAll("\\d", ""));
        String re_str1 = "\u202E" + str1; // tìm hiểu sau nhé
        String result = (str2.equals(re_str1)) ? "Chuỗi 1 và 2 không là đảo ngược của nhau" : " Chuỗi 1 và 2 chuỗi là đảo ngược của nhau";
        System.out.print("\n" + result);
    }

    void bai2_nc() {
        String wording = "ueoaii";
        int SL_nguyen_am=0;
        int count_u = 0;
        int count_e = 0;
        int count_o = 0;
        int count_a = 0;
        int count_i = 0;
        for (int j = 0; j < wording.length(); j++) {
            if (wording.charAt(j)== 'u') {
                count_u++;
            }
            else if (wording.charAt(j) == 'e') {
                count_e++;
            }
            else if (wording.charAt(j) == 'o') {
                count_o++;
            }
            else if (wording.charAt(j) == 'a') {
                count_a++;
            }
            else if (wording.charAt(j) == 'i') {
                count_i++;
            }

        }
        System.out.print("\nSL nguyên âm u=:" + count_u);
        System.out.print("\nSL nguyên âm e=:" + count_e);
        System.out.print("\nSL nguyên âm o=:" + count_o);
        System.out.print("\nSL nguyên âm a=:" + count_a);
        System.out.print("\nSL nguyên âm i=:" + count_i);
        if(count_u>0)
        {
            SL_nguyen_am++;
        }
         if (count_e > 0)
        {
            SL_nguyen_am++;
        }
         if (count_o > 0)
        {
            SL_nguyen_am++;
        }
         if (count_a > 0)
        {
            SL_nguyen_am++;
        }
         if (count_i > 0)
        {
            SL_nguyen_am++;
        }
        System.out.print("\nSL nguyên âm= " + SL_nguyen_am);
    }
}
