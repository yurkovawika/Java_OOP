package Work_2.Animals.wildAnimal;

import Work_2.Animals.Animals;


public class Wolf extends wildAnimal implements Animals {

    private String packLeader;


    public Wolf(String habitat, String dateOfLocation, String packLeader) {
        super(habitat, dateOfLocation);
        this.packLeader = packLeader;

    }

    public String getPackLeader() {
        return packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("Wolf say 'auuuuu'.");
    }

    @Override
    public String print() {
        return String.format("Info about wolf:\n%s, pack leader: %s.", super.print(), packLeader);
    }

    @Override
    public String toString() {
        return String.format("Info about wolf:\n%s, pack leader: %s", super.print(), packLeader);
    }

}