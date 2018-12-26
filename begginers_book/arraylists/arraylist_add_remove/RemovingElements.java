package begginers_book.arraylists.arraylist_add_remove;

import java.util.ArrayList;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("AB");
        al.add("CD");
        al.add("EF");
        al.add("GH");
        al.add("AB");
        al.add("YZ");

        System.out.println("ArrayList before removing:");
        System.out.println(al);

        System.out.println("Removing 1sr element:");
        al.remove(0);
        System.out.println(al);

        System.out.println("Removing last element:");
        al.remove(al.size()-1);
        System.out.println(al);

        System.out.println("Removing by item:");
        al.remove("CD");
        System.out.println(al);

        boolean b = al.remove("ZZ");
        System.out.println("Element ZZ removed: "+b);
        System.out.println("ArrayList After remove:");
        System.out.println(al);


    }

}
