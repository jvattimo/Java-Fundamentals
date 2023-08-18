package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Take in number from user, create scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        // assign input to variable as int
        int userInput = scanner.nextInt();
        // print out index of number entered
        int index = -1; // Initialize to a value that won't be a valid index

        // Search for the index of the user input in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                index = i;
                break; // No need to continue searching
            }
        }

        if (index != -1) {
            System.out.println("The index of " + userInput + " is " + index);
        } else {
            System.out.println(userInput + " was not found in the array.");
        }

        scanner.close();
        }


    }