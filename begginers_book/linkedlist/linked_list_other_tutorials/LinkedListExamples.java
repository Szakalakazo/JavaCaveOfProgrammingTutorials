package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        /*LinkedListCloning declaration*/
        LinkedList<String> linkedList = new LinkedList<>();
        /*add(String Element) is used for adding
         * the elements to the linked list*/

        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        /*Displaying Linked List content*/
        System.out.println("Linked list Content: " + linkedList);

        /*Add first and last element*/
        linkedList.addFirst("First item");
        linkedList.addLast("Last item");
        System.out.println("LinkedListCloning Content after addition: " + linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(1));

        System.out.println("***Changing first item***");
        linkedList.set(0,"New 1st item");
        System.out.println("First item after modification: " + linkedList.getFirst());

        System.out.println("***Removing first and last item from fist***");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("***List after removal operation:***" + linkedList);




    }
}
