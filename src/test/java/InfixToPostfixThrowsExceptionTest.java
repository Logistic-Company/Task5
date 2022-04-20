import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InfixToPostfixThrowsExceptionTest {
    @Test
    void convertInfixToPostfix_InfixGiven_ShouldThrowException() {
        String exp = "2 , 13 / 3";
        //assertEquals("2  13 ^ 3/", InfixToPostfix.convert(exp));
        assertThrows(AssertionFailedError.class, () -> InfixToPostfix.convert(exp), "Should consist only numbers" +
                "and math operations!!!");
    }
}
