package some;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void shouldThrowExceptionWhenDividedByZero() {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public int act() {
                return 0;
            }

            @Override
            public int act2() {
                return 0;
            }
        };
        ThrowableAssert.ThrowingCallable callable =
                () -> calculator.divide(12312313.0, 0.0);





        assertThatThrownBy(callable)
        .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    public void shouldReturn1If2DividedBy2() {
        assertThat(calculator.divide(2, 2)).isEqualTo(1);
    }

    @Test
    public void shouldReturnHalfFor2DividedBy4() {
        assertThat(calculator.divide(2, 4)).isEqualTo(0.5);
    }
}