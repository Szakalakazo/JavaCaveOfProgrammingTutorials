package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;

public class LinkedListCloning {
    public static void main(String[] args) {
        // Creating LinkedListCloning of String Elements
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();

        // Populating it with String values
        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("CC");
        linkedList.add("AA");
        linkedList.add("DD");
        linkedList.add("AA");
        linkedList.add("EE");

        //contains method checks whether the element exist
        System.out.println("***contains() method checks whether the element exist");
        if (linkedList.contains("CC")) {
            System.out.println("Element CC is present in List");
        } else {
            System.out.println("List doesn't have element CC");
        }

        if (linkedList.contains("Fa")) {
            System.out.println("Element Fa is present in List");
        } else {
            System.out.println("List doesn't have element Fa");
        }


        // create a LinkedListCloning
        java.util.LinkedList<String> list = new java.util.LinkedList<String>();

        // Adding elements to the LinkedListCloning
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        System.out.println("\nDisplaying list before elements: ");
        System.out.println(list);

        System.out.println("\nCreating another list and cloning elements from LinkedListCloning to it:");
        java.util.LinkedList list2 = new java.util.LinkedList();
//        list2 = (LinkedListCloning) list.clone();
        list2 = (java.util.LinkedList) linkedList.clone();
        System.out.println("\nList2 elements after cloning: " + list2);


    }
}
