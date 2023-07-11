package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double Pi = 3.141592654;
        double r = 3.14;
        double r2 = r*r;
        int h = 5;
        double SurfaceArea = 2*Pi*r*h + 2*Pi*r2;
        double Volume = Pi*r2*h;
        System.out.println(SurfaceArea);
        System.out.println(Volume);
        }
    }