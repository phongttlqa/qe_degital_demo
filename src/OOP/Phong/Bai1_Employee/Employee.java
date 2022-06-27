package OOP.Phong.Bai1_Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // constructor có 4 tham số
    // nó là hàm khởi tạ0
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // constructor không có tham số
    public Employee() {
    }

    public Employee(int id){
        this.id = id;
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

    public int getAnnalSalary() { // trả về lương của 1 năm
        return this.salary*12;
    }

    public float upToSalary(int percent){ // trả về lương tăng theo phần trăm được truyền vào
        return (float) this.salary*percent/100;
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
