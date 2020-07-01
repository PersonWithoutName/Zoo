import animal.*;
import aviary.*;
import food.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        Food[] foods = new Food[]{new Beef(), new Grass(), new Pork(), new Vegetables()};

        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * foods.length);
                Food food = foods[random];
                Animal animal = aviary.getAnimalNumber(i);
                System.out.println(animal + " received from a zoo worker: " + food);
                animal.eat(food);
            }
        }

    }
}
