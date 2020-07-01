import animal.*;
import aviary.*;

public class Main {
    public static void main(String[] args) {
        AviaryForCarnivorous aviaryForCarnivorous = new AviaryForCarnivorous(8);
        AviaryForHerbivore aviaryForHerbivore = new AviaryForHerbivore(10);

        for (int i = 0; i < 2; i++){
            aviaryForCarnivorous.addAnimal(new Lion());
//            aviaryForCarnivorous.addAnimal(new Tiger());
        }

        for (int i = 0; i < 2; i++){
            aviaryForHerbivore.addAnimal(new Zebra());
            aviaryForHerbivore.addAnimal(new Duck());
        }
    }
}
