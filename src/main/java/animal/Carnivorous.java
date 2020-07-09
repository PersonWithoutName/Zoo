package animal;

import food.AllFood;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static food.AllFood.BEEF;
import static food.AllFood.PORK;

public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void eat(AllFood allFood) {
        if (allFood == PORK || allFood == BEEF) {
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
