import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InfixToPostfixTest {
    @Test
    void convertInfixToPostfix_InfixGiven_ShouldShowPostfix() {
        String exp = "2 * 13 / 3";
        assertEquals("2  13 * 3/", InfixToPostfix.convert(exp));
    }
}
