package some;

import java.util.Objects;

public class Player {
    private final String name;
    private final String surname;

    public Player(String name, String surname) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(surname, player.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }
}
