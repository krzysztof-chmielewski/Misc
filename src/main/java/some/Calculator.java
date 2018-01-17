package some;

public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("B cannot be 0");
        }

        return a / b;
    }
}
