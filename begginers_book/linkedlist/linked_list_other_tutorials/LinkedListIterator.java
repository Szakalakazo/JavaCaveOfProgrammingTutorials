package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        linkedList.add("Element4");
        linkedList.add("Element5");


        //Obtaining listIterator
        ListIterator listIterator = linkedList.listIterator();

        //Iterating the list in forward direction
        System.out.println("**Iterating the list in forward direction");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //Iterating the list in backward direction
        System.out.println("**Iterating the list in backward direction");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + 1 + " : " + listIterator.previous());
        }


    }
}
