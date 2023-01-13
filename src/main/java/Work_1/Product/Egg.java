package Work_1.Product;

public class Egg extends foodStuff {
    public int countInPack;

    public Egg(String name, float price, int count, String unit, int expiryDate, int countInPack) {
        super(name, price, count, unit, expiryDate);
        this.countInPack = countInPack;
    }

    @Override
    public String toString() {
        return String.format("%s; countInPack: %d.", super.toString(), this.countInPack);
    }
}
