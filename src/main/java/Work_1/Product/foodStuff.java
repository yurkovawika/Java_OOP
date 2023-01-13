package Work_1.Product;

public class foodStuff extends Product {

    public int expiryDate;

    public foodStuff(String name, float price, int count, String unit, int expiryDate) {
        super(name, price, count, unit);
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return String.format("%s;  expiryDate: %d", super.toString(), this.expiryDate);
    }
}
