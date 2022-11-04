package StartAtGoogle.Week3.StructionalPatternsAdapter;

public class WoodHorse implements WoodenStructures{
    @Override
    public void roll() {
        System.out.println("wood horse is rolling");
    }

    @Override
    public void replicate() {
        System.out.println("wood horse is replicating");
    }
}
