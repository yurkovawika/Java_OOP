package Work_1.Product;

public class childrenStuff extends Product {

    public int minAge;
    public String hypoAllergy;

    public childrenStuff(String name, float price, int count, String unit, int minAge, String hypoAllergy) {
        super(name, price, count, unit);
        this.minAge = minAge;
        this.hypoAllergy = hypoAllergy;
    }

    @Override
    public String toString() {
        return String.format("%s; minAge: %d; hypoAllergy: %s", super.toString(), this.minAge, this.hypoAllergy);
    }
}
