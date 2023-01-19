package Work_2.Animals.petAnimal;

import Work_2.Animals.Animals;

public abstract class petAnimal implements Animals {
    private String name;
    private String breed; //порода


    private String vaccination;
    private String coatColor; //цвет шерсти
    private String dateOfBirth;


    public petAnimal(String name, String breed, String vaccination, String coatColor, String dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.dateOfBirth = dateOfBirth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {

    }

    public String print() {
        return String.format("name: %s, breed: %s, vaccination: %s, coat сolor: %s, date of birth: %s", name, breed, vaccination, coatColor, dateOfBirth);
    }
}