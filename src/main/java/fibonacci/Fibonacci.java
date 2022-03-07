package fibonacci;

/**
 * Class providing a method that computes the factorial of an integer number
 *
 * @author Tom van Greevenbroek
 **/

public class Fibonacci {

    public int compute(int value) {
        int result = 1;

        if(value < 0)
            throw new RuntimeException("Negative value: " + value);

        while(value > 1){
            result *= value;
            value--;
        }

        return result;
    }
}
