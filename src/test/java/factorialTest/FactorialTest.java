package factorialTest;

import factorial.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    Test cases:
        factorial 0 -> 1
        factorial 1 -> 1
        factorial 2 -> 2
        factorial 3 -> 4
 */

public class FactorialTest {
    @Test
    public void testComputeReturnOneIfTheNumberIsZero(){
        Factorial factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }
}
