package Work_3.Interface;

import Work_3.Figures.CollectionFigures;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Work_3.Interface.Menu.*;

public class ExeptionsMenu {

    public ExeptionsMenu() {
    }

    public int getInput() {
        Scanner in = new Scanner(System.in);
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter a number. Try again:");
            return getInput();
        }

    }

    public void getRemoveFigure(CollectionFigures Figures, ExeptionsMenu sc) {
        int choice = sc.getInput();
        try {
            Figures.removeFigure(choice);
            System.out.println("Figure removed");
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Operation failed. Enter number from 1 to %d:\n", Figures.getSize());
            getRemoveFigure(Figures, sc);

        }
    }

    public void getReplaceFigure(CollectionFigures Figures, ExeptionsMenu sc) {
        int choice = sc.getInput();
        try {
            if (choice <= Figures.getSize()) {
                Figures.setFigure(choice - 1, addFigures(sc));
                System.out.println("Figure replaced");
            } else if (choice > Figures.getSize() - 1) {
                System.out.println("The number is  uncorrected.Try again:");
                getReplaceFigure(Figures, sc);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Operation failed. Enter number from 1 to %d:\n", Figures.getSize());
            getReplaceFigure(Figures, sc);
        }
    }
}
