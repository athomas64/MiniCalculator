/**
 * UnitTests is the Main Class contains the starting point for the program. This class creates multiple instances of
 * the MiniCalculator class and executes a series of unit tests on the Divide, Multiply, and Calculate methods. The
 * unit tests check general functioning and extreme cases.
 *
 * JDK version: 11.0.5
 *
 * @author  Aidan Thomas
 * @version 1.0.0
 * @since   04-18-2020
 */

public class UnitTests {

    // calls the methods for every unit test
    public static void main(String[] args){
        System.out.println("MULTIPLY TESTS:");
        multiplyTest();
        System.out.println("\nDIVIDE TESTS:");
        divideTest();
        System.out.println("\nCALCULATE TESTS:");
        calculateTest();
    }

    //unit tests for the multiply method
    private static void multiplyTest(){
        MiniCalculator miniCalculator = new MiniCalculator();
        miniCalculator.multiply(5);

        // checks basic functioning
        if(miniCalculator.total == 5){
            System.out.println("SUCCESS: Multiply by five");
        }else {
            System.out.println("FAILED: Multiply by five");
        }

        // checks negative number
        miniCalculator.multiply(-2);
        if(miniCalculator.total == -10){
            System.out.println("SUCCESS: Multiply by negative two");
        }else{
            System.out.println("FAILED: Multiply by negative two");
        }

        // checks very large number
        miniCalculator = new MiniCalculator();
        miniCalculator.multiply(2000000000);
        if(miniCalculator.total == 2000000000){
            System.out.println("SUCCESS: Multiply by 2 billion");
        }else {
            System.out.println("FAILED: Multiply by 2 billion");
        }

        // check number over Integer's limit
        miniCalculator.multiply(2);
        if(miniCalculator.total == (long) 2000000000 * 2){
            System.out.println("SUCCESS: Multiply by 2");
        }else {
            System.out.println("FAILED: Integers cannot be larger than " + Integer.MAX_VALUE);
        }

    }

    // divide method unit tests
    private static void divideTest(){
        MiniCalculator miniCalculator = new MiniCalculator();
        miniCalculator.total = 10;

        // checks basic functioning
        miniCalculator.divide(5);
        if(miniCalculator.total == 2){
            System.out.println("SUCCESS: Divide by 5");
        }else {
            System.out.println("FAILED: Divide by 5");
        }

        // checks division by one
        miniCalculator.divide(1);
        if(miniCalculator.total == 2){
            System.out.println("SUCCESS: Divide by 1");
        }else {
            System.out.println("FAILED: Divide by 1");
        }

        // checks division by zero
        try {
            miniCalculator.divide(0);
            System.out.println("Success: Divide by Zero");
        }
        catch (ArithmeticException e){
            System.out.println("FAILED: Divide by Zero");
        }

        // checks division with a decimal result
        miniCalculator.divide(3);
        if(miniCalculator.total == (float) 2/3){
            System.out.println("SUCCESS: Divide by 3");
        }else {
            System.out.println("FAILED: Division answers do not include decimal points");
        }

    }

    // unit tests for the calculate method
    private static void calculateTest(){
        MiniCalculator miniCalculator = new MiniCalculator();

        // checks result before calculations
        if(miniCalculator.total == miniCalculator.calculate()){
            System.out.println("SUCCESS: method correctly return the total");
        }else {
            System.out.println("FAILED: method does not correctly return the total");
        }

        // checks result after calculations are made
        miniCalculator.multiply(6753);
        if(miniCalculator.total == miniCalculator.calculate()){
            System.out.println("SUCCESS: method correctly return the total after calculations");
        }else {
            System.out.println("FAILED: method does not correctly return the total after calculations");
        }

        // checks result after the total variable is manually changed
        miniCalculator.total = -67;
        if(miniCalculator.total == miniCalculator.calculate()){
            System.out.println("SUCCESS: method correctly return the total after the variable was manually changed");
        }else {
            System.out.println("FAILED: method does not correctly return the total after the variable was manually changed");
        }
    }

}
