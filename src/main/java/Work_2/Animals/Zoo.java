package Work_2.Animals;


import java.util.ArrayList;
import java.util.List;

public class Zoo {

protected List<Animals> zoo;



    public Zoo() {
        List<Animals> zoo = new ArrayList<Animals>();
        this.zoo = zoo;
    }

    public void addAnimal(Animals animal){
        zoo.add(animal);
    }
    public void delAnimal(int i){
        System.out.printf("Remove the animal under the number %d\n", i);

        zoo.remove(i-1);
        System.out.println("The animal has been removed");

    }

    public void printZoo(){
        System.out.printf("At the moment there are %d animals in the zoo:\n", zoo.size());
        for(int i = 1; i <= zoo.size();i++){
            System.out.printf("%d)",i);
            printInfoAnimal(i);
            System.out.println("-------------------");
        }

    }
    public void printInfoAnimal(int i){
        System.out.println(zoo.get(i-1));
    }
    public void makeSoundAnimal(int i){

        zoo.get(i).makeSound();
    }
    public void makeSoundAll(){
        for (Animals a: zoo) {
            a.makeSound();
        }
    }
    public int getIndexAnimal(Animals animal){
        return zoo.indexOf(animal);
    }


    public int size() {
        return zoo.size();
    }



}
