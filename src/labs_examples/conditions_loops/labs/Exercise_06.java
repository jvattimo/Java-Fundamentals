package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;
        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
        }
        System.out.println("The sum of the upper and lower bound of 1 to 100 is "+ sum);
    }
}
