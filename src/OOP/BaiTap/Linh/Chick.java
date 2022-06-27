package OOP.BaiTap.Linh;

public class Chick extends Animals{
    private int eggQuantity;
    public Chick(double weight, String animalFrom) {
        super(weight, animalFrom);
    }

    public int getEggQuantity() {
        return eggQuantity;
    }

    public void setEggQuantity(int eggQuantity) {
        this.eggQuantity = eggQuantity;
    }

    @Override
    public String getAnimalSound() {
        return "Ò Ó O";
    }

    @Override
    public String getAnimalReproduction() {

        return "Lay eggs";
    }
}
