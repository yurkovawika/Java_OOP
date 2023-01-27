package Work_4;

public class Program {
    public static void main(String[] args) {

        Integer [] i = {1,23,10,456,-8,2};
        String [] s = {"Zero","Alfa","Man","Olga","Cats"};
        DataArray <Integer> ints = new DataArray<>(i);
        DataArray <String> strs = new DataArray<>(s);


        System.out.println("массивы :");
        ints.print();
        strs.print();
    }
}
