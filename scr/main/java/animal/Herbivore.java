package animal;

import food.Food;
import food.Plantfoods;

public abstract class Herbivore extends Animal {
    Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Plantfoods) {
            System.out.println(getName() + " eating " + food);
        } else {
            throw new WrongFoodException(getName() + " don't eat this food");
        }
    }
}
