package GenericsTask;

import java.util.ArrayList;
import java.util.List;

public class MainGeneric {

    public static <E> void printArray(E[] arrValue) {
        for (E element : arrValue) System.out.println(arrValue);
    }

    public static <E> void printist(E[] arayValues) {
        for (E elemnt : arayValues) {
            System.out.println(elemnt);
        }
    }

    public static <E, T extends Iterable<E>> void print(T list){
        for (Object element : list){
            System.out.println(element);
        }
    }
    public static void printL(Iterable<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static <T> void printLi(Iterable<?> list){
        for (Object element : list){
            System.out.println(element);
        }
    }


    public static <T> int countAnyList(T[] list, T itemToCount) {
        int count = 0;
        for (T listItem : list)
            if (itemToCount.equals(listItem))
                count++;
        return count;

    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        List<Integer> listArray = new ArrayList<>();
        listArray.add(10);
        listArray.add(20);
        Integer[] intArray = {5, 6, 7, 8};
        String[] strArray = {"men", "peopel", "weamen"};
        print(listArray);
        printist(intArray);
        printArray(strArray);
        countAnyList(intArray,2);
        countAnyList(strArray,2);
        printLi(listArray);
        printL(stringList);
        //printist(stringList);
        printLi(stringList);

        Zoo <Integer> antilope = new Zoo<>(27,12,14);
        Zoo <String> antilopeName = new Zoo<>("2","Antilop","14.45");
        antilope.getAge(10);
        antilopeName.getAnimalClass();
        antilope.setAge(10);
        antilopeName.setMassa("my");

    }
}
