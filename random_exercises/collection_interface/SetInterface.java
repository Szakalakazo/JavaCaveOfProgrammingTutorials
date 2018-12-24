package random_exercises.collection_interface;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<>();
        set.add(23);
        for (int i = 0; i < count.length - 1; i++) {
            set.add(count[i]);
        }

        System.out.println(set);
        TreeSet sortedSe = new TreeSet<Integer>(set);
        System.out.println("Sorted list is: ");
        System.out.println(sortedSe);
        System.out.println("The first element of sorted list is: " + sortedSe.first());
        System.out.println("The last element of soroted list is: " + sortedSe.last());

        SortedSet<String> set2 = new TreeSet<String>();
        set2.add("Bob");
        set2.add("Sue");
        set2.add("Steve");

        /* Iterating over the elements in the set*/
        Iterator iterator = set2.iterator();

        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }





    }
}
