package OfflineLibrary;


import java.util.*;

public class GenericLibrary<T> {


    private List<T> libraryStorage;

    public GenericLibrary() {
        this.libraryStorage = new ArrayList<>();
    }

    void addAnItem(T element) {
        libraryStorage.add(element);
    }


    T removeAnItem(int index) {
        return libraryStorage.remove(index);
    }



    public void printAll() {

        for (Object element : this.libraryStorage) {
            System.out.println(element);
        }
    }
    public void printByField(T element) {

         {
            System.out.println(element);
        }
    }

    public String toString(T element) {
        return element + " " + element;
    }

    public static <T extends Comparable<T>> T seeMaximum(T x, T y, T z){
        T max= x;
        if(y.compareTo(max) > 0){
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}

