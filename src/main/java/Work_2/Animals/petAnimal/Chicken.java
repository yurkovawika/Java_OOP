package Work_2.Animals.petAnimal;

import Work_2.Animals.Animals;
import Work_2.Animals.Bird;

public class Chicken extends Bird {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s say 'ko-ko'.\n", this.name);
    }

    @Override
    public String print() {
        return String.format("\nInfo about chicken:\nname %s, %s", this.name, super.print());
    }


    public String toString() {
        return String.format("Info about chicken:\nname %s, %s", this.name, super.print());
    }

}
