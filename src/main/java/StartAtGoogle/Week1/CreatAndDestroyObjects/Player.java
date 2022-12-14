package StartAtGoogle.Week1.CreatAndDestroyObjects;

public class Player {
    private int jerseyNumber;
    private int grade;
    private String name;
    private String position;

    public Player(int jerseyNumber, String name, int grade) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.grade = grade;
    }
    public Player() {

    }


    public static  Player createPlayerWithNoJerseyNum(int grade,String name,String position){
        Player player = new Player();
        player.setGrade(grade);
        player.setName(name);
        player.setPosition(position);
        return player;
    }
    public static  Player createPlayerWithNoGrade(int jerseyNumber,String name,String position){
        Player player = new Player();
        player.setJerseyNumber(jerseyNumber);
        player.setName(name);
        player.setPosition(position);
        return player;
    }
    public static  Player createPlayerWithNoName(int jerseyNumber,int grade,String position){
        Player player = new Player();
        player.setJerseyNumber(jerseyNumber);
        player.setGrade(grade);
        player.setPosition(position);
        return player;
    }
    public static  Player createPlayerWithNoPosition(int jerseyNumber,int grade,String name){
        Player player = new Player();
        player.setJerseyNumber(jerseyNumber);
        player.setGrade(grade);
        player.setName(name);
        return player;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "jerseyNumber=" + jerseyNumber +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}'+'\n';
    }

}