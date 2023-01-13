package Work_1.Product;

public class Pacifier extends childrenStuff {
    public Pacifier(String name, float price, int count, String unit, int minAge, String hypoAllergy) {
        super(name, price, count, unit, minAge, hypoAllergy);
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
