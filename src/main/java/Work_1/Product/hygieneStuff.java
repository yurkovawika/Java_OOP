package Work_1.Product;

public class hygieneStuff extends Product {

    public int countInPack;

    public hygieneStuff(String name, float price, int count, String unit, int countInPack) {
        super(name, price, count, unit);
        this.countInPack = countInPack;
    }

    public String toString() {
        return String.format("%s; countInPack: %d;", super.toString(), this.countInPack);
    }
}
