package begginers_book.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linked_list_get_search {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Tim");
        ls.add("Rock");
        ls.add("Hulk");
        ls.add("Rock");
        ls.add("James");
        ls.add("Rock");

        //Getting first element from list
        System.out.println("***Getting first element from list***");
        Object firstElement = ls.getFirst();
        System.out.println("First element from list is " + firstElement);

        //Getting last element from list
        System.out.println("\nGetting last element from list");
        Object lastElement = ls.getLast();
        System.out.println("Last element from list is " + lastElement);

        //Getting element from specific index
        System.out.println("\nGetting element from specific index");
        for (int i = 0; i < ls.size() ; i++) {
            System.out.println("Element ar index " + i + " is: " + ls.get(i));
        }

        //Search elements in LinkedList
        System.out.println("\n***Search elements in LinkedList***");
        System.out.println("Searching first occurrence of element");

        int firstIndex = ls.indexOf("Rock");
        System.out.println("First Occurrence of 'Rock': " + firstIndex);

        //Searching last occurrence of element
        int lastIndex = ls.lastIndexOf("Rock");
        System.out.println("Last Occurrence of 'Rock': " + lastIndex);


        //Getting sublist
        System.out.println("\n\n***Getting sublist from LinkedList***");
        LinkedList<String> ls2 = new LinkedList<String>();
        ls2.add("Item1");
        ls2.add("Item2");
        ls2.add("Item3");
        ls2.add("Item4");
        ls2.add("Item5");
        ls2.add("Item6");
        ls2.add("Item7");

        System.out.println("Displaying list ls: " + ls2);

        System.out.println("\nObtaining Sublist from the LinkedList");
        List sublist = ls2.subList(2,5);
        System.out.println("Displaying sublist: " + sublist);

        /* Any changes made to Sub List will be reflected
         * in the original List. Lets take this example - We
         * are removing element "Item4" from sublist and it
         * should be removed from original list too. Observe
         * the Output of this part of the program.
         */
        sublist.remove(1);
        System.out.println("\nsublist after removal item at index 2: " + sublist);
        System.out.println("ls2 after removal item in sublist: " + ls2);









    }
}
