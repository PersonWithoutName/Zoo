package animal;

import food.Food;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(Food food);

    @Override
    public String toString(){
        return name;
    }
}
