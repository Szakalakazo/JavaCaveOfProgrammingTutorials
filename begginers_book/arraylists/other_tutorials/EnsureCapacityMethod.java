package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;

public class EnsureCapacityMethod {
    public static void main(String[] args) {
        // ArrayList with Capacity 4
        ArrayList<String> al = new ArrayList<String>(4);
        //Added 4 elements
        al.add("Hi");
        al.add("Hello");
        al.add("Bye");
        al.add("GM");


        //Increase capacity to 5

        al.add("GE");
        // let us print all the elements available in list
        System.out.println(al);


    }
}
