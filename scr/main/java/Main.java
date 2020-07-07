import animal.*;
import aviary.*;
import food.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongFoodException {
        AviaryForCarnivorous aviaryForCarnivorous = new AviaryForCarnivorous(5);
        AviaryForHerbivore aviaryForHerbivore = new AviaryForHerbivore(10);

        for (int i = 0; i < 2; i++) {
            aviaryForHerbivore.addAnimal(new Duck());
            aviaryForCarnivorous.addAnimal(new Tiger());
        }
        for (int i = 0; i < 2; i++) {
            aviaryForCarnivorous.addAnimal(new Lion());
            aviaryForHerbivore.addAnimal(new Zebra());
        }

        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(aviaryForHerbivore);
        aviaries.add(aviaryForCarnivorous);

        List <AllFood> allFoodArrayList= new ArrayList<>();

        allFoodArrayList.add(AllFood.BEEF);
        allFoodArrayList.add(AllFood.GRASS);
        allFoodArrayList.add(AllFood.PORK);
        allFoodArrayList.add(AllFood.VEGETABLES);


        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * 4);
                Animal animal = aviary.getAnimalNumber(i);
                System.out.println(animal + " received from a zoo worker: " + allFoodArrayList.get(random));
                animal.eat(allFoodArrayList.get(random));
            }
        }

    }
}
