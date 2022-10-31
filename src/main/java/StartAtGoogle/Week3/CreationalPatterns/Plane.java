package StartAtGoogle.Week3.CreationalPatterns;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Plane is flying");
    }

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported");
        move();
    }
}
