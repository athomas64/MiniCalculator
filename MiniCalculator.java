/**
 * MiniCalculator class extends the Calculator class. This class inherits the Divide and Multiply method and implements
 * the calculate method. This class is not abstract so unit tests are performed on instances of this class.
 *
 * JDK version: 11.0.5
 *
 * @author  Aidan Thomas
 * @version 1.0.0
 * @since   04-18-2020
 */

public class MiniCalculator extends Calculator {

    // implements the calculate method inherited from Calculator class
    // returns the total variable also inherited from Calculator class
    @Override
    public int calculate() {
        return total;
    }

}
