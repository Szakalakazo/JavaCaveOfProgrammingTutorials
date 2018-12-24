package begginers_book.collection_interface;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println("ArrayList Elements");
        System.out.println("\t" + a1);

        /*boolean contains*/
        System.out.println(a1.contains("Zara"));

        Object[] a2 = a1.toArray();
        for(Object o : a2) System.out.println(o);
    }
}
