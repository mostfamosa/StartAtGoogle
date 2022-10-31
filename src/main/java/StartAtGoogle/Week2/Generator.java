package StartAtGoogle.Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Generator {

    public enum itemType {
        Laptop,
        Food,
        Drink,
        Mobile,
    }

    //unique number
    static ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

    //unique number
    static ArrayList<String> listOfGenders = new ArrayList<String>();
    //unique types of item
    static ArrayList<itemType> listOfTypes = new ArrayList<itemType>();



    public static int generateRandomGrade() {
        Random rnd = new Random();
        return rnd.nextInt(101);
    }

    public static ArrayList<String> generateRandomRealNames(int limit) {

        //unique String
        String[] realNames={"Shai","Mostafa","khader","Assaf","Sagi","Lion","Lior","Jamal","Moshe","David","Michel","Joey","Barney","Ted","James","Samer","Zeev","Jaffe","Moaad","Rany"};

        Object[] indexOfNames = generateRandomUniqueNumbers(realNames.length,limit);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            result.add(realNames[(int) indexOfNames[i]]);
        }

        return result;
    }

    public static Object[] generateRandomUniqueNumbers(int limit,int howMany) {
        listOfNumbers.clear();
        for (int i = 1; i < limit; i++)
            listOfNumbers.add(i);

        Collections.shuffle(listOfNumbers);
        return listOfNumbers.subList(0,howMany).toArray();
    }

    public static int generateRandomUniqueNumber() {
        listOfNumbers.clear();
        for (int i = 1; i < 100; i++)
            listOfNumbers.add(i);

        Collections.shuffle(listOfNumbers);
        return listOfNumbers.get(0);
    }

    public static int generateRandomUniqueNumber(int limit) {
        listOfNumbers.clear();
        for (int i = 1; i < limit; i++)
            listOfNumbers.add(i);

        Collections.shuffle(listOfNumbers);
        return listOfNumbers.get(0);
    }

    public static int generateRandomWeight() {
        for (int i = 20; i < 200; i++)
            listOfNumbers.add(i);

        Collections.shuffle(listOfNumbers);
        return listOfNumbers.get(0);
    }

    public static String generateRandomGender() {

        listOfGenders.add("Male");
        listOfGenders.add("Female");

        Collections.shuffle(listOfGenders);
        return listOfGenders.get(0);
    }

    public static itemType generateRandomType() {

        listOfTypes.add(itemType.Mobile);
        listOfTypes.add(itemType.Drink);
        listOfTypes.add(itemType.Food);
        listOfTypes.add(itemType.Laptop);

        Collections.shuffle(listOfTypes);
        return listOfTypes.get(0);
    }
    public static Date generateRandomDate(){
        long aDay = TimeUnit.DAYS.toMillis(1);
        long now = new Date().getTime();
        Date nextFiveYears = new Date(now + aDay * 365 * 5);
        Date tenDaysAgo = new Date(now - aDay * 365*2);
        Date random = new Date(ThreadLocalRandom.current()
                .nextLong(tenDaysAgo.getTime(), nextFiveYears.getTime()));
        return random;
    }

}
