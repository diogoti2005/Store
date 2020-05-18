package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static <E> void printist(E[] arayValues) {
        for (E elemnt : arayValues) {
            System.out.println(elemnt);
        }
    }

    public static <E extends Comparable<E>> E seeMaximum(E x, E y, E z){
        E max= x;
        if(y.compareTo(max) > 0){
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static <E extends GenericsActions> void getNewSize() {
        GenericsActions.getSize();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
        Character[] characterArray = {'I', 'R', 'T', 'Z'};
        List<Integer> listArray = new ArrayList<>();
        listArray.add(10);
        listArray.add(20);
        System.out.println("Array Integer displayed");
        printist(intArray);
        System.out.println("Double array displayed");
        printist(doubleArray);
        System.out.println("Character array displayed");
        printist(characterArray);
        getNewSize();
        System.out.println(seeMaximum(6,8,9));
        System.out.println(seeMaximum(6.6,8.8,9.2));
        System.out.println(seeMaximum("peer", "apple", "cherry"));
    }
}