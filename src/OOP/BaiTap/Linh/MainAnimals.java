package OOP.BaiTap.Linh;

import java.util.Scanner;

public class MainAnimals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String annimalName = scan.nextLine();
        if (annimalName.equals("cat") ) {
            Cat cat = new Cat(1.3,"Viet Nam");
            cat.setFoods("Milk, Fish, etc.");
            System.out.println("Cat from "+ cat.getAnimalFrom() +" are weight " + cat.getWeight() + " Cats make sounds like " + cat.getAnimalSound() + " Cats love " + cat.getFoods() + " and they " + cat.getAnimalReproduction());
        } else  if (annimalName.equals("chick")){
            Chick chick = new Chick(0.5, "Viet Nam");
            chick.setEggQuantity(6);
            System.out.println("Chicks from "+ chick.getAnimalFrom() +" are weight " + chick.getWeight() + " Chicks make sounds like " + chick.getAnimalSound() +  " and they " + chick.getAnimalReproduction() + " with " + chick.getEggQuantity() + " eggs per day");
        }

    }
}