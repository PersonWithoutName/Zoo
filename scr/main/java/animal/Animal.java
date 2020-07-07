package animal;

import food.AllFood;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(AllFood allFood) throws WrongFoodException;

    @Override
    public String toString() {
        return name;
    }
}
