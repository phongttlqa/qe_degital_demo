package OOP.BaiTap.Linh;

public class Cat extends Animals{
    private String foods;
    public Cat(double weight, String animalFrom) {
        super(weight, animalFrom);
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    @Override
    public String getAnimalReproduction() {
        return "Giving live birth";
    }

    @Override
    public String getAnimalSound() {
        return "Meow meow";
    }
}
