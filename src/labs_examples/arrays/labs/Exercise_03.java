package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int currentNumber = 3;

        //populate with multiples of 3
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                array[row][col] = currentNumber;
                currentNumber += 3;
            }
        }
        //print array
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
       }
    }
