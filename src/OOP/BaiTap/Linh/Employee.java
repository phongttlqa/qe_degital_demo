package OOP.BaiTap.Linh;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int percent;
    private long payday;

    // Tạo constructor rỗng
    public Employee(){}

    //Tạo hàm để input info
    public void inputInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input ID: ");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.println("Input first name: ");
        this.firstName = scan.nextLine();
        System.out.println("Input last name: ");
        this.lastName = scan.nextLine();
//        scan.nextLine();
//        this.salary = scan.nextInt();
    }

    public int getId(){
        return id;
    }

    public  String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return getLastName() + " "+  getFirstName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
//        System.out.println("Input salary: ");
//        Scanner scan = new Scanner(System.in);
//        salary = scan.nextInt();
        this.salary = salary;
    }

    public int annualSalary() {
       return getSalary()*12;
    }

    public int upToSalary() {
        System.out.println("Input percent: ");
        Scanner scan = new Scanner(System.in);
        int percent = scan.nextInt();
        return getSalary()*percent/100 + getSalary();
    }
    // Tạo hàm toString get ra thời gian update cuối cùng
    public String getLastUpdateTime(){
        return new Date().toString();

    }



}
