package animal;

import food.Food;
import food.MeatFoods;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof MeatFoods){
            System.out.println(getName() + " eating " + food);
        } else {
            System.out.println(getName() + " don't eat this food");
        }
    }
}
