package baitap2406;

public class Circle {
        private double radius;
        private String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "red";
        }
        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        public Circle(double radius) {
        this.radius = radius;
    }
        public Circle(String color) {
        this.color = color;
        }
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void getArea() {
            float area;
            area = (float) (3.14*radius*radius);
            System.out.println( + area+ " " +color);
        }


}

