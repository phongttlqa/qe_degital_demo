package OOP.BaiTap.Linh;

public class Animals {
    private double weight;
    private String  animalFrom;

    public Animals(double weight, String animalFrom){
        this.weight = weight;
        this.animalFrom = animalFrom;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalFrom() {
        return animalFrom;
    }

    public void setAnimalFrom(String animalFrom) {
        this.animalFrom = animalFrom;
    }

    public  String getAnimalSound(){
        return "Animal Sounds ";

    }

    public  String getAnimalReproduction(){
        return "Animal Reprodutcion: Eggs laying or giving birth ";
    }


}
