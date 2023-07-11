package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // example of "AND"
        boolean c = true;
        boolean d = true;
        if (c & d) {
            System.out.println("c and d is true");
        }

        // example of "short circut AND"
        boolean e = true;
        boolean f = true;
        if (e && f) {
            System.out.println("e is true and f is true");
        }

        // example of "short circut OR"
        boolean g = true;
        boolean h = true;
        if (g || h) {
            System.out.println("g is true and h is true");
        }
        // example of "XOR"
        boolean i = false;
        boolean j = true;
        if (i ^ j) {
            System.out.println("i is false and j is true");
        }

        // example of "NOT"
        boolean k = true;
        boolean l = false;
        if (!l) {
            System.out.println("l is false");
        }
    }

}

