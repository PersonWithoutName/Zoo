package animal;

import food.Food;
import food.MeatFoods;

public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof MeatFoods) {
            System.out.println(getName() + " eating " + food);
        } else {
            throw new WrongFoodException(getName() + " don't eat this food");
        }
    }
}
