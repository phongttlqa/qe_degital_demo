package OOP.Theu;

public class Student extends BaiTap2 {
   private String school;

    public Student(int age, String name, String school) {
        super(age, name);
        this.school = school;
         }

         @Override
         public void showName()
         {
             super.showName();
             System.out.println("Tên trường:" + school);



         }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
