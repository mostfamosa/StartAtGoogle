package StartAtGoogle.Week3.BehavioralPatterns;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new Asset(123,"Mostafa",9.5));
        appliances.add(new Group(123321,30));
        appliances.add(new User(1111,"Mostafa","Mostafa219"));

        Utility utility = new Utility();
        for (Appliance appliance: appliances) {
            System.out.println(appliance.accept(utility));
        }

    }
}
