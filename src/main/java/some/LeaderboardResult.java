package some;

public class LeaderboardResult {
    private final String teamName;
    private final int wins;
    private final int loses;
    private final int draws;
    private final int goals;
    private final int goalsLost;
    private final int points;

    public LeaderboardResult(String teamName) {
        this(teamName, 0, 0, 0, 0, 0);
    }

    public LeaderboardResult(String teamName, int wins, int loses, int draws, int goals, int goalsLost) {
        this.teamName = teamName;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.goals = goals;
        this.goalsLost = goalsLost;
        points = wins * 3 + draws;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsLost() {
        return goalsLost;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%s-%s-%s), %s/%s", teamName, points, wins, draws, loses, goals, goalsLost);
    }
}