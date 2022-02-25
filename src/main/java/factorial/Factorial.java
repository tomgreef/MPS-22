package factorial;

/**
 * Class providing a method that computes the factorial of an integer number
 *
 * @author Tom vG
 **/

public class Factorial {

    public int compute(int value) {
        int result = 1;

        if(value < 0)
            throw new RuntimeException("Negative value: " + value);

        while(value > 1){
            result *= value;
            value--;
        }
        // result =  value * compute(value - 1);

        return result;
    }
}
