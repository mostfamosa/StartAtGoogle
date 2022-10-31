package StartAtGoogle.Week2.Methods;

import java.util.Date;

public class Coupon {
    private int id;
    private Date expiryDate;
    private int value;

    public Coupon(int id, Date expiryDate, int value) {

        if(id<0||value<0)
            throw new IllegalArgumentException("id or value must be positive");
        this.id = id;
        this.expiryDate = expiryDate;
        this.value = value;
    }

    public int getId() {
        return id;
    }


    public Date getExpiryDate() {
        return new Date(expiryDate.getTime());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", expiryDate=" + expiryDate +
                ", value=" + value +
                '}'+'\n';
    }
}
