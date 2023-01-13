package Work_1.Product;

public class Mask extends hygieneStuff {
    public Mask(String name, float price, int count, String unit, int countInPack) {
        super(name, price, count, unit, countInPack);
    }

    public String toString() {
        return String.format("%s", super.toString());
    }
}
