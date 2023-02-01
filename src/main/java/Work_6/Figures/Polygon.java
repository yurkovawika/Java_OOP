package Work_6.Figures;

import Work_6.Interface.Perimeter;

public abstract class Polygon extends Figure implements Perimeter {
    protected double[] sides;

    protected Polygon(double[] sides) {
        this.sides = sides;
    }


    public double getPerimeter() {
        double perimeter = 0;
        for (double side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Area = %.2fm; Perimeter = %.2fm\n", getArea(), getPerimeter());
    }
}
