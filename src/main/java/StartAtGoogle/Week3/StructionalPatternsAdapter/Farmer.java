package StartAtGoogle.Week3.StructionalPatternsAdapter;

import java.util.ArrayList;

public class Farmer implements AnimalImplementaion {

    private Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public void makeItMove(int id)
    {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals=farm.getAnimalsInFarm();
        for (Animal a : myAnimals) {
            if(a.getId()==id)
                a.move();
        }
    }
    public Animal getAnimalById(int id){
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals=farm.getAnimalsInFarm();
        for (Animal a : myAnimals) {
            if(a.getId()==id) {
                Animal animalById = a;
                myAnimals.remove(a);
                return animalById;
            }
        }
        System.out.println("Animal Not Found!");
        return null;
    }
}
