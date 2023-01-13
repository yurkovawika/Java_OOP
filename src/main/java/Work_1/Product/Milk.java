package Work_1.Product;

//import Work_1.Product.drinkStuff;

public class Milk extends drinkStuff {

    public float percentFat;
    public int expiryDate;

    public Milk(String name, float price, int count, String unit, int volume, float percentFat, int expiryDate) {
        super(name, price, count, unit, volume);
        this.percentFat = percentFat;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return String.format("%s; percentFat: %.2f; expiryDate: %d.", super.toString(), this.percentFat, this.expiryDate);
    }
}
