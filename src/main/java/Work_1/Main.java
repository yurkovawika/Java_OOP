package Work_1;

import Work_1.Product.*;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk("'MilkSunny'", 1.5f, 1, "ml", 950, 2.5f, 7);
        Lemonade lemonade = new Lemonade("'Lemon'", 0.99f, 1, "ml", 500);
        Bread bread = new Bread("'BreadAllHead'", 0.5f, 1, "pieces", 5, "millet,1 grade");
        Egg egg = new Egg("'SuperEgg'", 1.99f, 1, "pieces", 30, 15);
        Mask mask = new Mask("'VirusMask'", 0.5f, 1, "pieces", 5);
        toiletPaper paper = new toiletPaper("'MrsPapers'", 0.35f, 1, "pieces", 4, 2);
        Diaper diaper = new Diaper("'DiaperForBaby'", 5.99f, 1, "pieces", 1, "yes", 1, 2500, 6500, "1-3");
        Pacifier pacifier = new Pacifier("'NyamNyam'", 1f, 10, "pieces", 1, "yes");

//        Product[] products = new Product[]{milk, lemonade, bread, egg, mask, paper, diaper, pacifier};
//        for (Product product : products)
//            System.out.println(Program.printInfo(product));

        System.out.println(Program.printInfo(milk));

    }
}
