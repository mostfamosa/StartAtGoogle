package StartAtGoogle.Week2.CommonMethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();
        ArrayList<Contact> contacts = new ArrayList<>();

        Contact myNewContact;

        myNewContact = myPhoneBook.createNewContact("Shai", "levi", "04", "05221655");
        contacts.add(myNewContact);
        myNewContact = myPhoneBook.createNewContact("mostfa", "mosa", "05", "02321655");
        contacts.add(myNewContact);
        myNewContact = myPhoneBook.createNewContact("leon", "shapero", "02", "225535");
        contacts.add(myNewContact);
        myNewContact = myPhoneBook.createNewContact("gedon", "jaffe", "56", "2641565");
        contacts.add(myNewContact);


        myPhoneBook.setContacts(contacts);
        myPhoneBook.setName("Start@Google");

        System.out.println("\n\n***** Usage of equals() *****");
        //print contacts
        System.out.println(myPhoneBook);

        ////*Use Of "equals()"*////
        //example for the same contact using "equals"
        if (contacts.get(0).equals(contacts.get(0))) {
            System.out.println("{" + contacts.get(0).getName() + "} is EQUAL to {" + contacts.get(0).getName() + "}");
        } else
            System.out.println("{" + contacts.get(0).getName() + "} is NOT EQUAL to {" + contacts.get(0).getName() + "}");

        //example for different contacts using "equals"
        if (contacts.get(0).equals(contacts.get(1))) {
            System.out.println("{" + contacts.get(0).getName() + "} is EQUAL to {" + contacts.get(1).getName() + "}");
        } else
            System.out.println("{" + contacts.get(0).getName() + "} is NOT EQUAL to {" + contacts.get(1).getName() + "}");


        System.out.println("\n\n***** Usage of clone() *****");

        ////*Use Of "clone()"*////
        Contact contact = new Contact();
        myPhoneBook.getContacts().add(contact.copyOf(myPhoneBook.getContacts().get(0)));
        System.out.println(myPhoneBook);

        //check if the clone is equal
        if (contacts.get(0).equals(contacts.get(4))) {
            System.out.println("{" + contacts.get(0).getName() + "} is EQUAL to {" + contacts.get(4).getName() + "}");
        } else
            System.out.println("{" + contacts.get(0).getName() + "} is NOT EQUAL to {" + contacts.get(4).getName() + "}");

        //check if any change made in contacts.get(0)
        //will be reflected in contacts.get(4)
        myNewContact = myPhoneBook.createNewContact("Assaf", "Balzamovich", "04", "05221655");
        myPhoneBook.getContacts().get(0).setName(myNewContact.getName());

        System.out.println("\n\n***** Usage of compareTo() *****");
        System.out.println(myPhoneBook);

        ////*Use Of "compareTo()"*////
        System.out.println("contacts.get(0) compareTo contacts.get(1) = "+myPhoneBook.getContacts().get(0).compareTo(myPhoneBook.getContacts().get(1)));
        System.out.println("contacts.get(0) compareTo contacts.get(4) = "+myPhoneBook.getContacts().get(0).compareTo(myPhoneBook.getContacts().get(4)));






    }
}
