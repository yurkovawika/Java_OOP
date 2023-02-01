package Work_6.Figures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CollectionFigures {

    protected List<Figure> figures;


    public CollectionFigures() {
        figures = new ArrayList<>();
    }

    public void addFigure(Figure figure) {
        figures.add(figure);

    }

    public Figure getFigure(int idx) {
        return figures.get(idx - 1);

    }

    public List<Figure> getFigures() {
        return this.figures;
    }

    public int getSize() {
        return figures.size();
    }

    public void setFigure(int idx, Figure figure) {
        figures.set(idx - 1, figure);
    }

    public void removeFigure(int idx) {
        figures.remove(idx - 1);
    }

    public void sorted() {
        Comparator<Figure> maxArea = new MaxAreaComparator();
        figures.sort(maxArea);
    }

    @Override
    public String toString() {
        return figures.toString();
    }
}
