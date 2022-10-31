package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

public class AttackingDog extends Dog{

    private String animalType="AttackingDog";
    public AttackingDog(int id, int weight, String gender, String animalType) {
        super(id, weight, gender, animalType);
    }

    @Override
    public void move() {
        System.out.println("Attacking Dog Is Moving...\n");
    }

    @Override
    public Animal mate(Animal partner) {
        String newGender = "Male";
        if (partner.gender == "Male")
            newGender = "Female";
        Animal newMate = new Dog(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), newGender,animalType);
        return newMate;
    }


}
