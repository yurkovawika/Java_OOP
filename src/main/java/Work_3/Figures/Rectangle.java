package Work_3.Figures;

import Work_3.Interface.InfoFigure;
import Work_3.Interface.Perimeter;

public class Rectangle extends Polygon implements Perimeter, InfoFigure {

    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});
    }

    @Override
    public double getArea() {
        return this.sides[0] * this.sides[1];
    }

    public void getInfo() {
        System.out.printf("Rectangle:  \nLength = %.2fm; Width = %.2fm;", this.sides[0], this.sides[1]);
        super.getInfo();
    }

}
