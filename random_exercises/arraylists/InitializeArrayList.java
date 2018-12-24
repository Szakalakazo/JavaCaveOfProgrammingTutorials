package random_exercises.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializeArrayList {
    public static void main(String[] args) {

        //Initialization using Arrays.asList
        ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Golf", "ibiza", "Partner"));
        System.out.println("Samochdy jakie miałem: " + obj);

        //Anonymous inner class method to initialize ArrayList
        ArrayList<String> obj2 = new ArrayList<String>() {{
            add("Warsaw");
            add("Krakow");
            add("Nassau");
        }};
        System.out.println("Cities in which I'be been: " + obj2);

        //Normal way of initialization
        ArrayList<String> books = new ArrayList<>();
        books.add("Java Book1");
        books.add("Java Book2");
        books.add("Java Book3");
        System.out.println("Books stored in array list are: " + books);


        //Collections.ncopies
        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(5,10));
        System.out.println("ArrayList items: "+intlist);




    }
}
