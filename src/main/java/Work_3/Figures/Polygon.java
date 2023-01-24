package Work_3.Figures;

import Work_3.Interface.Perimeter;

public abstract class Polygon extends BasicFigure implements Perimeter {
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

    public void getInfo() {
        System.out.printf("Area = %.2fm; Perimeter = %.2fm\n", getArea(), getPerimeter());
    }

}
