import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team (String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.players.size() == this.maxSize) {
            return;
        }
        this.players.add(player);
    }

    public void printPlayers(){
        String playersAsString = "";

        for (Player player : players) {
            playersAsString += player.getName()+ ", goals " + player.goals() + "\n";
        }

        System.out.println(playersAsString);
    }

    public void setMaxSize(int size) {
        this.maxSize = size;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int totalGoals = 0;

        for (Player player : players) {
            totalGoals += player.goals();
        }

        return totalGoals;
    }
}
