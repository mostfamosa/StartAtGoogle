package StartAtGoogle.Week3.CreationalPatterns;

import java.util.concurrent.ThreadLocalRandom;

public class Boat implements Vehicle{
    private String id;

    public Boat() {
        this.id = "Boat"+ ThreadLocalRandom.current().nextInt(100);
    }
    public String getId() {
        return id;
    }
    @Override
    public void move() {
        System.out.println("Boat is moving");
    }

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported by "+getId());
        move();
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id='" + id + '\'' +
                '}';
    }


}
