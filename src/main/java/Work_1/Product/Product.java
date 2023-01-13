package Work_1.Product;

public class Product {
    protected String name;
    protected float price;
    protected int count;
    protected String unit;

    protected Product(String name, float price, int count, String unit) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; price: %.2f; count: %d; unit: %s", name, price, count, unit);
    }
}
