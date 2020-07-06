package animal;

import food.Food;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    @Override
    public String toString() {
        return name;
    }
}
