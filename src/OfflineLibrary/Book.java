package OfflineLibrary;

public class Book {
    public String name;
    public String writer;
    public Book(String name,String writer)  {
        this.name = name;
        this.writer = writer;
    }

    @Override
    public String toString() { return "Book name: " + name +"is writen by " + writer; }
}
