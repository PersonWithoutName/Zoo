package aviary;

import animal.Animal;

public abstract class Aviary {
    public abstract void addAnimal(Animal animal);

    public abstract int getCount();

    public abstract Animal getAnimalNumber(int i);
}
