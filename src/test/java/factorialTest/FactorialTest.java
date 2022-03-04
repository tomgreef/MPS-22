package factorialTest;

import factorial.Factorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
    * factorial 0 -> 1
    * factorial 1 -> 1
    * factorial 2 -> 2
    * factorial 3 -> 4
    * factorial 720 -> 6
    * factorial negative number
 **/

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @AfterEach
    public void finish (){
        factorial = null;
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsZero(){
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsTwo(){
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnSixIfTheNumberIsThree(){
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturn720IfTheNumberIs6(){
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }
}
