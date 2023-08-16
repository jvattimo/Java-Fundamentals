package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        // Find first vowel using a while loop
        int index = 0;
        char firstVowel = ' ';
        while (index < word.length()) {
            char currentChar = word.charAt(index);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                firstVowel = currentChar;
                break;
            }
            index++;
        }
        // Print word and the first vowel
        if (firstVowel != ' ') {
            System.out.println("The word is: " + word);
            System.out.println("The vowel is: " + firstVowel);
        } else {
            System.out.println("No vowel found in word");
        }
        scanner.close();
    }
}
