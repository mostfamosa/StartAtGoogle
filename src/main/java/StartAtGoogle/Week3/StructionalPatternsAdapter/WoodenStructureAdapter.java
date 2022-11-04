package StartAtGoogle.Week3.StructionalPatternsAdapter;

public class WoodenStructureAdapter implements AnimalImplementaion{

    WoodHorse woodHorse;

    public WoodenStructureAdapter(WoodHorse woodHorse) {
        this.woodHorse = woodHorse;
    }


    public void move(){
        woodHorse.roll();
    }


    public void mate(){
        woodHorse.replicate();
    }



}
