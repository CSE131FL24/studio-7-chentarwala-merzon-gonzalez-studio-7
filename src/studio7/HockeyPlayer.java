package studio7;

public class HockeyPlayer {
    private String name;            // Player's name
    private int jerseyNumber;        // Player's jersey number
    private String handedness;       // Right or Left handed
    private String shootingAbility;  // Shoots Right, Left, or Both
    private int goals;               // Total goals scored
    private int assists;             // Total assists made
    private int gamesPlayed;         // Total games played

    // Constructor
    public HockeyPlayer(String name, int jerseyNumber, String handedness, String shootingAbility) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.handedness = handedness;
        this.shootingAbility = shootingAbility;
        this.goals = 0;
        this.assists = 0;
        this.gamesPlayed = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getHandedness() {
        return handedness;
    }

    public String getShootingAbility() {
        return shootingAbility;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getPoints() {
        return goals + assists;  // Points = goals + assists
    }

    // Method to record stats for a game
    public void recordGame(int goalsInGame, int assistsInGame) {
        if (goalsInGame < 0 || assistsInGame < 0) {
            throw new IllegalArgumentException("Goals and assists cannot be negative.");
        }

        // Display stats for the current game
        System.out.println("\nGame " + (gamesPlayed + 1) + " Stats:");
        System.out.println("Goals scored in this game: " + goalsInGame);
        System.out.println("Assists made in this game: " + assistsInGame);
        System.out.println("Points in this game: " + (goalsInGame + assistsInGame));

        // Update the cumulative stats
        this.goals += goalsInGame;
        this.assists += assistsInGame;
        this.gamesPlayed++;

        // Display cumulative stats after update
        System.out.println("Cumulative Stats after Game " + gamesPlayed + ":");
        System.out.println("Total Goals: " + this.goals);
        System.out.println("Total Assists: " + this.assists);
        System.out.println("Total Points: " + getPoints());
        System.out.println("Games Played: " + this.gamesPlayed);
    }

    // toString method to display player's information and overall stats
    @Override
    public String toString() {
        return "HockeyPlayer{name='" + name + "', jerseyNumber=" + jerseyNumber +
                ", handedness='" + handedness + "', shootingAbility='" + shootingAbility +
                "', total goals=" + goals + ", total assists=" + assists + ", games played=" + gamesPlayed +
                ", total points=" + getPoints() + "}";
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new hockey player
        HockeyPlayer player = new HockeyPlayer("Alex Ovechkin", 8, "Left", "Right");

        // Display initial stats
        System.out.println(player);  

        // Record and display stats for the first game
        player.recordGame(2, 1);

        // Record and display stats for the second game
        player.recordGame(3, 2);

        // Display final cumulative stats
        System.out.println("\nFinal Cumulative Stats:");
        System.out.println(player);  
    }
}
