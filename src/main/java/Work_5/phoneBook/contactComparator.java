package Work_5.phoneBook;
import java.util.Comparator;


public class contactComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        return (o1.compareTo(o2));
    }
}

