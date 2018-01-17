package some;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Team {
    private final String name;
    private final Set<Player> players = new HashSet<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
