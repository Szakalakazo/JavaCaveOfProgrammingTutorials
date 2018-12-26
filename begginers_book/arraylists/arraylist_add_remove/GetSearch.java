package begginers_book.arraylists.arraylist_add_remove;

import java.util.ArrayList;
import java.util.List;

public class GetSearch {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        //Addition of elements in ArrayList
        al.add("Steve");
        al.add("Justin");
        al.add("Al");
        al.add("John");
        al.add("Arnold");
        al.add("Chris");

        System.out.println("Original array list: " + al);

        /////**Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<>(al.subList(1, 4));
        System.out.println("Sublist stored in al2: " + al2);

        //Sublist to string
        List l = al.subList(1, 4);


        ///***ArrayList lastIndexOf(Object 0bj) example
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(1);
        al3.add(88);
        al3.add(9);
        al3.add(17);
        al3.add(17);
        al3.add(9);
        al3.add(17);
        al3.add(91);
        al3.add(27);
        al3.add(1);
        al3.add(17);

        System.out.println("Last occurrence of element 1: " + al3.lastIndexOf(1));

        //****ArrayList get()



    }
}
