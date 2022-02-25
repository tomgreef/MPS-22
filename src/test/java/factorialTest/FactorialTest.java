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
        factorial 720 -> 6
        factorial negative number
 */

public class FactorialTest {
    @Test
    public void testComputeReturnOneIfTheNumberIsZero(){
        var factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsOne(){
        var factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsTwo(){
        var factorial = new Factorial();
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnSixIfTheNumberIsThree(){
        var factorial = new Factorial();
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturn720IfTheNumberIs6(){
        var factorial = new Factorial();
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeOfANegativeNumberRaiseAnException(){
        var factorial = new Factorial();
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }
}
