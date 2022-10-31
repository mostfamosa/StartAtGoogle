package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

import java.util.ArrayList;

class Farm {

    private static ArrayList<Animal> animalsInFarm=new ArrayList<Animal>();

    public ArrayList<Animal> getAnimalsInFarm() {
        return animalsInFarm;
    }

    public Animal acquire(String animalType) {

        switch (animalType) {
            case "Dog":
                Dog newDog = new Dog(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender(), animalType);
                animalsInFarm.add(newDog);
                return newDog;

            case "Cat":
                Cat newCat = new Cat(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender(), animalType);
                animalsInFarm.add(newCat);
                return newCat;

            case "Cow":
                Cow newCow = new Cow(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender(), animalType);
                animalsInFarm.add(newCow);
                return newCow;
            default:
                throw new IllegalArgumentException(String.format("Animal %s Is Not Supported!\n",animalType));
        }

    }



    public Animal mate(Animal mateAnimal) {

        for (Animal animal : animalsInFarm) {
            if (animal.animalType.equals(mateAnimal.animalType)) {
                if (animal.getGender() != mateAnimal.getGender())
                    return animal;
            }
        }
        if (mateAnimal.getGender() == "Female")
            return acquireOppisiteGender(mateAnimal.animalType, "Male");
        else
            return acquireOppisiteGender(mateAnimal.animalType, "Female");
    }
    public Animal acquireOppisiteGender(String animalType, String gender) {

        switch (animalType) {
            case "Dog":
                Dog newDog = new Dog(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), gender, animalType);
                animalsInFarm.add(newDog);
                return newDog;

            case "Cat":
                Cat newCat = new Cat(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), gender, animalType);
                animalsInFarm.add(newCat);
                return newCat;

            case "Cow":
                Cow newCow = new Cow(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), gender, animalType);
                animalsInFarm.add(newCow);
                return newCow;
            default:
                System.out.println("Animal Is Not Supported!\n");
                return new Animal();
        }
    }

    public void printAllAnimals() {
        System.out.println("In The Farm There Is: \n");
        for (Animal a : animalsInFarm) {
            System.out.println(a.toString());
        }
    }
}
