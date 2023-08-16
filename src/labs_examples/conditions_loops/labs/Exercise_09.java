package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 50;
        while (x > 1) {
            x--;
            System.out.println(x);
            if (x == 14) {
                break;
            }
        }
    }
}
