package StartAtGoogle.Week3.CreationalPatterns;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bus is moving.");
    }


    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName()+" is transported");
        move();
    }
}
