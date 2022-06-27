package OOP.BaiTap.Trang;

import java.util.Scanner;

public class Bai2_advance {
    private int id;
    private  String name;
    private  int balance;

    public Bai2_advance(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void credit (int amount) // khởi tạo hàm nạp tiền
    {

        if (amount >0) // nếu số cần nạp lớn hơn 0 thì mới cho nạp thành công
        {
            balance= balance +  amount;
            System.out.println("\nNạp tiền thành công,số tiền trong TK sau khi đã nạp là:"+balance);  ;
        }
        else { // nếu số cần nạp <=0 thì số dư ban đầu không thay đổi
            balance = balance;
            System.out.println("\nNạp tiền không thay công,số tiền vẫn như ban đầu là:"+balance);  ;
        }

    }

    void debit (int amount) // khởi tạo hàm thanh toán tiền (Trừ tiền)
    {
        String result;
        if (amount > balance) // nếu số tiền cần thanh toán > số tiền trong tk
        {
            balance= balance;
            System.out.println("\nThanh toán Không thành công, số tiền trong TK bạn không thay đổi, là:"+ balance);

        }
        else // nếu số tiền cần thanh toán <= só tiền trong tài khoản
        {
            balance= balance- amount;
            System.out.println("\nThanh toán  thành công, số tiền trong tk sau khi thanh toán là:" +balance);
        }

    }
    void  transfer(Bai2_advance acc1, Bai2_advance acc2) // hàm chuyển tiền sang tài khoản khác
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhập số tiền cần chuyển từ acc1 -> acc2:"); // in ra màn hình thông tin mong muốn
        int amount= input.nextInt();
        if (acc1.getBalance() >=amount && amount>0 ) // số tiền cần chuyển phải < = với số dư đang có, và >0
        {
            acc1.setBalance(acc1.getBalance() - amount) ;
            acc2.setBalance(acc2.getBalance() + amount);
            System.out.print("\nChuyển tiền thành công");
            System.out.print("\nSố tiền của acc 1 sau khi đã chuyển là:"+ acc1.balance);
            System.out.print("\nSố tiền của acc 2 sau khi được chuyển là:"+ acc2.balance);
        }else {
            System.out.print("\nChuyển tiền  thất bại");
            System.out.print("\nSố tiền của acc 1 sau khi đã chuyển là:"+ acc1.balance);
            System.out.print("\nSố tiền của acc 2 sau khi được chuyển là:"+ acc2.balance);
        }


    }

}
