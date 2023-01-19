package Work_2.Animals.petAnimal;
import Work_2.Animals.Animals;

public class Dog extends petAnimal  {

    private  String trained ;

    public Dog(String name,String breed, String vaccination, String coatColor, String dateOfBirth, String trained) {
        super(name, breed, vaccination, coatColor, dateOfBirth);
        this.trained = trained;

    }

    @Override
    public void makeSound() {
        System.out.printf("%s say 'gaf'.\n", getName());

    }
    public String getTrained (){
        return trained;
    }

    public void trained(){
        System.out.printf("Train a dog named %s.", getName());

    }

    @Override
    public String print() {
        return String.format("\nInfo about dog:\n%s." , super.print());
    }



    public String toString() {
        return String.format("Info about dog:\n%s" , super.print());
    }



}