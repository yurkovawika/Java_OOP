package Work_6.Figures;


import Work_6.Interface.Perimeter;

public class Rectangle extends Polygon implements Perimeter {

    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});
    }

    @Override
    public double getArea() {
        return this.sides[0] * this.sides[1];
    }


    @Override
    public String toString() {
        return String.format("Rectangle:  \nLength = %.2fm; Width = %.2fm;", this.sides[0], this.sides[1])+ super.toString();
    }
}
