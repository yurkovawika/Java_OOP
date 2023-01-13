package Work_1.Product;

public class Diaper extends childrenStuff {
    public int diaperSize;
    public int minWeight;
    public int maxWeight;
    public String age;

    public Diaper(String name, float price, int count, String unit, int minAge, String hypoAllergy, int diaperSize,
                  int minWeight, int maxWeight, String age) {
        super(name, price, count, unit, minAge, hypoAllergy);
        this.diaperSize = diaperSize;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.age = age;

    }

    @Override
    public String toString() {
        return String.format("%s; diaperSize: %d; minWeight: %d; maxWeight: %d; age: %s. ", super.toString(), this.diaperSize, this.minWeight, this.maxWeight, this.age);
    }
}
