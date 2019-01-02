package begginers_book.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Fig");
        System.out.println("Before: HashSet contains: " + hashSet);


        System.out.println("\n\nIterating thought HashSet using iterator: ");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("\n\nIterating thought HashSet without using iterator: ");
        for (String fruit : hashSet) System.out.println(fruit);

        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add(null);
        hashSet.add(null);

        hashSet.clear();
        System.out.println("After: HashSet contains: " + hashSet);



    }
}
