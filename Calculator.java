/**
 * The Calculator class is abstract and implements the Multiplier and Divider interfaces. The multiply and divide
 * methods are implemented with correct functionality. There is one default constructor and an abstract method
 * 'calculate' which needs to be implemented.
 *
 * JDK version: 11.0.5
 *
 * @author  Aidan Thomas
 * @version 1.0.0
 * @since   04-18-2020
 */


public abstract class Calculator implements Multiplier, Divider {

    //protected class-wide variable
    protected int total;

    //default constructor initialized total variable
    public Calculator(){
        total = 1;
    }

    // implemented method from Divider
    @Override
    public void divide(int y) {
        total /= y;
    }

    // implemented method from Multiplier
    @Override
    public void multiply(int y) {
        total *= y;
    }

    // abstract method needs to be implemented
    public abstract int calculate();

}
