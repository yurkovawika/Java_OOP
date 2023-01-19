package Work_2.Animals.wildAnimal;

import Work_2.Animals.Bird;

public class Stork extends Bird {
    private String name;

    public Stork(String name,int flightAltitude) {
        super(flightAltitude);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s say 'kr kr kr'.\n", getName());
    }

    @Override
    public String print() {
        return String.format("\nInfo about stork:\nname %s, %s",this.name,super.print());
    }


    public String toString() {
        return String.format("Info about stork:\nname %s, %s",this.name,super.print());
    }

}
