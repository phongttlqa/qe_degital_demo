package B4;

public class ConNguoi {
    int age;
    String name;
    boolean gioitinh;

    //đây là 1 constructor 2 tham số
    public ConNguoi(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ConNguoi(String name) {
        this.name = name;
    }

    public ConNguoi() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void showInfomation(){
        // todo something
        System.out.println( getName() + "  " + getAge());
    }
}
