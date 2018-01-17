package some;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {

    @Test
    public void forNullNameThrowsException() {
        assertThatThrownBy(() -> new Player(null, "withSurname"))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @Ignore
    public void forValidParametersObjectIsCreated() {
        Player player = new Player("Name", "Surname");

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(player.getName()).isEqualTo("Name2");
        softly.assertThat(player.getSurname()).isEqualTo("Surname2");
        softly.assertAll();
    }


}
