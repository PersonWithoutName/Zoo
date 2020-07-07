package animal;

import food.AllFood;

public abstract class Herbivore extends Animal {
    Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(AllFood allFood) {
        if (allFood == AllFood.GRASS || allFood == AllFood.VEGETABLES){
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
