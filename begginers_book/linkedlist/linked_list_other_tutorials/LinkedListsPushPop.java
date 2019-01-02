package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;

public class LinkedListsPushPop {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add few Elements
        list.add("Jack");
        list.add("Robert");
        list.add("Bob");
        list.add("Kate");

        System.out.println("List contains: " + list);

        System.out.println("\n**Method push() inserts the element at the front of the list");
        list.push("PUSHED ELEMENT");
        System.out.println("List after pushing element: " + list);

        System.out.println("\n**Method pop() returns and removes first element from list:");
        System.out.println("Element removed from list using pop() method: " + list.pop());
        System.out.println("\nList after removing first element: " + list);

    }
}
