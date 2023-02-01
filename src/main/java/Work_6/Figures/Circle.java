package Work_6.Figures;

import Work_6.Interface.CircleLength;

public class Circle extends Figure implements CircleLength {
    private final double radius;

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
    public String toString() {
        return String.format("Circle:\nRadius = %.2fm; Area = %.2fm; Length  = %.2fm;\n", this.radius, getArea(), getCircleLength());
    }
}
