package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

public class Cow extends Animal implements AnimalImplementaion {
    private String animalType;
    public Cow(int id, int weight, String gender,String animalType)
    {
        super(id, weight, gender,animalType);
        this.animalType=animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void move() {
        System.out.println("Cow Is Mooooving...\n");
    }

    public Animal mate(Animal partner) {
        String newGender = "Male";
        if (partner.gender == "Male")
            newGender = "Female";
        Animal newMate = new Cow(Generator.generateRandomUniqueNumber(),Generator.generateRandomWeight(),newGender,animalType);
        return newMate;
    }
}
