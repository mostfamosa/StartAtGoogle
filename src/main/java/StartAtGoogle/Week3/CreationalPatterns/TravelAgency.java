package StartAtGoogle.Week3.CreationalPatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TravelAgency {

    private int numOfPlane;
    private int numOfBus;
    private int numOfTaxi;
    private int numOfBoat;
    private Map<Passenger, Vehicle> assignedPass = new HashMap<>();
    HashMap<Vehicle, Boolean> myVehicles = new HashMap<>();
    private VehicleFactory factory = VehicleFactory.getInstance();

    public TravelAgency(int numOfPlane, int numOfBus, int numOfTaxi, int numOfBoat) {
        this.numOfPlane = numOfPlane;
        for (int i = 0; i < numOfPlane; i++) {
            myVehicles.put(factory.createVehicle(VehicleFactory.VehicleType.PLANE), true);
        }
        this.numOfBus = numOfBus;
        for (int i = 0; i < numOfBus; i++) {
            myVehicles.put(factory.createVehicle(VehicleFactory.VehicleType.BUS), true);
        }
        this.numOfTaxi = numOfTaxi;
        for (int i = 0; i < numOfTaxi; i++) {
            myVehicles.put(factory.createVehicle(VehicleFactory.VehicleType.TAXI), true);
        }
        this.numOfBoat = numOfBoat;
        for (int i = 0; i < numOfBoat; i++) {
            myVehicles.put(factory.createVehicle(VehicleFactory.VehicleType.BOAT), true);
        }
    }


    public Map<Vehicle, Boolean> getMyVehicles() {
        return myVehicles;
    }

    public Map<Passenger, Vehicle> getAssignedPass() {
        return assignedPass;
    }

    public void assignPassenger(Passenger p) {


        switch (p.getFavVehicle()){
            case PLANE:
                if (numOfPlane>0){

                    getVehicleByType(p,"PLANE");
                    break;

                } else if (numOfTaxi>0)
                {
                    System.out.println("The agency has no PLANE available, so "+p.getName()+" gets a taxi.");
                    getVehicleByType(p,"TAXI");
                    break;

                } else if (numOfBus>0) {
                    System.out.println("The agency has no PLANE available, so "+p.getName()+" gets a bus.");
                    getVehicleByType(p,"BUS");
                    break;

                } else if (numOfBoat>0) {
                    System.out.println("The agency has no PLANE available, so "+p.getName()+" gets a boat.");
                    getVehicleByType(p,"BOAT");
                    break;

                }else {

                    System.out.println("Now the agency has no vehicles");
                    break;
                }
            case TAXI:
                if (numOfTaxi>0){

                    getVehicleByType(p,"TAXI");
                    break;

                } else if (numOfPlane>0)
                {
                    System.out.println("The agency has no TAXI available, so "+p.getName()+" gets a plane.");
                    getVehicleByType(p,"PLANE");
                    break;

                } else if (numOfBus>0) {
                    System.out.println("The agency has no TAXI available, so "+p.getName()+" gets a bus.");
                    getVehicleByType(p,"BUS");
                    break;

                } else if (numOfBoat>0) {
                    System.out.println("The agency has no TAXI available, so "+p.getName()+" gets a boat.");
                    getVehicleByType(p,"BOAT");
                    break;

                }else {

                    System.out.println("Now the agency has no vehicles");
                    break;
                }
            case BUS:
                if (numOfBus>0){

                    getVehicleByType(p,"BUS");
                    break;

                } else if (numOfPlane>0)
                {
                    System.out.println("The agency has no BUS available, so "+p.getName()+" gets a plane.");
                    getVehicleByType(p,"PLANE");
                    break;

                } else if (numOfTaxi>0) {
                    System.out.println("The agency has no BUS available, so "+p.getName()+" gets a taxi.");
                    getVehicleByType(p,"TAXI");
                    break;

                } else if (numOfBoat>0) {
                    System.out.println("The agency has no BUS available, so "+p.getName()+" gets a boat.");
                    getVehicleByType(p,"BOAT");
                    break;

                }else {

                    System.out.println("Now the agency has no vehicles");
                    break;
                }
            case BOAT:
                if (numOfBoat>0){

                    getVehicleByType(p,"BOAT");
                    break;

                } else if (numOfPlane>0)
                {
                    System.out.println("The agency has no BOAT available, so "+p.getName()+" gets a plane.");
                    getVehicleByType(p,"PLANE");
                    break;

                } else if (numOfTaxi>0) {
                    System.out.println("The agency has no BOAT available, so "+p.getName()+" gets a taxi.");
                    getVehicleByType(p,"TAXI");
                    break;

                } else if (numOfBus>0) {
                    System.out.println("The agency has no BOAT available, so "+p.getName()+" gets a bus.");
                    getVehicleByType(p,"BUS");
                    break;

                }else {

                    System.out.println("Now the agency has no vehicles");
                    break;
                }


        }




    }

    public void getVehicleByType(Passenger p ,String type){

        Vehicle availablePlane = new Plane();
        Vehicle availableBoat =new Boat();
        Vehicle availableTaxi = new Taxi();
        Vehicle availableBus = new Bus();



        for (HashMap.Entry<Vehicle, Boolean> entry : myVehicles.entrySet()) {

            if (entry.getKey() instanceof Plane && entry.getValue()) {
                availablePlane = entry.getKey();
            }
            if (entry.getKey() instanceof Taxi && entry.getValue()){
                availableTaxi= entry.getKey();
            }
            if (entry.getKey() instanceof Boat && entry.getValue()){
                availableBoat=entry.getKey();
            }
            if (entry.getKey() instanceof Plane && entry.getValue()){
                availableBus=entry.getKey();
            }
        }

        switch (type){
            case "PLANE":
                myVehicles.put(availablePlane, false);
                assignedPass.put(p,availablePlane);
                numOfPlane--;
                availablePlane.transport(p);
                break;
            case "TAXI":
                myVehicles.put(availableTaxi, false);
                assignedPass.put(p,availableTaxi);
                numOfTaxi--;
                availableTaxi.transport(p);
                break;
            case "BOAT":
                myVehicles.put(availableBoat, false);
                assignedPass.put(p,availableBoat);
                numOfBoat--;
                availableBoat.transport(p);
                break;
            case "BUS":
                myVehicles.put(availableBus, false);
                assignedPass.put(p,availableBus);
                numOfBus--;
                availableBus.transport(p);
                break;
            default:
                System.out.println("Vehicle type not supported!");
                break;
        }
    }
}
