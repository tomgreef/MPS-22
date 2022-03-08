package fibonacciTest;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
    * fibonacci 0 -> 0
    * fibonacci 1 -> 1
    * fibonacci 2 -> 1
    * fibonacci 3 -> 2
    * fibonacci 4 -> 3
    * fibonacci 5 -> 5
    * fibonacci 6 -> 8
    * fibonacci 7 -> 13
    * fibonacci 8 -> 21
    * fibonacci 50 -> 12586269025
    * fibonacci negative number
    * fibonacci 100
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
    @DisplayName("Test de que el Fibonacci de 0 es 0")
    public void testComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        long obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 1 es 1")
    public void testComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        long obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 2 es 1")
    public void testComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        long obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 3 es 2")
    public void testComputeReturnTwoIfTheNumberIsThree(){
        int expectedValue = 2;
        long obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 4 es 3")
    public void testComputeReturnThreeIfTheNumberIsFour(){
        int expectedValue = 3;
        long obtainedValue = fibonacci.compute(4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 5 es 5")
    public void testComputeReturnFiveIfTheNumberIsFive(){
        int expectedValue = 5;
        long obtainedValue = fibonacci.compute(5);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 6 es 8")
    public void testComputeReturnSixIfTheNumberIsEight(){
        int expectedValue = 8;
        long obtainedValue = fibonacci.compute(6);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 7 es 13")
    public void testComputeReturnSevenIfTheNumberIs13(){
        int expectedValue = 13;
        long obtainedValue = fibonacci.compute(7);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 8 es 21")
    public void testComputeReturnEightIfTheNumberIs21(){
        int expectedValue = 21;
        long obtainedValue = fibonacci.compute(8);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de -1 invoca RuntimeException")
    public void testComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 50 es 12586269025")
    public void testComputeIfTheNumberIs50(){
        long expectedValue = 12586269025L;
        long obtainedValue = fibonacci.compute(50);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("Test de que el Fibonacci de 100 invoca RuntimeException")
    public void testComputeOf251RaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(100));
    }
}
