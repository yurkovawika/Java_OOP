package Work_6.Interface;

import Work_6.Figures.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static CollectionFigures figures = new CollectionFigures();

    public static void MenuFigure() throws IOException, InputMismatchException {
        Scanner scan = new Scanner(System.in);
        Print print = new Print(figures);
        while (true) {
            System.out.println();
            System.out.print("Menu:\n" +
                    "\t1. View information about all figures;\n" +
                    "\t2. View information about a specific figure;\n" +
                    "\t3. Add a new figure;\n" +
                    "\t4. Replace figure;\n" +
                    "\t5. Remove figure;\n" +
                    "\t6. Sorted\n" +
                    "\t0. Exit\n" +
                    "\n***Enter your choice ----->> ");

            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1://Посмотреть информацию о всех фигурах
                        print.PrintSize();
                        print.PrintInfoFigures();
                        break;
                    case 2://Просмотреть информацию о конкретной фигуре
                        print.PrintInfoFigure();
                        break;
                    case 3://Добавить новую фигуру
                        figures.addFigure(menuAddFigures());
                        System.out.println("Figure added.");
                        break;
                    case 4://Заменить фигуру в коллекции
                        if (figures.getSize() == 0) {
                            System.out.println("Operation failed. The list is empty.");
                        } else {
                            System.out.print("Enter number of the figure to replace -->> ");
                            int idx = scan.nextInt();
                            figures.getFigure(idx);
                            figures.setFigure(idx, menuAddFigures());
                            System.out.println("Figure replaced");
                        }
                        break;
                    case 5:
                        if (figures.getSize() == 0) {
                            System.out.println("Operation failed. The list is empty.");
                        } else {
                            System.out.print("Enter number of the figure to replace -->> ");
                            int idx = scan.nextInt();
                            figures.removeFigure(idx);
                            System.out.println("Figure removed");
                        }
                        break;
                    case 6: //сортировка по площади фигуры;
                        figures.sorted();
                        System.out.println("Sorting is complete");
                        break;
                    case 7:
                        scan.close();
                        return;
                    default:
                        System.out.println("The number is  uncorrected.Try again.");
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println("The number is  uncorrected.Try again.");
                MenuFigure();
            }
        }
    }

    private static Figure menuAddFigures() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the figure you want to add:\n" +
                "\t1. Circle;\n" +
                "\t2. Rectangle;\n" +
                "\t3. Square;\n" +
                "\t4. Triangle;\n" +
                "\n\t5. Exit to main menu;\n" +
                "\n***Enter your choice ----->> ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Enter  radius for new Circle:");
                return new Circle(sc.nextInt());
            case 2:
                System.out.println("Enter sides for new Rectangle:");
                System.out.println("Side 1:");
                int side_1 = sc.nextInt();
                System.out.println("Side_2:");
                int side_2 = sc.nextInt();
                return new Rectangle(side_1, side_2);
            case 3:
                System.out.println("Enter one side for new Square:");
                return new Square(sc.nextInt());

            case 4:
                try {
                    System.out.println("Enter  three side for new Triangle:");
                    System.out.print("Side 1:");
                    side_1 = sc.nextInt();
                    System.out.print("Side_2:");
                    side_2 = sc.nextInt();
                    System.out.print("Side_2:");
                    int side_3 = sc.nextInt();
                    return Triangle.checkTriangle(side_1, side_2, side_3);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    menuAddFigures();
                }
            case 5:
                MenuFigure();
            default:
                System.out.println("The number is  uncorrected.Try again:");
                return menuAddFigures();

        }
    }
}