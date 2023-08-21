package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int [] array = {12, 15, 293, 20, 102, 293, 2, 5, 15, 22};
        for (int i = array.length - 1; i >= 0; i -= 2) {
            System.out.println(array[i] + " ");
        }

    }
}
