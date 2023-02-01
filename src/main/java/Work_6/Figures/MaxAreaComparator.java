package Work_6.Figures;

import java.util.Comparator;

public class MaxAreaComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure o1, Figure o2) {
        return (int) (o1.getArea() - o2.getArea());
    }
}
