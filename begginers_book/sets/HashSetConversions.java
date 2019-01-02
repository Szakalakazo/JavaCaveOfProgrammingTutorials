package begginers_book.sets;

import java.util.*;

public class HashSetConversions {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");

        System.out.println("HashSet contains: " + hset);


        /*Converting to TreeSet*/
        //Creating a TreeSet
        Set<String> tset = new TreeSet<>(hset);
        System.out.println("TreeSet contains: " + tset);

        /*Converting to ArrayList*/
        List<String> arrayList = new ArrayList<>(hset);
        System.out.println("ArrayList contains: " + arrayList);

        /*Converting to Array*/
        String[] array = new String[tset.size()];
        tset.toArray(array);
        System.out.println("Array created from TreeSet contains:");
        for (String i : array) System.out.println(i);

    }
}
