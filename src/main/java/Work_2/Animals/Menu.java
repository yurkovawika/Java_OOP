package Work_2.Animals;


import Work_2.Animals.petAnimal.*;
import Work_2.Animals.wildAnimal.Stork;
import Work_2.Animals.wildAnimal.Tiger;
import Work_2.Animals.wildAnimal.Wolf;

import java.util.Scanner;

public class Menu  {

    public static void main(String[] args) {
    }
    public static void MenuZoo(Zoo zoo){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Menu:\n"+
                    "\t1. View information about all animals;\n" +
                    "\t2. View information about a specific animal;\n" +
                    "\t3. Add a new animal;\n" +
                    "\t4. Make a specific animal make a sound;\n" +
                    "\t5. Make all animals make a sound;\n" +
                    "\t6. Remove the animal;\n" +
                    "\t7. Exit\n" +
                    "\n***Enter your choice ----->> ");

            int choice = in.nextInt();
            switch (choice) {
                case 1://Посмотреть информацию о всех животных зоопарка
                    zoo.printZoo();
                    break;
                case 2://Просмотреть информацию о конкретном животном
                    if(zoo.size() == 0){
                        System.out.printf("At the moment there are %d animals in the zoo:\n", zoo.size());
                        break;
                    }
                    else  if (zoo.size() == 1){
                        zoo.printZoo();
                        break;
                    }
                    else {
                        System.out.printf("At the moment there are %d animals in the zoo:\n", zoo.size());
                        System.out.print("Enter the animal number for info -->> ");
                        zoo.printInfoAnimal(in.nextInt());
                        break;
                    }

                case 3://Добавить новое животное
                    System.out.print("Enter the number of the animal you want to add:\n"+
                            "\t1. Cat;\n" +
                            "\t2. Dog;\n" +
                            "\t3. Tiger;\n" +
                            "\t4. Wolf;\n" +
                            "\t5. Chicken;\n" +
                            "\t6. Stork\n" +
                            "\t7. Exit\n" +
                            "\n***Enter your choice ----->> ");
                    addNewAnimal(zoo,in.nextInt());
                    break;

                case 4://Заставить конкретное животное издать звук
                    if(zoo.size()==0){
                        System.out.println("Silence...\n" +
                                "there are no animals in the zoo");
                        break;
                    }
                    else {
                        System.out.print("Enter the animal number to make a sound -->> ");
                        zoo.makeSoundAnimal(in.nextInt()-1);
                    }

                    break;
                case 5: //Заставить всех животных издать звук
                    zoo.makeSoundAll();
                    break;
                case 6://Убрать животное из зоопарка
                    zoo.printZoo();
                    System.out.print("Enter the animal number to remove it -->> ");
                    zoo.delAnimal(in.nextInt());
                    break;

            }
            if (choice == 7) { //выход
                break;
            }

        }
    }
    public static void addNewAnimal(Zoo zoo, int i) {
        Scanner in = new Scanner(System.in);

        switch (i) {
            case 1://Cat
                System.out.println("Enter for new cat (separated by 'enter'):\n" +
                        "name, breed,vaccination, coat color, date of birth, presence of wool");
                zoo.addAnimal(new Cat(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
                break;
            case 2://Dog
                System.out.println("Enter for new dog(separated by 'enter'):\n" +
                        "name,breed,vaccination,coat color,date of birth, trained");
                zoo.addAnimal(new Dog(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
                break;
            case 3://tiger
                System.out.println("Enter for new tiger habitat and the date of discovery(separated by 'enter'):");
                zoo.addAnimal(new Tiger(in.nextLine(),in.nextLine()));
                break;
            case 4://Wolf
                System.out.println("Enter for new wolf habitat, date of discovery anf pack leader(separated by 'enter'):");
                zoo.addAnimal(new Wolf(in.nextLine(),in.nextLine(),in.nextLine()));
                break;
            case 5://Chicken
                System.out.println("Enter for new chicken name:");
                zoo.addAnimal(new Chicken(in.nextLine()));
                break;
            case 6://Stork
                System.out.println("Enter for new stork name and flight altitude(separated by 'enter'):");
                zoo.addAnimal(new Stork(in.nextLine(),in.nextInt()));
                break;
            case 7:break;
        }

    }



}

