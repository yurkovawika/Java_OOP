package Work_3.Figures;

import Work_3.Interface.ExceptionsMenu;


public class Triangle extends Polygon {
    protected Triangle(double side_one, double side_two, double side_three) {

        super(new double[]{side_one, side_two, side_three});
    }

    public static Triangle creatTriangle(double side_one, double side_two, double side_three, ExceptionsMenu sc)  {
        if (((side_one + side_two) > side_three) && ((side_one + side_three) > side_two) && ((side_three + side_two) > side_one)) {
            System.out.println("Triangle created");
            return new Triangle(side_one, side_two, side_three);
        } else
            System.out.println("The triangle does not exist. Enter three side again: ");
        return creatTriangle(sc.getInput(), sc.getInput(), sc.getInput(), sc);
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.sides[0]) * (p - this.sides[1]) * (p - this.sides[2]));
    }

    public void getInfo() {
        System.out.printf("Triangle:\nSide one = %.2fm; Side two = %.2fm; Side three = %.2fm;",
                this.sides[0], this.sides[1], this.sides[2]);
        super.getInfo();
    }

}
