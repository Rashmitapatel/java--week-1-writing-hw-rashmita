package ProgrrameOne;

/** write a java programme that takes two numbers as input and display the product of two numbers
 * Test Data;
 * input first numbers:25
 * input second number: 5
 * Expected output: 25*5 = 125
 */
public class programme10_multiplicationOftwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second Number declaration
        int secondNumber = 5;
        int produced = firstNumber* secondNumber;
        //Expected output
        System.out.println(firstNumber + "X" + secondNumber+"=" +produced);
    }
}
