package cave_of_programming_collections.part5_sets;

import java.util.*;

public class Part5Sets {
    public static void main(String[] args) {


        //HashSet doest not retain order
        //Set<String> set1 = new HashSet<String>();

        //LinkedHashSet remembers the order you added item in
        //Set<String> set1 = new LinkedHashSet<>();

        //TreeSet sorts in natural order

        Set<String> set1 = new TreeSet<>();
        if(set1.isEmpty()) System.out.println("Set is empty at start");

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        //Adding duplicate items does nothing:
        set1.add("dog");

        if(set1.isEmpty()) System.out.println("Set is empty at start");

        System.out.println(set1);

        /////////// Iteration /////////////
        for(String element : set1) System.out.println(element);

        ///////////////Does set contains a given item? ////////////
        if(set1.contains("aardvark")) System.out.println("Contains aardvark");
        if(set1.contains("cat")) System.out.println("Contains cat");


        //////////////// Intersection ///////////////////
        Set<String> set2 = new TreeSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");
        set2.add("monkey");
        set2.add("ant");
        set2.add("giraffe");

        System.out.println("\nSet2 contains some common elements with set1 and some new");


        Set<String> intersection = new HashSet<>(set1);

        System.out.println(intersection);

        intersection.retainAll(set2);
        System.out.println("\nIntersection/ common elements of set1 and set2 : " + intersection);


        //////////////// Differences ////////////////
        Set<String> difference = new HashSet<>(set2);
        difference.removeAll(set1);
        System.out.println("Unique elements of set1: " + difference);









    }
}
