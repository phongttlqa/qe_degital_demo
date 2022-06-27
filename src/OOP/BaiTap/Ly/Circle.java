package OOP.BaiTap.Ly;

public class Circle {
    private double radius;
    private String color;
    //Tạo constructor cho biến radius
    public Circle(double radius) {
        this.radius = radius;
    }
    //Tạo constructor cho biến color
    public Circle(String color) {
        this.color = color;
    }
    //Tạo constructor cho cả 2 biến
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //Tạo constructor mặc định
    public Circle() {
        //Khởi tạo giá trị mặc định cho radius = 1.0 và color = red
        radius = 1.0;
        color = "red";
    }

    //Hàm lấy và gán giá trị mới cho biến radius

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Hàm lấy và gán giá trị mới cho biến color

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Hàm tính diện tích hình tròn
    public double getArea(){
        return radius*radius*3.14;
    }
    //Hàm toString trả ra thông tin của radius và color ra màn hình console
    public String toString(){
        System.out.println("Radius: "+radius+", "+"Color: "+color);
        return radius+color;
    }
}
