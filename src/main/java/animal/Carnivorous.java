package animal;

import food.AllFood;

import static food.AllFood.BEEF;
import static food.AllFood.PORK;

public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(AllFood allFood) {
//        if (MeatFood.valueOf(meatFood)) {
//            System.out.println(getName() + " eating " + food);
//        } else {
//            throw new WrongFoodException(getName() + " don't eat this food");
//        }
        if (allFood == PORK || allFood == BEEF) {
            System.out.println(getName() + " eating " + allFood.getFoodName());
        } else {
            try {
                throw new WrongFoodException("WrongFood");
            } catch (Exception e) {
                System.err.println(getName() + " don't eat this food");
            }
        }
    }
}
