package StartAtGoogle.Week2.ClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Farmer farmer = new Farmer(farm);

        Animal d=farm.acquire("Dog");
        farm.acquire("Dog");
        Animal c=farm.acquire("Cat");
        farm.acquire("Cow");
        farm.acquire("Cat");
        farm.acquire("Dog");
        Animal c2=farm.acquire("Cow");
        farm.printAllAnimals();

        farmer.makeItMove(c.getId());
        farmer.makeItMove(c2.getId());

        farmer.getAnimalById(c.getId());
        farm.printAllAnimals();

        Animal mateAnimal=farm.mate(d);
        System.out.println("\nMate Animal is: ");
        System.out.println(mateAnimal.toString());

        AttackingDog ad = new AttackingDog(123321,20,"Female","AttackingDog");
        System.out.println("\n");
        ad.move();

    }
}
