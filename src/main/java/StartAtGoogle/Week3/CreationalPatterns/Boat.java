package StartAtGoogle.Week3.CreationalPatterns;

public class Boat implements Vehicle{
    @Override
    public void move() {
        System.out.println("Boat is moving");
    }

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported");
        move();
    }
}
