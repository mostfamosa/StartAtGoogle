package StartAtGoogle.Week3.StructionalPatternsAdapter;

import StartAtGoogle.Week4.DebugWithLog.Debugger;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Animal d = farm.acquire("Dog");
        WoodHorse woodHorse = new WoodHorse();

        System.out.println("Wood Horse:");
        woodHorse.roll();
        woodHorse.replicate();

        System.out.println("Dog:");
        d.move();

        WoodenStructureAdapter woodAdapter = new WoodenStructureAdapter(woodHorse);
        System.out.println("WoodHorseAdapter:");

        woodAdapter.move();



    }
}
