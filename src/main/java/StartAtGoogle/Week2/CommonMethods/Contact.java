package StartAtGoogle.Week2.CommonMethods;


import java.util.Objects;

public class Contact implements Comparable<Contact>{

    private Name name;
    private PhoneNumber phoneNumber;

    Contact(){

    }
    public Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {

        int result = 1;

        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.phoneNumber.hashCode();

        return result;
    }

    public Contact copyOf(Contact contact) {
        return new Contact(contact.name,contact.phoneNumber);
    }


    @Override
    public int compareTo(Contact o) {

            int result = this.name.compareTo(o.name);
            if(result!=0){
                return result;
            }
           return this.phoneNumber.compareTo(o.phoneNumber);

    }
}
