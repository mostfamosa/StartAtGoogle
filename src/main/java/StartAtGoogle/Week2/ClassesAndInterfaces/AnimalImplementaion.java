package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

interface AnimalImplementaion {

     static void move() {
        System.out.println("The Animal Is Moving");
    }

     default Animal mate(Animal partner) {
//        switch (partner.) {
//            case "Dog":
//                return new Dog(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender());
//
//            case "Cat":
//                return new Cat(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender());
//
//            case "Cow":
//                return new Cow(Generator.generateRandomUniqueNumber(), Generator.generateRandomWeight(), Generator.generateRandomGender());
//            default:
//                System.out.println("Animal Is Not Supported!\n");
//                return null;
//        }
        return partner;
    }


}
