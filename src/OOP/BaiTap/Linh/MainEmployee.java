package OOP.BaiTap.Linh;

public class MainEmployee {
    public static void main(String[] args) {
        //new Emplyee lên để dùng hàm inputInfo
        Employee employee = new Employee();

        //Dùng hàm inpuInfo để nhập thông tin từ bàn phím
        employee.inputInfo();

        //Get employee's Info
        System.out.println("Employee's Information: " + " Id "+ employee.getId() + " - " + employee.getFullName());

        //Set employee monthly salary
        employee.setSalary(1000);
        System.out.println("Monthly salary: " + employee.getSalary());

        //Get annual salary
        System.out.println("Annual Salary: " + employee.annualSalary());

        //Annual salary up to 50%
        System.out.println("Up to Salary: " + employee.upToSalary());


        //Get updated day
        System.out.println("Last update on: " + employee.getLastUpdateTime());
    }
}
