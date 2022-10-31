package StartAtGoogle.Week3.CreationalPatterns;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(1,4,8,3);

        ArrayList<Vehicle> myVehicles = travelAgency.getMyVehicles();

        myVehicles.get(0).move();

    }
}
