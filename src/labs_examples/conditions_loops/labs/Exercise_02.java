package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 10 to receive a response: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        // Check number and return day of the week
        String day;
        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 2) {
            day = "Tuesday";
        }else if (number == 3) {
            day = "Wednesday";
        }else if (number == 4) {
            day = "Thursday";
        }else if (number == 5) {
            day = "Friday";
        }else if (number == 6) {
            day = "Saturday";
        }else if (number == 7) {
            day = "Sunday";
        }else {
            day = "Other";
        }

        // Print out result
        System.out.println("The number corresponds to the day " + day);

        // Close scanner
        scanner.close();

    }
}
