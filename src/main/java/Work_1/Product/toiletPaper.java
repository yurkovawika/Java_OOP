package Work_1.Product;

public class toiletPaper extends hygieneStuff {
    public int countOfLayers;

    public toiletPaper(String name, float price, int count, String unit, int countInPack, int countOfLayers) {
        super(name, price, count, unit, countInPack);
        this.countOfLayers = countOfLayers;
    }

    public String toString() {
        return String.format("%s; countOfLayers: %d. ", super.toString(), this.countOfLayers);
    }
}
