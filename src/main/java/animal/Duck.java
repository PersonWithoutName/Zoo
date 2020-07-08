package animal;

import food.AllFood;

import static food.AllFood.BEEF;
import static food.AllFood.PORK;

public class Duck extends Herbivore {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat(AllFood allFood) {
        if (allFood == AllFood.GRASS || allFood == AllFood.VEGETABLES ||allFood == PORK || allFood == BEEF ) {
            System.out.println(getName() + " eating " + allFood);
        }
    }

    public Duck(){
        super("Duck");
    }
}
