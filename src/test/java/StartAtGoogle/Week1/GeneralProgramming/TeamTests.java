package StartAtGoogle.Week1.GeneralProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeamTests {
    private static Team team;

    @BeforeEach
    void setup() {
        team = new Team(11);
    }

    @Test
    void team_playersNumber_ThrowException() {
        assertThrows(IllegalArgumentException.class,()-> new Team(1));
    }

    @Test
    void team_getJerseyNumbers_higherThan0LowerThan100() {
        ArrayList<Integer> jerseys = team.getJerseyNumbers();
        HashSet<Integer> setJerseys = new HashSet<>(jerseys);
        assertEquals(setJerseys.size(),jerseys.size(),"numbers are not unique");
    }

    @Test
    void team_GoalKeeper_OnlyOne() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> GK = myTeam.stream().filter(player -> player.getPosition().equals("Goal Keeper"));
        assertEquals(1, GK.count(),"There is more than 1 GoalKeeper");

    }

    @Test
    void team_PlayersAmount_Equals11() {
        ArrayList<Player> myTeam = team.getTeam();
        assertEquals(11, myTeam.size(), "Team players amount are not equal to 11");
    }

    @Test
    void team_PlayerGrade_LowerThan100() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> gradesHigherThan100 = myTeam.stream().filter(player -> player.getGrade() > 100);
        assertEquals(0, gradesHigherThan100.count(), "There is a player with a grade higher than 100");
    }

    @Test
    void team_Defenders_HigherOrEqualTo2() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Defenders = myTeam.stream().filter(player -> player.getPosition().equals("Defender"));

        assertEquals(true, Defenders.count() >= 2, "Defenders number is lower than 2");
    }

    @Test
    void team_Defenders_LowerOrEqualTo6() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Defenders = myTeam.stream().filter(player -> player.getPosition().equals("Defender"));

        assertEquals(true, Defenders.count() <= 6, "Defenders number is higher than 6");
    }

    @Test
    void team_Attackers_HigherOrEqualTo2() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Attackers = myTeam.stream().filter(player -> player.getPosition().equals("Attacker"));

        assertEquals(true, Attackers.count() >= 2, "Attackers number is lower than 2");
    }

    @Test
    void team_Attackers_LowerOrEqualTo6() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Attackers = myTeam.stream().filter(player -> player.getPosition().equals("Attacker"));

        assertEquals(true, Attackers.count() <= 6, "Attackers number is higher than 6");
    }

    @Test
    void team_Midfielders_HigherOrEqualTo2() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Midfielders = myTeam.stream().filter(player -> player.getPosition().equals("Midfielder"));
        assertEquals(true, Midfielders.count() >= 2, "Midfielders number is lower than 2");
    }

    @Test
    void team_Midfielders_LowerOrEqualTo6() {
        ArrayList<Player> myTeam = team.getTeam();
        Stream<Player> Midfielders = myTeam.stream().filter(player -> player.getPosition().equals("Midfielder"));

        assertEquals(true, Midfielders.count() <= 6, "Midfielders number is higher than 6");
    }


}
