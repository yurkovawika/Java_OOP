package Work_1.Product;

public class drinkStuff extends Product {

    public int volume;

    public drinkStuff(String name, float price, int count, String unit, int volume) {
        super(name, price, count, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s;  volume: %d", super.toString(), this.volume);
    }
}