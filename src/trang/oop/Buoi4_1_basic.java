package trang.oop;

import java.util.*;
import java.util.stream.Collectors;

public class Buoi4_1_basic {
    String firsName, lastName;
    int id, salary;

    public Buoi4_1_basic(String firsName, String lastName, int id, int salary) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirsName() {
        return firsName;
    }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return firsName +  lastName;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int getUpToSalary(int percent) {
        return  (percent/100)* salary;
    }

    public  void setAge(int id_) {
        this.id=id_;
    }
    public  void setSalary(int salary_) {
        this.salary=salary_;
    }
    public  void setFistname(String firsName_) {
        this.firsName=firsName;
    }
    public  void setLastname(String lastName) {
        this.lastName=lastName;
    }
    public  void showInformation( ) {
       System.out.print("Họ tên là:" + firsName+lastName);
       System.out.print("\nMã nhân viện:" + id);
       System.out.print("\nLương:" + salary);
    }

}
