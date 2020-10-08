package io.turntabl;

public class MyMath implements IMyMath {

    public int divide(int numerator, int denominator) throws Exception {
        int result = numerator / denominator;


        if (denominator == 0) {
            throw new DivideErrorException("Cannot divide by zeroooo!");
        }

        return result;
    }
    public int multiply(int num1, int num2){
        int result2 = num1 * num2 ;

        if (num1 ==0 || num2 == 0){
            System.out.println("Your result is 0");
            }
        else {
            System.out.println( "Your result is ");
        }
        return result2;

        }

}
