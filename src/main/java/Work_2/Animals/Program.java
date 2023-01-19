package Work_2.Animals;

import Work_2.Animals.petAnimal.*;
import Work_2.Animals.wildAnimal.*;


public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Cat cat1 = new Cat("Barsik", "metis", "true", "black", "12.05.2019", "true");
        Dog dog1 = new Dog("Sharik", "dolmatian", "true", "white with black speckles", "06.10.2020", "false");
        Tiger tiger1 = new Tiger("tropic forest", "23.01.2017");
        Wolf wolf1 = new Wolf("steppes", "11.05.2020", "true");
        Chicken chicken1 = new Chicken("Chiсksa");
        Stork stork1 = new Stork("Stork", 1000);

        Menu.MenuZoo(zoo);
    }
}
