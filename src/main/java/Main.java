import animal.*;
import aviary.*;
import com.google.gson.Gson;
import food.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws WrongFoodException {
        Gson gson = new Gson();
        ZooWorker zooWorker = null;

        try (FileReader reader = new FileReader("ZooWorker.json")) {
            if (reader.ready()) {
                zooWorker = gson.fromJson(reader, ZooWorker.class);
                log.info("Object load success");
            }
        } catch (IOException e) {
            log.error("Failed to load the object.");
        }

        if (zooWorker == null) {
            log.info("Create and load an object into a file");
            try (FileWriter writer = new FileWriter("ZooWorker.json")) {
                zooWorker = new ZooWorker("Bob", 45);
                gson.toJson(zooWorker, writer);
                writer.flush();
            } catch (IOException e) {
                log.error("Failed to save the object.");
            }
        }

        AviaryForCarnivorous aviaryForCarnivorous = new AviaryForCarnivorous(5);
        AviaryForHerbivore aviaryForHerbivore = new AviaryForHerbivore(10);

        for (int i = 0; i < 2; i++) {
            aviaryForHerbivore.addAnimal(new Duck());
            aviaryForCarnivorous.addAnimal(new Tiger());
        }
        for (int i = 0; i < 2; i++) {
            aviaryForCarnivorous.addAnimal(new Lion());
            aviaryForHerbivore.addAnimal(new Zebra());
        }

        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(aviaryForHerbivore);
        aviaries.add(aviaryForCarnivorous);

        List<AllFood> allFoodArrayList = new ArrayList<>();

        allFoodArrayList.add(AllFood.BEEF);
        allFoodArrayList.add(AllFood.GRASS);
        allFoodArrayList.add(AllFood.PORK);
        allFoodArrayList.add(AllFood.VEGETABLES);


        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * 4);
                Animal animal = aviary.getAnimalNumber(i);
                System.out.println(animal + " received from a zoo worker: " + allFoodArrayList.get(random));
                animal.eat(allFoodArrayList.get(random));
            }
        }

        log.info("Overwriting the changed object");
        try (FileWriter writer = new FileWriter("ZooWorker.json")) {
            if (zooWorker != null) {
                zooWorker.setDays(zooWorker.getDays() + 1);
                gson.toJson(zooWorker, writer);
                writer.flush();
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            log.error("Failed to save the object.");
        }
    }
}