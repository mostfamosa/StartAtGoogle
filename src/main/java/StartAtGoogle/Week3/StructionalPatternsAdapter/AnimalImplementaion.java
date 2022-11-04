package StartAtGoogle.Week3.StructionalPatternsAdapter;


interface AnimalImplementaion {


    static void move() {
        System.out.println("The Animal Is Moving");
    }

    default Animal mate(Animal partner) {
        return partner;
    }

}
