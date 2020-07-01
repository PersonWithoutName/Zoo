package animal;

import food.Food;
import food.MeatFoods;
import food.Plantfoods;

public class Duck extends Herbivore {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Plantfoods || food instanceof MeatFoods) {
            System.out.println(getName() + " eating " + food);
        }
    }

    public Duck(){
        super("Duck");
    }
}
