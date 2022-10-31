package StartAtGoogle.Week2.CommonMethods;

import java.util.Objects;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private String areaCode;
    private String number;

    public PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode='" + areaCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode.equals(that.areaCode) && number.equals(that.number);
    }

//////////////////////////////////////////////

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + this.areaCode.hashCode();
        result = 31 * result + this.number.hashCode();

        return result;
    }

    public static PhoneNumber copyOf(PhoneNumber phoneNumber) {
        return new PhoneNumber(phoneNumber.areaCode, phoneNumber.number);
    }


    @Override
    public int compareTo(PhoneNumber o) {
        int result = this.areaCode.compareTo(o.areaCode);
        if(result!=0){
            return result;
        }
        return this.number.compareTo(o.number);
    }
}
