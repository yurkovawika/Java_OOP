package Work_3.Figures;

import Work_3.Interface.CircleLength;

public class Circle extends BasicFigure implements CircleLength {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircleLength() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void getInfo() {
        System.out.printf("Circle:\nRadius = %.2fm; Area = %.2fm; Length  = %.2fm;\n", this.radius, getArea(), getCircleLength());
    }

}
