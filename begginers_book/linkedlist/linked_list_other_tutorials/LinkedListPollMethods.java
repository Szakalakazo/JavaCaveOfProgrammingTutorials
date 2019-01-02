package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;

public class LinkedListPollMethods {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add few Elements
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        linkedList.add("Element4");

        System.out.println("**Display LinkList elements");
        System.out.println("LinkedList before: " + linkedList);
        System.out.println("\n*** poll(): retrieves and removes the head (first element) of this list.");
        System.out.println("Element removed: " + linkedList.poll());
        System.out.println("LinkedList after: " + linkedList);

        System.out.println("\n\n*** pollFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty");
        System.out.println("Element removed: " + linkedList.pollFirst());
        System.out.println("Display list after calling pollFirst() method");
        System.out.println("LinkedList after" + linkedList);

    }
}
