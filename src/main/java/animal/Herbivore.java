package animal;

import food.AllFood;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class Herbivore extends Animal {

    Herbivore(String name) {
        super(name);
    }

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void eat(AllFood allFood) {
        if (allFood == AllFood.GRASS || allFood == AllFood.VEGETABLES) {
            System.out.println(getName() + " eating " + allFood.getFoodName());
        } else {
            try {
                throw new WrongFoodException("WrongFood");
            } catch (Exception e) {
                logger.error(getName() + " don't eat this food");
            }
        }
    }
}
