package Work_1.Product;

public class Bread extends foodStuff {
    public String typeOfFlour;

    public Bread(String name, float price, int count, String unit, int expiryDate, String typeOfFlour) {
        super(name, price, count, unit, expiryDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return String.format("%s; typeOfFlour: %s.", super.toString(), this.typeOfFlour);
    }
}
