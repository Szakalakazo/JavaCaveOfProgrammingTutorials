package cave_of_programming_collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CaveOfProgramming_Sets {
    public static void main(String[] args) {

        /*HashSet doesn't not remember an order*/
//        Set<String> set1 = new HashSet<String>();

        /*LinkedHashSet remembers order you added*/
//        Set<String> set1 = new LinkedHashSet<>();

        /*TreeSet stores items in natural order*/
        Set<String> set1 = new TreeSet<>();

        set1.add("Dog");
        set1.add("Cat");
        set1.add("Mouse");
        set1.add("Snake");
        set1.add("Bear");

        //Adding of duplicate items does nothing
        set1.add("Dog");
        System.out.println(set1);

        //Iterating
        for (String element : set1) {
            System.out.println(element);
        }

        //Does set contains a given item?
        if (set1.contains("Dog")) {
            System.out.println("Set contains dog");
        } else System.out.println("Set does not contain dog");

        //Is not empty?
        if (!set1.isEmpty()) {
            System.out.println("Set is not empty");
        }

        //Set2 contains some commeon elements with set1 and some new
        Set<String> set2 = new TreeSet<>();

        set2.add("Dog");
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Monkey");
        set2.add("Ant");

        //Intersection
        Set<String> intersection = new HashSet<String>(set1);
        System.out.println(intersection);

        intersection.retainAll(set2);
        System.out.println(intersection);

        //Differents
        Set<String> diff = new HashSet<String>(set1);
        diff.removeAll(set2);
        System.out.println(diff);




    }
}
