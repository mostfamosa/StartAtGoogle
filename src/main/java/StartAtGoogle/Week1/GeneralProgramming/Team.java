package StartAtGoogle.Week1.GeneralProgramming;

import StartAtGoogle.Week1.Generator;

import java.util.ArrayList;

public class Team {

    private static ArrayList<Integer> jerseyNumbers;
    private static int numberOfPlayers;

    public Team(int numberPlayers) {
        this.numberOfPlayers = numberPlayers;
        jerseyNumbers =  Generator.generateRandomUniqueNumbers(100,numberOfPlayers);
    }

    public ArrayList<Integer> getJerseyNumbers() {
        return jerseyNumbers;
    }

}
