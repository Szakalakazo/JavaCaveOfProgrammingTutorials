package begginers_book.sets;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet of String Type
        TreeSet<String> tset = new TreeSet<String>();

        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");


        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        tset2.add(7);   //No duplicating elements allowed

        System.out.println("TreeSet sorts elements in scdending order: \n"  + tset + "\n" + tset2);
    }
}
