package StartAtGoogle.Week1.CreatAndDestroyObjects;

import java.util.ArrayList;
import java.util.Collections;

import static StartAtGoogle.Week1.Generator.generateRandomUniqueNumbers;

public class NameGenerator {
    private final String[] names;

    public NameGenerator(String[] names) {
        this.names = names;
    }

    public static ArrayList<String> generateRandomRealNames(int limit) {

        //unique String
        String[] realNames={"Shai","Mostafa","khader","Assaf","Sagi","Lion","Lior","Jamal","Moshe","David","Michel","Joey","Barney","Ted","James","Samer","Zeev"};

        ArrayList<Integer> indexOfNames = generateRandomUniqueNumbers(realNames.length-1, limit);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            result.add(realNames[indexOfNames.get(i)]);
        }
        return result;
    }

}
