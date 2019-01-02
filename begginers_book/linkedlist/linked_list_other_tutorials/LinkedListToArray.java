package begginers_book.linkedlist.linked_list_other_tutorials;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        //Creating and populating LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Harry");
        linkedList.add("Maddy");
        linkedList.add("Chetan");
        linkedList.add("Chauhan");
        linkedList.add("Singh");

        System.out.println("Converting LinkedList to Array");
        String[] array = linkedList.toArray(new String[0]);
        //    String[] array = linkedlist.toArray(new String[linkedlist.size()]);

        //Displaying Array content
        System.out.println("Array Elements:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
