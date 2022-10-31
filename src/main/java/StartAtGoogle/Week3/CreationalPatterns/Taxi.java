package StartAtGoogle.Week3.CreationalPatterns;

public class Taxi implements Vehicle{
    @Override
    public void move() {
        System.out.println("Taxi is moving");
    }

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported");
        move();
    }
}
