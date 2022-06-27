package OOP.Phong.Bai1_Employee;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo 1 employee
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("AC");
        employee.setLastName("ádfgh");

        Employee employee1 = new Employee(1, "AC", "sdfgh",12345);
        employee1.getFirstName();
}}
