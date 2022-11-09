package StartAtGoogle.Week3.CreationalPatterns;

import java.util.concurrent.ThreadLocalRandom;

public class Bus implements Vehicle{

    private String id;

    public Bus() {
        this.id = "Bus"+ ThreadLocalRandom.current().nextInt(100);
    }
    public String getId() {
        return id;
    }
    @Override
    public void move() {
        System.out.println("Bus is moving.");
    }


    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported by "+getId());
        move();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                '}';
    }
}
