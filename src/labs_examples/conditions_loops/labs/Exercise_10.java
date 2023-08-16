package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        // Print all even numbers between 1 and the user input using a loop and "continue"
        System.out.println("Even numbers between 1 and " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers and move to the next iteration
            }
            System.out.println(i);
        }

        // Close the Scanner
        scanner.close();
    }
}
