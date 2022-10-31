package StartAtGoogle.Week1.CreatAndDestroyObjects;

import StartAtGoogle.Week1.Generator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Team {

    private static String name;
    private static ArrayList<Player> teamPlayers;
    private static ArrayList<Integer> jerseyNumbers;
    private static int numberOfPlayers;

    public Team(int numberPlayers) {
        this.numberOfPlayers = numberPlayers;
        jerseyNumbers =  Generator.generateRandomUniqueNumbers(100,numberOfPlayers);
    }

    public Team() {

    }

    public ArrayList<Integer> getJerseyNumbers() {
        return jerseyNumbers;
    }

    public  ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public  void setTeamPlayers(ArrayList<Player> teamPlayers) {
        Team.teamPlayers = teamPlayers;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Team.name = name;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public static void setNumberOfPlayers(int numberOfPlayers) {
        Team.numberOfPlayers = numberOfPlayers;
    }

    public static Team getNewTeamPlayers(int playersNumber){

        Team myTeam = new Team(playersNumber);

        //unique random real names for team players
        ArrayList<String> realNames = Generator.generateRandomRealNames(playersNumber);

        //unique Jersey number
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
        System.out.println(positionCount);
        //print Formation
        ArrayList<String> positionsOfFormation = new ArrayList<>();
        positionsOfFormation.add("Defense");
        positionsOfFormation.add("Middlefield");
        positionsOfFormation.add("Attack");

        int gkIndex=positionCount.indexOf(1);
        positionCount.remove(gkIndex);
        System.out.println("1 - GK,");
        for (int i = 0; i < positionCount.size() ; i++) {
            System.out.println(""+positionCount.get(i)+" - "+positionsOfFormation.get(i)+",");
        }

        myTeam.setTeamPlayers(myNewTeam);
        return myTeam;

    }
    @Override
    public String toString() {
        return "Team{" +
                "Name=" + name +
                ", Number Of Players =" + numberOfPlayers +
                '\n'+Team.teamPlayers;
    }

    public void writeToFile() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("the-team-data.txt", "UTF-8");
        writer.println(this.toString());
        writer.close();
    }



}
