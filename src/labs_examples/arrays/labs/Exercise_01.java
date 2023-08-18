package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        int[] numbers = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Calculate sum and average of numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);

    }

}