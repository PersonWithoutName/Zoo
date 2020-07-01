package animal;

import food.Food;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public Duck(){
        super("Duck");
    }
    @Override
    public void eat(Food food) {
        System.out.println(getName() + " eating " + food);
    }

}
