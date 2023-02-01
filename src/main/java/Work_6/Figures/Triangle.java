package Work_6.Figures;


import Work_6.Interface.ExceptionsFigures;

public class Triangle extends Polygon {


    private Triangle(double side_one, double side_two, double side_three) {
        super(new double[]{side_one, side_two, side_three});
    }

    public static Triangle checkTriangle(double side_one, double side_two, double side_three) throws ExceptionsFigures {
        if (side_one == 0 || side_two == 0 || side_three == 0) {
            throw new ExceptionsFigures("Sides not may be null.");
        }
        if (((side_one + side_two) > side_three) && ((side_one + side_three) > side_two) && ((side_three + side_two) > side_one)) {
            return new Triangle(side_one, side_two, side_three);
        }
        throw new ExceptionsFigures("Incorrect triangle sides.");
    }


    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.sides[0]) * (p - this.sides[1]) * (p - this.sides[2]));
    }


    @Override
    public String toString() {
        return String.format("Triangle:\nSide one = %.2fm; Side two = %.2fm; Side three = %.2fm;",
                this.sides[0], this.sides[1], this.sides[2]) +
                super.toString();
    }

}
