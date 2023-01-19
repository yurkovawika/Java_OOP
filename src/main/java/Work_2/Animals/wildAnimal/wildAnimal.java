package Work_2.Animals.wildAnimal;

import Work_2.Animals.Animals;

public  abstract class wildAnimal implements Animals {

    private String habitat; // место обитания
    private String dateOfLocation; // дата нахождения

    public wildAnimal (String habitat, String dateOfLocation ){
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }


    @Override
    public void makeSound() {

    }

    @Override
    public String print() {
        return String.format("habitat: %s, date of location: %s", habitat, dateOfLocation );
    }

}
