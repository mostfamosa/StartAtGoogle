package StartAtGoogle.Week2.Methods;

import StartAtGoogle.Week2.Generator;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Store {

    public void assignCouponToUser(User user){

        Coupon newCoupon = new Coupon(Generator.generateRandomUniqueNumber(),Generator.generateRandomDate(),Generator.generateRandomGrade());
        user.getUserCoupon().add(newCoupon);
    }

    public void useCouponById(User user,int id){
        if (user.getUserCoupon().isEmpty())
            throw new NullPointerException("User has no Coupons!");
        Coupon c;
        for (Coupon coupon: user.getUserCoupon()) {
            if(coupon.getId()==id){
                if(isValid(coupon))
                {
                    System.out.println("Coupon is valid with a value of ="+coupon.getValue());
                    user.getUserCoupon().remove(coupon);
                    System.out.println("Coupon "+coupon.getId()+" is used!");
                    return;
                }
                else
                    throw new RuntimeException("Coupon with id = "+coupon.getId()+ " is expired!");
            }
        }
        System.out.println("Coupon is not found!");
    }

    public void useHeighestCoupon(User user){
        if (user.getUserCoupon().isEmpty())
            throw new NullPointerException("User has no Coupons!");
        Coupon c=user.getUserCoupon().get(0);
        int max=c.getValue();

        for (Coupon coupon: user.getUserCoupon()) {
            if(coupon.getValue()>max){
                c=coupon;
                max=coupon.getValue();
            }
        }

        if(isValid(c))
        {
            System.out.println("The Highest Coupon is valid with a value of ="+c.getValue());
            user.getUserCoupon().remove(c);
            System.out.println("Coupon "+c.getId()+" is used!");
            return;
        }
        else
            throw new RuntimeException("The Highest Coupon with id = "+c.getId()+ " is expired!");
    }

    public void useRandomCoupon(User user){
        if (user.getUserCoupon().isEmpty())
            throw new NullPointerException("User has no Coupons!");
        int limit = user.getUserCoupon().size();
        int randomIndex = Generator.generateRandomUniqueNumber(limit);
        Coupon c=user.getUserCoupon().get(randomIndex);

        if(isValid(c))
        {
            System.out.println("The Random Coupon is valid with a value of ="+c.getValue());
            user.getUserCoupon().remove(c);
            System.out.println("Coupon "+c.getId()+" is used!");
            return;
        }
        else
            throw new RuntimeException("The Random Coupon with id = "+c.getId()+ " is expired!");
    }

    public void useClosestCoupon(User user){
        if (user.getUserCoupon().isEmpty())
            throw new NullPointerException("User has no Coupons!");

        Date todaysDate = new Date(new Date().getTime());
        long findMin=todaysDate.getTime();
        Coupon c=user.getUserCoupon().get(0);
        for (Coupon coupon: user.getUserCoupon()) {
            if(coupon.getExpiryDate().getTime()-todaysDate.getTime()<findMin) {
                findMin = coupon.getExpiryDate().getTime()-todaysDate.getTime();
                c=coupon;
            }
        }
        if(isValid(c))
        {
            System.out.println("The Closest Coupon is valid with a value of ="+c.getValue());
            user.getUserCoupon().remove(c);
            System.out.println("Coupon "+c.getId()+" is used!");
            return;
        }
        else
            throw new IllegalArgumentException("The Closest Coupon with id = "+c.getId()+ " is expired!");
    }

    public Boolean isValid(Coupon coupon){
        long aDay = TimeUnit.DAYS.toMillis(1);
        long now = new Date().getTime();
        Date todaysDate = new Date(now);

        if(coupon.getExpiryDate().before(todaysDate))
            return false;
        return true;
    }
}
