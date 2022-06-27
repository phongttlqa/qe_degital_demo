package OOP.Theu;

public class BaiTap2 {
            int Age;
            String Name;

            public BaiTap2(int age, String name) {
                Age = age;
                Name = name;
            }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void showName(){
        System.out.println("Học sinh tên là: "+ Name +"");

    }
    public void showAge(){
        System.out.println("Age: " +Age+ "");
    }
}
