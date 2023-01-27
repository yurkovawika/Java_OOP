package Work_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа).
public class DataArray<E extends Comparable<E> > {
    private List<E> array;



    public DataArray() {
        array = new ArrayList<>();
    }

    public DataArray(E[] value) {
        array = new ArrayList<>(Arrays.asList(value));

    }

    public void add(E value) {
        array.add(value);
    }

    //
    public E max() {
        E res = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (res.compareTo(array.get(i)) < 0) {
                res = array.get(i);
            }
        }
        return res;
    }

    public E min() {
        E res = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (res.compareTo(array.get(i)) > 0) {
                res = array.get(i);
            }
        }
        return res;
    }

    public <E extends Number> Object sum() {
        if (array.get(0) instanceof Number) {
            double res = ((E) array.get(0)).doubleValue();
            for (int i = 1; i < array.size(); i++) {
                res = res + ((E) array.get(i)).doubleValue();
            }
            return res;
        }
        if (array.get(0) instanceof String) {
           String res = (String) array.get(0);
            for (int i = 1; i < array.size(); i++) {
                res = res + " " + array.get(i);
            }
            return res;
        }
        return null;
    }

    public <E extends Number> double multy(){
        try {
            double res = ((E) array.get(0)).doubleValue() ;
            if (array.get(0) instanceof Number) {
                for (int i = 1; i < array.size(); i++) {
                    res = res * ((E) array.get(i)).doubleValue() ;

                }
            }
            return res;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return 0;
        }
        catch (Exception e) {
            System.out.println("Невозможно произвести данную операцию над строками");
        }
        return 0;
    }

    public int search (Object obj){
        return array.indexOf(obj);
    }

    public boolean equals(Object obj){
        for(E element : array){
            if(element.equals(obj)) return true;
        }
        return false;
    }
    private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        E dummy = array.get(first);
        array.set(first, array.get(second));
        array.set(second,dummy);
    }

    public void sortBubble(){     ////    10. Пузырьковая сортировка
        for (int out = array.size() - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(array.get(in).compareTo( array.get(in +1))>0)
                    toSwap(in, in + 1);
            }
        }
    }
    public void sortInsertion() {//11. Сортировка простыми вставками
        for (int i = 1; i < array.size(); i++) {
            E key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j).compareTo(key)>0) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, key);
        }
    }
    public void sortChoice() {//12. Сортировка простым выбором
        for (int i = 0; i < array.size(); i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(minElementIndex).compareTo(array.get(j))>0) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                E temp = array.get(i);
               array.set(i, array.get(minElementIndex));
               array.set(minElementIndex,temp);
            }
        }
    }
    public E get(int i){//13. Получение элемента массива по индексу
        return array.get(i);
    }

    public void set(int i,E obj){//14. Задание значения элементу массива с заданным индексом
        array.set(i,obj);
    }
    public void print(){//15. Печать массива на экран
       for (E element: array){
           System.out.printf("%s; ",element);
       }
        System.out.println();
    }
    public int getSize(){//16. Длинна массива
        return array.size();
    }
    @Override
    public String toString() {
        return "" + array;
    }
}

