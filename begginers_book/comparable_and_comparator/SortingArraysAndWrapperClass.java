package begginers_book.comparable_and_comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArraysAndWrapperClass {
    public static void main(String[] args) {

        /*
         *Interface class implements Comparable
         *Interface so we can use the sort method
         */

        int[] arr = {11,55,22,0,89};
        Arrays.sort(arr);
        System.out.println("Sorted int array: " + Arrays.toString(arr));

        /*
         *String class implements Comparable
         *Interface so we can use the sort method
         */

        System.out.println("\nSorted String array: ");
        String[] names = {"Steve", "Bryan", "Kyle"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        /*
         * String class implements Comparable
         * Interface so we can use the sort method
         */

        System.out.println("\nSorted List: ");
        List<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");
        Collections.sort(fruits);
        for(String fruit : fruits) System.out.println(fruit);
    }
}
