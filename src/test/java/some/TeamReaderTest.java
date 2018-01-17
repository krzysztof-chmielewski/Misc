package some;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamReaderTest {

    @Test
    public void name() {
        boolean a = false;

        assertThat(a).isFalse();
    }

    @Test
    @Ignore
    public void collection() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        assertThat(integers).isNotEmpty().contains(5, 6, 7, 10);
    }
}