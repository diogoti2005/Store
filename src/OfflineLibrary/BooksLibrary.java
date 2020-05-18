package OfflineLibrary;

import java.util.ArrayList;
import java.util.List;

public class BooksLibrary {
    private List<Book> booksLibrary;
    private String name;
    public BooksLibrary () {
        this.booksLibrary = new ArrayList<>();
    }



//    public BooksLibrary()

 public void addAnItem (Book b) {
    booksLibrary.add(b);
    System.out.println(b + " was successfully added to the storage " + b.name);
}



     public Object removeAnItem(int index) {
        return  booksLibrary.remove(index);
    }

    void addAnItem(List element) {

    }


    void returnAnItem(Object o) {

    }


}
