package begginers_book.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Z");
        linkedHashSet.add("PQ");
        linkedHashSet.add("N");
        linkedHashSet.add("O");
        linkedHashSet.add("KK");
        linkedHashSet.add("FGH");
        System.out.println(linkedHashSet);
    }
}
