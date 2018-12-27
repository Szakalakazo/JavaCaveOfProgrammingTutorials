package begginers_book.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> linkedListA = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedListA.add("LA" + i);
        }
        System.out.println("LinkedList A: " + linkedListA);

        LinkedList<String> linkedListB = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedListB.add("LB" + i);
        }
        System.out.println("LinkedList B: " + linkedListB);

        linkedListA.add("Hello");
        System.out.println("1. boolean add(Object item): " + linkedListA);

        linkedListA.add(1,"Second item added");
        System.out.println("2. void add(int index, Object item): " + linkedListA);

        linkedListA.addAll(2,linkedListB);
        System.out.println("3,4. boolean addAll(int index, Collection c): " + linkedListA);

        linkedListA.addFirst("First obj added");
        System.out.println("5. void addFirst(Object item): " + linkedListA);

        linkedListA.addLast("Last object added");
        System.out.println("6. void addFirst(Object item): " + linkedListA);

        linkedListA.clear();
        System.out.println("7.void clear(): " + linkedListA);

        System.out.println("8. boolean contains(Object item): " + linkedListA.contains("AA"));






    }
}
