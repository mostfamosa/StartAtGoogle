package StartAtGoogle.Week2.Methods;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Store store =new Store();
        ArrayList<Coupon> myCoupons = new ArrayList<>();
        User user = new User("Mostafa",myCoupons);

        store.assignCouponToUser(user);
        store.assignCouponToUser(user);
        store.assignCouponToUser(user);
        store.assignCouponToUser(user);
        store.assignCouponToUser(user);
        store.assignCouponToUser(user);
        store.assignCouponToUser(user);

        System.out.println(user);

//        store.useCouponById(user,user.getUserCoupon().get(0).getId());
//        System.out.println(user);

//        store.useHeighestCoupon(user);
//        System.out.println(user);

//        store.useRandomCoupon(user);
//        System.out.println(user);

          store.useClosestCoupon(user);
          System.out.println(user);

    }
}
