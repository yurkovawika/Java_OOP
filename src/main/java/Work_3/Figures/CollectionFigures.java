package Work_3.Figures;

import Work_3.Interface.InfoFigure;

import java.util.*;


public class CollectionFigures implements InfoFigure {

    protected List<BasicFigure> figures;


    public CollectionFigures() {
        List<BasicFigure> figures = new ArrayList<>();
        this.figures = figures;
    }

    public void addFigure(BasicFigure figure) {
        figures.add(figure);
        System.out.printf("%s adding.\n", figure.getClass().getSimpleName());
    }

    public int getSize() {
        return figures.size();
    }

    public void setFigure(int i, BasicFigure figure) {
        figures.set(i, figure);
    }

    public void removeFigure(int i) {
        figures.remove(i - 1);
    }

    public void indexInfo(int i) {
        System.out.printf("%d)", figures.indexOf(figures.get(i - 1)) + 1);
        figures.get(i - 1).getInfo();
    }

    @Override
    public void getInfo() {
        for (BasicFigure figure : figures) {
            System.out.printf("%d)", figures.indexOf(figure) + 1);
            figure.getInfo();
        }
    }

    public void sorted() {
        Comparator maxArea = new MaxAreaComporator();
        Collections.sort(figures, maxArea);
    }

}
