package B3;

public class Student {  // tạo 1 class có tên là Student
    private int id;     // Khai báo thuộc tính
    private String name; // Có 2 thuộc tính id và name.

    public Student(int id) {    // Hàm khởi tạo có 1 tham số là id
        // Sử dụng từ khóa this để truy cập thuộc tính trong lớp
        // nếu không sử dụng từ khóa this thì đang truy cập vào tham số của hàm khởi tạo
        this.id = id;
    }

//    Có thể có nhiều hàm khởi tạo nhưng tham số truyền vào phải khác nhau
//    Nếu không có hàm khởi tạo thì java sẽ cho cta 1 hàm khởi tạo mặc định
//    Hàm khởi tạo mặc định thì không có tham số
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {   // Cung cấp phương thức lấy giá trị id
        return id;
    }

    public String getName() {  // Cung cấp phương thức lấy giá trị name
        return name;
    }

    public void setName(String name) {  // Cung cấp phương thức gán giá trị name
        this.name = name;
    }

    public void printInfo() {
        if (name.equals("")) {
            System.out.println("Name is null");
        } else {
            System.out.println("Student information : " +id+" - "+ name);
        }
    }

    public String printInfoHasReturnValue() {
        String info = "Student information : " +id+" - "+ name;
        return info;
    }
}
