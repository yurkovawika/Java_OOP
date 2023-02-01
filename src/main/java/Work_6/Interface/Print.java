package Work_6.Interface;

import Work_6.Figures.CollectionFigures;
import Work_6.Figures.Figure;

import java.util.Scanner;

public class Print {
    CollectionFigures figures;
    Scanner scan = new Scanner(System.in);
    int count =0;

    public Print(CollectionFigures figures) {
        this.figures = figures;
    }

    void PrintInfoFigures() {
        StringBuffer sb = new StringBuffer();
        for (Figure figure : figures.getFigures()) {
            count++;
            sb.append(count).append(") ").append(figure.toString());
        }
        System.out.println(sb);
        count=0;
    }

    void PrintInfoFigure() throws IndexOutOfBoundsException {
        try {
            System.out.println("Enter index figure: ");
            System.out.println(figures.getFigure(scan.nextInt()).toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    void PrintSize() {
        System.out.printf("At the moment there are %d figures:\n", figures.getSize());
    }
}


