package pTest;

import java.util.*;

public class TinhLaiNganHang {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float lai = 0;
        int a = 1;
        for (int i = 600; i > 0; i-=10) {
            lai += tinhLai(i);
//            System.out.println("Lai tháng " +  a + " là " + lai);
            a++;
        }
        System.out.println("Tổng tiền phải trả " + (600.0 + lai));
    }

    private static float tinhLai(int i) {
        return (float) (i*0.005);
    }


}