package Work_3.Figures;

import java.util.Comparator;

public class MaxAreaComporator implements Comparator<BasicFigure> {

    @Override
    public int compare(BasicFigure o1, BasicFigure o2) {
//        return Integer.compare(o1.getArea(),o2.getArea());
        return (int) (o1.getArea() - o2.getArea());
    }
}
