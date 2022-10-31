package StartAtGoogle.Week1.CreatAndDestroyObjects;

import StartAtGoogle.Week1.GeneralProgramming.Player;
import StartAtGoogle.Week2.Generator;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        int playersNumber = 11;
        Team myTeam = new Team();
        myTeam=Team.getNewTeamPlayers(playersNumber);

        myTeam.writeToFile();
        System.out.println(myTeam);
    }
}
