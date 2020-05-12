package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainRetailor {
    public static void main(String[] args) {
        //Start
        System.out.println("Hello to  create new oder: 1) enter user name 2) indecat type 3) enter item name" );
        // New user registration
        User user1 = new User();
        Scanner myNewUserObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello please create new User");
        String user = myNewUserObj.nextLine(); // Enter username and press Enter     /* create dynamic var
        System.out.println("Username is: " + user);

        // Create Adress
        Scanner enterFullAddress1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Country, City and street:");
        String newAddressCountry1 = enterFullAddress1.nextLine();
        String newAddressCity1 = enterFullAddress1.nextLine();
        String newAddressStreet1 = enterFullAddress1.nextLine();// Enter username and press Enter     /* create dynamic var
        //System.out.println("Username is: " + user);
        //getFullAddress method for Address class
        Address address1 = new Address(newAddressCountry1, newAddressCity1, newAddressStreet1);
        String fullAddress = Address.getFullAddress();
        System.out.println(fullAddress);
      //  String newAddressCountry1 = "Moldova";
      //  String newAddressCity1 = "Chishinau";
       // String newAddressStreet1 = "Negruta 19";

        String newAddressCountry2 = "Moldova";
        String newAddressCity2 = "Chishinau";
        String newAddressStreet2 = "Nunta 19";
        Address address2 = new Address(newAddressCountry2, newAddressCity2, newAddressStreet2);
        String newAddressCountry3 = "Moldova";
        String newAddressCity3 = "Orhey";
        String newAddressStreet3 = "Doga 19";
        Address address3 = new Address(newAddressCountry3, newAddressCity3, newAddressStreet3);

        Map<String, Address> addresses = new HashMap<String, Address>();
        //Adding elements to map
        addresses.put("Home", address1);
        addresses.put("Work", address2);
        addresses.put("Home", address3);
        for (Map.Entry m : addresses.entrySet()) {
          //  System.out.println(m.getKey() + " " + m.getValue());
        }




        Order order1 = new Order();

        order1.registrationUser(user1);
        Item mytoy = new Item(1, "lego", Type.TOY);
        Item mytoy2 = new Item(2, "legoGo", Type.TOY);
        Item mytoy3 = new Item(3, "legoUP", Type.TOY);
        order1.addItem(mytoy);
        order1.addItem(mytoy2);
        order1.addItem(mytoy3);
        // order1.addItem(mytoy2);
        /// List<Item> clothes = order1.getitemBytype(Type.TOY)
        //Order newOrder = new Order("date");
        System.out.println(order1.id);
        System.out.println(order1.date);
        System.out.println(order1.user + " " + order1);

    }
}
