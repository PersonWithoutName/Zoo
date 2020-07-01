package aviary;

import animal.Animal;
import animal.Carnivorous;

import java.util.ArrayList;
import java.util.List;

public class AviaryForCarnivorous extends Aviary {
    private List<Carnivorous> animals = new ArrayList<>();
    private int aviarySize;
    private int animalCount;

    public AviaryForCarnivorous(int aviarySize) {
        if (aviarySize > 0) {
            this.aviarySize = aviarySize;
        } else {
            System.out.println("Aviary size cannot be less than 1");
        }
    }

    @Override
    public void addAnimal(Animal animal) {
        if (aviarySize > animals.size() && animal instanceof Carnivorous) {
            animals.add((Carnivorous) animal);
            animalCount = animals.size();
            System.out.println(animal.getName() + " placed in Carnivorous aviary");
        } else {
            System.out.println("Aviary is full!");
        }
    }

    @Override
    public int getCount() {
        return animalCount;
    }

    @Override
    public Animal getAnimalNumber(int animalNumber) {
        if (0 <= animalNumber && animalNumber < aviarySize) {
            return animals.get(animalNumber);
        } else if (animalNumber < 0) {
            System.out.println("Number cannot be less than zero");
        } else {
            System.out.println("An animal with this number does not exist");
        }
        return null;
    }

}
