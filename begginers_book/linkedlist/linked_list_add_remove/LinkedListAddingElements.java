package begginers_book.linkedlist.linked_list_add_remove;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAddingElements {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();

        /*Adding an element to LinkedListCloning*/
        ls.add("Bob");
        ls.add("Sue");
        ls.add("Tom");

        /*Adding an element at specific index*/
        ls.add(0, "NEW ELEMENT");

        //Iterating over list in forward direction*/
        System.out.println("Linked list after addiction:");
        for (String l : ls) System.out.println(l);

        /*Adding elements at the  beginning of the list*/
        ls.addFirst("FIRST element");
        ls.addLast("LAST element");
        System.out.println("\nList after adding addFirst & addLast: \n" + ls);

        /*Adding element to front(Head) of LinkedListCloning*/
        ls.offerFirst("FIRST HEAD");
        ls.offerLast("LAST HEAD");
        System.out.println("\nList after adding offerFirst & offerLast: \n" + ls);




    }
}
