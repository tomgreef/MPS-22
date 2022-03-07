package fibonacciTest;

import fibonacci.Fibonacci;
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

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish (){
        fibonacci = null;
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsZero(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsTwo(){
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnSixIfTheNumberIsThree(){
        int expectedValue = 6;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturn720IfTheNumberIs6(){
        int expectedValue = 6;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}
