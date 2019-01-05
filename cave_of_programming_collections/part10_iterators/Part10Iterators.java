package cave_of_programming_collections.part10_iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Part10Iterators {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();


        animals.add("fox");
        animals.add("dog");
        animals.add("cat");
        animals.add("mouse");

        Iterator<String> iterator = animals.iterator();

        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);

            if(value.equals("cat")) iterator.remove();
        }

        System.out.println();


        /// Modern iteration, Java 5 and later
        for(String animal : animals) System.out.println(animal);


    }
}
