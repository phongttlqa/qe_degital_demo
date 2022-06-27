package OOP.BaiTap.Trang;

public class Bai2_basic {
    int weight;// biến cân nặng
    String root; // biến nguồn gốc xuất sứ

    public int getWeight() { // hàm get
        return weight;
    }

    public void setWeight(int weight) { // hàm set
        this.weight = weight;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Bai2_basic(int weight, String root) { // contructor
        this.weight = weight;
        this.root = root;
    }

    public void reproduction() // hàm sinh sản
    {
        System.out.print("Nơi sinh");
    }
    public void sound()
    {
        System.out.print("Tiếng kêu"); // hàm in ra tiếng kêu
    }
    public void showInformation ()
    {
        System.out.print("\nCân nặng là:" + weight);
        System.out.print("\nNguồn gốc xuất sử: " + root);
    }

}
class Cat extends Bai2_basic{
    int numberFoot; // số lượng chân
    public Cat(int weight, String root, int numberFoot) {
        super(weight, root);
    }
    @Override
    // nếu vẫn muốn in clas
    public void reproduction()
    {
            System.out.print("Sinh con");
    }
    @Override
    public void sound()
    {
        System.out.print("\nMeo meo");
    }
}

class Chicken extends  Bai2_basic{
    int wing; // số lượng cánh

    public Chicken(int weight, String root, int wing) {
        super(weight, root);
        this.wing = wing;
    }
    @Override
    public void reproduction()
    {
        System.out.print("Đẻ trứng");
    }
    @Override
    public void sound()
    {
        System.out.print("\nÒ ó o");
    }
}


