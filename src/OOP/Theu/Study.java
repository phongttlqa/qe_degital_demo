package OOP.Theu;

public class Study extends Human {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Study(String name, int age, String school) {
        super(name, age);
        this.school = school;// taij sao thieu dong nay lai tra ra null nhi?

    }
    public void printInfor(){
        System.out.println("Học sinh- tuổi- trường là: "+name+ "- "+ age+ "- "+ school);
       }
}
