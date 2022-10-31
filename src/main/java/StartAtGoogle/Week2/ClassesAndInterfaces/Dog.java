package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

class Dog extends Animal implements AnimalImplementaion {

    private String animalType;
    public Dog(int id, int weight, String gender,String animalType) {
        super(id, weight, gender,animalType);
        this.animalType=animalType;
    }


    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public void move() {
        System.out.println("Dog Is Moving...\n");
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
