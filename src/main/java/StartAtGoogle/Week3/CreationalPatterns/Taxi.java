package StartAtGoogle.Week3.CreationalPatterns;

import java.util.concurrent.ThreadLocalRandom;

public class Taxi implements Vehicle{

    private String id;

    public Taxi() {
        this.id = "Taxi"+ ThreadLocalRandom.current().nextInt(100);
    }
    public String getId() {
        return id;
    }

    @Override
    public void move() {
        System.out.println("Taxi is moving");
    }

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported by "+getId());
        move();
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id='" + id + '\'' +
                '}';
    }
}
