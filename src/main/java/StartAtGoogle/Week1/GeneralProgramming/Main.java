package StartAtGoogle.Week1.GeneralProgramming;

import StartAtGoogle.Week1.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int playersNumber = 11;
        Team team = new Team(playersNumber);
        ArrayList<Player> myTeam = team.getTeam();
        System.out.println(myTeam);
    }
}
