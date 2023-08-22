package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        //Initialize array
        ArrayList<String> animalList = new ArrayList<>();
        //add values to list
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Zebra");
        animalList.add("Monkey");
        animalList.add("Tarantula");
        animalList.add("Dracula");
        //sort animal list
        animalList.remove("Dracula");
        Collections.sort(animalList);
        String animal = animalList.get(3);
        //Print out array list
        System.out.println(animalList);
        System.out.println("The animal at index 3 is " + animal);
    }
}
