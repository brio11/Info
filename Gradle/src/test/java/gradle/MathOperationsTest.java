package gradle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathOperationsTest {

    private final MathOperations mathOperations = new MathOperations();

    @Test
    public void testSum12() {
        int result = mathOperations.sum(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSum34() {
        int result = mathOperations.sum(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSum0minus1() {
        int result = mathOperations.sum(0, -1);
        assertEquals(-1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSum2_aIsNot1() {
        mathOperations.sum2(1, 5);
    }
}
