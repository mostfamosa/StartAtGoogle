package StartAtGoogle.Week2.CommonMethods;

import java.util.Objects;

public class Name implements Comparable<Name>{


    enum Prefix {
        Mr,
        Ms,
    }
    private String firstName;
    private String lastName;
    private Prefix prefix;

    public Name(String firstName, String lastName, Prefix prefix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prefix = prefix;
    }
    private  Name(){

    }
    public static Name addNewContactName(String firstName, String lastName){
        Name myName = new Name();
        myName.setFirstName(firstName);
        myName.setLastName(lastName);
        return myName;
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", prefix=" + prefix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return firstName.equals(name.firstName) && lastName.equals(name.lastName) && prefix == name.prefix;
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + this.firstName.hashCode();
        result = 31 * result + this.lastName.hashCode();
        result = 31 * result + this.prefix.hashCode();

        return result;
    }

    public static Name copyOf(Name name) {
        return new Name(name.firstName, name.lastName, name.prefix);
    }
    
    @Override
    public int compareTo(Name name) {
        int result = this.firstName.compareTo(name.firstName);
        if(result!=0){
            return result;
        }
        result = this.lastName.compareTo(name.lastName);
        if(result!=0){
            return result;
        }
        result = this.prefix.compareTo(name.prefix);
        if(result!=0){
            return result;
        }
        return result;
    }

}
