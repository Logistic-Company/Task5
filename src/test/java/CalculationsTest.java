import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @Test
    void calculateRPN_PostfixGiven_ShouldShowCalculationsResult() {
        String[] tokens = new String[] {"2", "3", "*", "1", "-"};
        assertEquals(5, Calculations.evaluateRPN(tokens));
    }
}
