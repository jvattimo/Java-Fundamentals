package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregularArray = {
                {546, 23},
                {120, 16, 25},
                {12, 1223, 23, 24}
        };
        for (int[] row : irregularArray) {
            for(int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println(); // move to next line
        }
    }

}
