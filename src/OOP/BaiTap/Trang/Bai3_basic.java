package Buoi4;

public class Bai3_basic {
    private double radius; // khai báo biến bán kính
    private String color;//khai báo biến màu

    public Bai3_basic(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Bai3_basic() {
        this. radius=1;
        this.color="red";
    }

    public Bai3_basic(double radius) {
        this.radius = radius;
    }

    public Bai3_basic(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius_) {
        this.radius = radius_;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color_) {
        this.color = color_;
    }
    public double s_circle() { // tính diện tích hình tròn
        return radius*radius*3.14;
    }
    public void showInformation() {
        System.out.print("\nMàu là " + color );
        System.out.print("\nDiện tích là " + s_circle() );
    }

}
