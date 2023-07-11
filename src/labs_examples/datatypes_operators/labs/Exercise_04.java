package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // example of "greater than"
        int c = 4;
        int d = 3;
        if (c > d){
            System.out.println("c is greater than d");
        }

        // example of "less than or equal to"
        int e = 7;
        int f = 9;
        if (e <= f) {
            System.out.println("e is less than or equal to f");
        }

        // example of "greater than or equal to"
        int g = 15;
        int h = 9;
        if (g >= h) {
            System.out.println("g is greater than or equal to h");
        }

        // example of "equal to"
        int i = 15;
        int j = 15;
        if (i == j) {
            System.out.println("i is equal to j, fuck you you don't own i and j, bitch");
        }

    }

}

