package aviary;


import animal.Animal;
import animal.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class AviaryForHerbivore extends Aviary {
    private List<Herbivore> animals = new ArrayList<>();
    private int aviarySize;
    private int animalCount;

    public AviaryForHerbivore(int aviarySize) {
        if (aviarySize > 0) {
            this.aviarySize = aviarySize;
        } else {
            System.out.println("Aviary size cannot be less than 1");
        }
    }

    @Override
    public void addAnimal(Animal animal) {
        if (aviarySize > animals.size() && animal instanceof Herbivore) {
            animals.add((Herbivore) animal);
            animalCount = animals.size();
            System.out.println(animal.getName() + " in aviary");
        } else {
            System.out.println("Aviary is full!");
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Animal getAnimalNumber(int i) {
        return null;
    }
}
