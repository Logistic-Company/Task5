import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationsThrowExceptionTest {
    @Test
    void calculateRPN_PostfixGiven_ShouldShowException() {
        String[] tokens = new String[] {"2", "3", "^", "1", "-"};
        assertThrows(ArithmeticException.class, () -> Calculations.evaluateRPN(tokens), "Unsupported operator!!!");
    }
}
