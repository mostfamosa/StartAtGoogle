package StartAtGoogle.Week3.CreationalPatterns;

public class VehicleFactory {
    enum VehicleType{TAXI,PLANE,BUS,BOAT}

    private static VehicleFactory instance;

    public static VehicleFactory getInstance(){
        if (instance==null)
            instance=new VehicleFactory();
        return instance;
    }

    private VehicleFactory(){

    }
    public Vehicle createVehicle(VehicleType type){
        switch (type){
            case TAXI:
                return new Taxi();
            case PLANE:
                return new Plane();
            case BUS:
                return new Bus();
            case BOAT:
                return new Boat();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", type));
        }
    }
}
