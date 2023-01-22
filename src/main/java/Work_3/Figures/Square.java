package Work_3.Figures;

public class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getArea() {
        return this.sides[0] * this.sides[1];
    }

    public void getInfo() {
        System.out.printf("Square:\nLength = %.2fm; Area = %.2fm; Perimeter = %.2fm;\n",
                this.sides[0], getArea(), super.getPerimeter());
    }

}
