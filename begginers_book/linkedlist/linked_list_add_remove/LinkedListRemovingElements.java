package begginers_book.linkedlist.linked_list_add_remove;

import java.util.LinkedList;

public class LinkedListRemovingElements {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("JavaScript");
        ls.add("JCL");
        ls.add("C++");
        ls.add("C#");
        ls.add("Java");

        // Displaying Elements before replace
        System.out.println("LinkedList items:");
        for(String item :  ls) System.out.println(item);


        /*Removing by index*/
        //Removing 3rd element and creating a new object
        Object e1 = ls.remove(2);
        System.out.println("\nElement " + e1 + " removed from list.");

        // LinkedList elements after remove
        System.out.println("\nAfter removal by index: ");
        for(String item : ls) System.out.println(item);

        /*Removing by name*/
        //Removing C# element and creating
        ls.remove("C#");
        System.out.println("\nAfter removal by item: ");
        for(String item : ls) System.out.println(item);

        /*Removing first and removing last*/
        LinkedList<String> ls2 = new LinkedList<>();
        ls2.add("Item1");
        ls2.add("Item2");
        ls2.add("Item3");
        ls2.add("Item4");
        ls2.add("Item5");

        System.out.println("\n\n**LinkedList ls2 elements are:");
        for(String item : ls2) System.out.println(item);


        //Removing first element:
        Object firstElement = ls2.removeFirst();
        System.out.println("Element removed is " + firstElement);

        //Removing last element:
        Object lastElement = ls2.removeLast();
        System.out.println("Element removed is " + lastElement);

        /*Removing all elements from LinkedList*/

        System.out.println("\nList ls before removal: ");
        for(String item : ls) System.out.println(item);

        System.out.println("\nList ls after removal: ");
        ls.clear();
        System.out.println(ls);

        //Appending elements to LinkedList
        ls.addAll(ls2);
        System.out.println("\nLinkedList ls after appending elements from ls2:");
        System.out.println(ls);




    }
}
