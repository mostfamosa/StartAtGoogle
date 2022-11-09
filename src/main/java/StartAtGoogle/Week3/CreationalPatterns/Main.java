package StartAtGoogle.Week3.CreationalPatterns;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(1,4,8,3);

        System.out.println(travelAgency.getMyVehicles());
        Passenger passenger = new Passenger("Moose","PLANE");
        Passenger passenger2 = new Passenger("Moose","PLANE");

        travelAgency.assignPassenger(passenger);
        travelAgency.assignPassenger(passenger2);
        System.out.println(travelAgency.getMyVehicles());
        System.out.println(travelAgency.getAssignedPass());



    }
}
