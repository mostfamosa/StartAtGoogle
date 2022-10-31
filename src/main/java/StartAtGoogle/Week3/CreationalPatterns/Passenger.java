package StartAtGoogle.Week3.CreationalPatterns;

import java.util.concurrent.ThreadLocalRandom;

public class Passenger {
    enum VehicleType{TAXI,PLANE,BUS,BOAT}

    private String name;
    private VehicleType favVehicle;

    public Passenger(String name,String type) {
        this.name = name;
        this.favVehicle = VehicleType.valueOf(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getFavVehicle() {
        return favVehicle;
    }

    public void setFavVehicle(VehicleType favVehicle) {
        this.favVehicle = favVehicle;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", favVehicle=" + favVehicle +
                '}';
    }
}
