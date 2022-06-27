package OOP.BaiTap.Theu;

import com.sun.org.apache.xerces.internal.xs.XSAnnotation;

import java.util.Scanner;

public class Employee {
       int id;
       String firstName;
       String lastName;
       int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void getFullName(){
        System.out.println("Tên đầy đủ là:"+firstName+ " "+ lastName);
    }
    public void getAnnualSalary(){
        int AnnualSa;
        Scanner scanner = new Scanner(System.in);
        AnnualSa = salary*12;
        System.out.println("Lương 1 năm (chưa thưởng) là:"+AnnualSa);
    }
    public void upToSalary(){
        int percent;
        int newSalary;
        Scanner scanner = new Scanner(System.in);
        percent = scanner.nextInt();
        newSalary = salary + ((percent*salary)/100) ;
        System.out.println("Lương mới là:"+ newSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
