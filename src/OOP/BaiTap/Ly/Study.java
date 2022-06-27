package OOP.BaiTap.Ly;

public class Study extends Human{
    private String tenTruong;

    public Study(String name, int age, String tenTruong) {
        super(name, age);
        this.tenTruong = tenTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public void showin4(){
        System.out.println(name+ " " +age+" "+tenTruong);
    }
    @Override
    public void showName(){
        super.showName();
        System.out.println(tenTruong);
    }
}
