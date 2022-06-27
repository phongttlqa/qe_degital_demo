package OOP.BaiTap.Theu;

public class Animal {
    int weight;
    String from;

    public Animal(int weight, String from) {
        this.weight = weight;
        this.from = from;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

   // Phương thức kêu
    public void Say(){
        System.out.println("Con vật kêu");
    }
    //Phương thức sinh sản
    public void reproduction(){
        System.out.println("Con vật sinh sản");
    }
}
