package animal;

import food.Food;
import food.Plantfoods;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Plantfoods) {
            System.out.println(getName() + " eating " + food);
        } else {
            System.out.println(getName() + " don't eat this food");
        }
    }
}
