package StartAtGoogle.Week2.CommonMethods;

import StartAtGoogle.Week2.Generator;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;
    private String name;

    PhoneBook(){

    }
    public PhoneBook(ArrayList<Contact> contacts, String name) {
        this.contacts = contacts;
        this.name = name;
    }
    public Contact createNewContact(String fname, String lname, String areaNumber, String phone){

        Contact newContact = new Contact();
        Name newName =Name.addNewContactName(fname,lname);
        if(Generator.generateRandomGender().compareTo("Male")==0)
            newName.setPrefix(Name.Prefix.Mr);
        else
            newName.setPrefix(Name.Prefix.Ms);
        newContact.setName(newName);

        PhoneNumber newPhone = new PhoneNumber(areaNumber,phone);
        newContact.setPhoneNumber(newPhone);
        return newContact;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n\nPhoneBook{" +
                ", name='" + name + '\''+"\n"+
                "contacts=\n" + contacts +
                '}';
    }
}
