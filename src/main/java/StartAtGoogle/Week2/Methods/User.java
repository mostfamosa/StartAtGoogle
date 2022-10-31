package StartAtGoogle.Week2.Methods;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Coupon> userCoupon;

    public User(String name, ArrayList<Coupon> userCoupon) {
        this.name = name;
        this.userCoupon = userCoupon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Coupon> getUserCoupon() {
        return userCoupon;
    }

    public void setUserCoupon(ArrayList<Coupon> userCoupon) {
        this.userCoupon = userCoupon;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userCoupon=\n" + userCoupon +
                '}';
    }
}
