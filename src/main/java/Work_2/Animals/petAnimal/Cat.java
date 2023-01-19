package Work_2.Animals.petAnimal;


public class Cat extends petAnimal {

    private String presenceOfWool; //наличие шерсти

    public Cat(String name, String breed, String vaccination, String coatColor, String dateOfBirth, String presenceOfWool) {
        super(name, breed, vaccination, coatColor, dateOfBirth);
        this.presenceOfWool = presenceOfWool;
    }


    @Override
    public void makeSound() {
        System.out.printf("%s say 'meow'.\n", getName());

    }

    public String getPresenceOfWool() {
        return presenceOfWool;
    }

    @Override
    public String print() {
        return String.format("\nInfo about cat:\n%s, presence of wool:%s.", super.print(), this.presenceOfWool);
    }


    public String toString() {
        return String.format("Info about cat:\n%s, presence of wool:%s", super.print(), this.presenceOfWool);
    }



}
