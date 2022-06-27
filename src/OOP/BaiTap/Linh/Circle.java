package OOP.BaiTap.Linh;

public class Circle {
    private double radius;
    private String color;
    //Constructor mặc định
    public Circle() {
       radius = 1.0;
       color = "red";
    }
    //Constructor radius
    public Circle(double radius) {
        this.radius = radius;
    }
    //Construtor color
    public Circle(String color) {
        this.color = color;
    }
    //Constructor radius + color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getCircleArea(){
        return radius*radius*3.14;
    }

}
