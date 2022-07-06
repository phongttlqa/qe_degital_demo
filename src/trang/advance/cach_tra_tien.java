package trang.advance;

public class cach_tra_tien {
    static int count(int S[], int m, int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (m <= 0) return 0;
        return count(S, m - 1, n) +
                count(S, m, n - S[m - 1]);
    }

    public static void main(String args[]) {
        int arr[] = {500, 200, 100, 50, 20, 10};
        int m = arr.length;
        System.out.println(count(arr, m, 2000));
    }


}
