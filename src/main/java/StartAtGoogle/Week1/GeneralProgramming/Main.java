package StartAtGoogle.Week1.GeneralProgramming;

import StartAtGoogle.Week1.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int playersNumber = 11;
        ArrayList<Player> myTeam = getTeam(playersNumber);
        System.out.println(myTeam);

    }

    public static ArrayList<Player> getTeam(int playersNumber) {

        //unique random real names for team players
        ArrayList<String> realNames = StartAtGoogle.Week1.Generator.generateRandomRealNames(playersNumber);

        //unique Jersey number
        Team myTeam = new Team(playersNumber);
        ArrayList<Integer> jerseyNumbers = myTeam.getJerseyNumbers();

        ArrayList<Player> myNewTeam = new ArrayList<Player>();

        for (int i = 0; i < playersNumber; i++) {
            Player pl = new Player(jerseyNumbers.get(i), realNames.get(i), Generator.generateRandomGrade());
            myNewTeam.add(pl);
        }

        //positions
        int lowLimit = 2;
        int highLimit = 6;
        Random rd = new Random();
        ArrayList<Integer> positionCount = new ArrayList<Integer>();

        positionCount.add(1);//only one goal keeper
        int secondPick = rd.nextInt(lowLimit + highLimit / 2) + lowLimit;
        positionCount.add(secondPick);

        highLimit = playersNumber - 1 - secondPick;
        int thirdPick = rd.nextInt(((lowLimit + highLimit) / 2) - lowLimit) + lowLimit;
        positionCount.add(thirdPick);

        positionCount.add(playersNumber - secondPick - thirdPick - 1);
        Collections.shuffle(positionCount);

        ArrayList<String> positionNames = new ArrayList<>();
        positionNames.add("Defender");
        positionNames.add("Midfielder");
        positionNames.add("Attacker");
        int playerIndexs = 0;
        String positionName = positionNames.remove(0);
        for (Integer pos : positionCount) {
            for (int i = 0; i < pos; i++) {
                if (pos == 1) {
                    myNewTeam.get(playerIndexs).setPosition("Goal Keeper");
                    playerIndexs++;
                } else {
                    myNewTeam.get(playerIndexs).setPosition(positionName);
                    playerIndexs++;
                }
            }
            //don't change the position if pos is 1 (goalkeeper not included in positionNames)
            if (!positionNames.isEmpty() && pos != 1)
                positionName = positionNames.remove(0);
        }

        return myNewTeam;
    }


}
