package StartAtGoogle.Week3.CreationalPatterns;

import java.util.ArrayList;
import java.util.Map;

public class TravelAgency {
    enum VehicleType{TAXI,PLANE,BUS,BOAT}

    private int numOfPlane;
    private int numOfBus;
    private int numOfTaxi;
    private int numOfBoat;
    private Map<Passenger,Vehicle> assignedPass;
    private final ArrayList<Vehicle> myVehicles = new ArrayList<>();
    private VehicleFactory factory= VehicleFactory.getInstance();
    public TravelAgency(int numOfPlane, int numOfBus, int numOfTaxi, int numOfBoat) {
        this.numOfPlane = numOfPlane;
        for (int i = 0; i <numOfPlane ; i++) {
            myVehicles.add(factory.createVehicle(VehicleFactory.VehicleType.PLANE));
        }
        this.numOfBus = numOfBus;
        for (int i = 0; i <numOfBus ; i++) {
            myVehicles.add(factory.createVehicle(VehicleFactory.VehicleType.BUS));
        }
        this.numOfTaxi = numOfTaxi;
        for (int i = 0; i <numOfTaxi ; i++) {
            myVehicles.add(factory.createVehicle(VehicleFactory.VehicleType.TAXI));
        }
        this.numOfBoat = numOfBoat;
        for (int i = 0; i <numOfBoat ; i++) {
            myVehicles.add(factory.createVehicle(VehicleFactory.VehicleType.BOAT));
        }
    }

    public int getNumOfPlane() {
        return numOfPlane;
    }

    public void setNumOfPlane(int numOfPlane) {
        this.numOfPlane = numOfPlane;
    }

    public int getNumOfBus() {
        return numOfBus;
    }

    public void setNumOfBus(int numOfBus) {
        this.numOfBus = numOfBus;
    }

    public int getNumOfTaxi() {
        return numOfTaxi;
    }

    public void setNumOfTaxi(int numOfTaxi) {
        this.numOfTaxi = numOfTaxi;
    }

    public int getNumOfBoat() {
        return numOfBoat;
    }

    public void setNumOfBoat(int numOfBoat) {
        this.numOfBoat = numOfBoat;
    }

    public ArrayList<Vehicle> getMyVehicles() {
        return myVehicles;
    }


    public void assignPassenger(Passenger p){
        switch (p.getFavVehicle()){
            case PLANE:
                setNumOfPlane(getNumOfPlane()-1);
                System.out.println(p.getName()+" is assigned to Plane");
                break;
            case BOAT:
                setNumOfBoat(getNumOfBoat()-1);
                System.out.println(p.getName()+" is assigned to Boat");
                break;
            case BUS:
                setNumOfBus(getNumOfBus()-1);
                System.out.println(p.getName()+" is assigned to Bus");
                break;
            case TAXI:
                setNumOfTaxi(getNumOfTaxi()-1);
                System.out.println(p.getName()+" is assigned to Taxi");
                break;
            default:
                System.out.println("Sorry Cant Assign a vehicle");
        }

    }
}
