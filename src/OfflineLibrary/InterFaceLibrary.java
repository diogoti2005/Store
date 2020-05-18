package OfflineLibrary;

import javax.xml.namespace.QName;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;


     /*   GenericLibrary firstLibrary = new GenericLibrary();

        // Add Admin
        List<String> admins = new ArrayList<String>(5);
        admins.addAdmin("r")
        admins.add("Geeks");
        l.add("for");
        AdminUser adminLibrary1 = new AdminUser();
        adminLibrary1.addAdmin()
        admin.add()
        }*/
public class InterFaceLibrary {


         public static void main(String[] args) {
             /*Generic Library usage*/
             //Create books object
             Book book1 = new Book("Ulysses", "Marcel Proust");
             Book book2 = new Book("Don Quixote", "Miguel de Cervantes");
             // Create video obj
             Video video1 = new Video("John Wick","Chad Stahelski");
             Video video2 = new Video("Tarzan","Chris Buck");
             //  Create books library list
             GenericLibrary<Book> libraryBooks = new GenericLibrary<>();
             libraryBooks.addAnItem(book1);
             libraryBooks.addAnItem(book2);
             String Green = "\u001B[32m";
             String Default = "\u001B[0m";
             System.out.println( Green + "List all Books available in library" + Default);
             libraryBooks.printAll();
             System.out.println( Green+"List all Videos available in library"+ Default);
             libraryBooks.removeAnItem(1); // remove a book from library video list.
             libraryBooks.printAll();
             //  Create video library list
             GenericLibrary<Video> libraryVideos = new GenericLibrary<>();
             libraryVideos.addAnItem(video1);
             libraryVideos.addAnItem(video2);
             System.out.println( Green+ "List all Videos available in library" +Default);
             libraryVideos.printAll();
             libraryVideos.removeAnItem(0); // remove a video from library video list.
             System.out.println( Green + "List all Videos available in library" + Default);
             libraryVideos.printAll();
             //  Create video library list
             Newspaper newspaper1 = new Newspaper("The time", "December 11 2010");
             Newspaper  newspaper2 = new Newspaper( "The Weekly Herald", "December 21 2019");
             GenericLibrary<Newspaper> libraryNewspapers = new GenericLibrary<>();
             libraryNewspapers.addAnItem(newspaper1);
             libraryNewspapers.addAnItem(newspaper2);


          /*   System.out.println(bookLibraryS.removeAnItem(0));
             bookLibraryS.removeAnItem(1);*/

             //bookLibrary.removeAnItem(0);

         }

    //Add User ( Name, Age, Registered)

    //Add items in books
    // Add in Total available

    // Book an book ( user dateOut date In )
    // remove from the total then item is booked

    // return Book ( user if DateIn equal to currentDate if no return message )



}
