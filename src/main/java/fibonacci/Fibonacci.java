package fibonacci;

/**
 * Class providing a method that computes the factorial of an integer number
 *
 * @author Tom van Greevenbroek
 **/

public class Fibonacci {

    public long compute(int value) {
        if(value < 0)
            throw new RuntimeException("El valor es negativo");
        if(value > 92) // (fib(92) = 7540113804746346429 < 9223372036854775807 = long.MAX_VALUE)
            throw new RuntimeException("El valor no puede exceder 92");

        if (value == 0)
            return 0;
        else if (value == 1)
            return 1;
        else
            return compute(value - 1) + compute(value - 2);
    }
}
