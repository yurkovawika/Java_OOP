package Work_3.Interface;

import Work_3.Figures.*;

public class Menu {

    public static void MenuFigure() {
        CollectionFigures figures = new CollectionFigures();
        ExeptionsMenu sc = new ExeptionsMenu();
        while (true) {
            System.out.println();
            System.out.print("Menu:\n" +
                    "\t1. View information about all figures;\n" +
                    "\t2. View information about a specific figure;\n" +
                    "\t3. Add a new figure;\n" +
                    "\t4. Replace figure;\n" +
                    "\t5. Remove figure;\n" +
                    "\t6. Sorted\n" +
                    "\t7. Exit\n" +
                    "\n***Enter your choice ----->> ");
            int BigChoice = sc.getInput();
            switch (BigChoice) {
                case 1://Посмотреть информацию о всех фигурах
                    System.out.printf("At the moment there are %d figures:\n", figures.getSize());
                    figures.getInfo();
                    break;
                case 2://Просмотреть информацию о конкретной фигуре
                    if (figures.getSize() <= 1) {
                        System.out.printf("At the moment there are %d figures:\n", figures.getSize());
                        figures.getInfo();
                        break;
                    } else {
                        System.out.printf("At the moment there are %d figures:\n", figures.getSize());
                        System.out.print("Enter the number figure for info -->> ");
                        figures.indexInfo(sc.getInput());
                        break;
                    }
                case 3://Добавить новую фигуру
                    figures.addFigure(addFigures(sc));
                    break;
                case 4://Заменить фигуру в коллекции
                    if (figures.getSize() == 0) {
                        System.out.println("Operation failed. The list is empty.");
                        break;
                    } else {
                        figures.getInfo();
                        System.out.print("Enter number of the figure to replace -->> ");
                        sc.getReplaceFigure(figures, sc);
                        break;
                    }
                case 5://Удалить фигуру
                    if (figures.getSize() == 0) {
                        System.out.println("Operation failed. The list is empty.");
                        break;
                    } else {
                        System.out.print("Enter the number of the figure to remove it -->> ");
                        sc.getRemoveFigure(figures, sc);
                    }
                    break;
                case 6: //сортировка по площади фигуры;
                    figures.sorted();
                    System.out.println("Сортировка завершена");
                    break;
            }
            if (BigChoice == 7) { //выход
                break;
            }
        }
    }

    public static BasicFigure addFigures(ExeptionsMenu sc) {

        System.out.print("Enter the number of the figure you want to add:\n" +
                "\t1. Circle;\n" +
                "\t2. Rectangle;\n" +
                "\t3. Square;\n" +
                "\t4. Triangle;\n" +
                "\n\t5. Exit to main menu;\n" +
                "\n***Enter your choice ----->> ");
        switch (sc.getInput()) {
            case 1:
                System.out.println("Enter  radius for new Circle:");
                return new Circle(sc.getInput());

            case 2:
                System.out.println("Enter two side for new Rectangle:");
                return new Rectangle(sc.getInput(), sc.getInput());

            case 3:
                System.out.println("Enter one side for new Square:");
                return new Square(sc.getInput());

            case 4:
                System.out.println("Enter  three side for new Triangle:");
                return Triangle.creatTriangle(sc.getInput(), sc.getInput(), sc.getInput(), sc);
            case 5:
                MenuFigure();

            default:
                System.out.println("The number is  uncorrected.Try again:");
                return addFigures(sc);
        }
    }
}