package StartAtGoogle.Week3.StructionalPatternsAdapter;

import StartAtGoogle.Week2.Generator;

public class Cat extends Animal {
    private String animalType;
    public Cat(int id, int weight, String gender,String animalType) {
        super(id, weight, gender,animalType);
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void move() {
        System.out.println("The Cat Is Moving..\n");
    }

    public Animal mate(Animal partner) {
        String newGender = "Male";
        if (partner.gender == "Male")
            newGender = "Female";
        Animal newMate = new Cat(Generator.generateRandomUniqueNumber(),Generator.generateRandomWeight(),newGender,animalType);
        return newMate;
    }

}
