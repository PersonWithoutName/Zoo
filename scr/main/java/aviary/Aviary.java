package aviary;

import animal.Animal;

public abstract class Aviary {
    private int maxCountOfAnimals;
    private int animalsCount;
    private int aviarySize = 0;

    public abstract void addAnimal(Animal animal);

    public abstract int getCount();

    public abstract Animal getAnimalNumber(int i);


}
