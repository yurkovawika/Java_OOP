package Work_1.Product;

public class Lemonade extends drinkStuff {
    public Lemonade(String name, float price, int count, String unit, int volume) {
        super(name, price, count, unit, volume);
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
