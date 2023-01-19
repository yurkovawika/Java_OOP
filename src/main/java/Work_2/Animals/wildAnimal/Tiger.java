package Work_2.Animals.wildAnimal;

import Work_2.Animals.Animals;

public class Tiger extends wildAnimal implements Animals {
    public Tiger(String habitat, String dateOfLocation) {
        super(habitat, dateOfLocation);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger say 'rrrrrr'.");
    }

    @Override
    public String print() {
        return String.format("\nInfo about tiger:\n%s.",super.print());
    }


    public String toString() {
        return String.format("Info about tiger:\n%s",super.print());
    }
}
