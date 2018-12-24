package begginers_book.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorInterface {
    public static void main(String[] args) {

        //List of objects of AuthorNameClass
        ArrayList<AuthorNameComparator> al = new ArrayList<>();
        al.add(new AuthorNameComparator("Henry", "Tropic of Cancer",  45));
        al.add(new AuthorNameComparator("Nalo", "Brown Girl in the Ring", 56));
        al.add(new AuthorNameComparator("Frank", "300", 65));
        al.add(new AuthorNameComparator("Deborah", "Sky Boys", 51));
        al.add(new AuthorNameComparator("George R. R.", "A Song of Ice and Fire", 62));

        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */

        System.out.println("Sorting by Author FIRST NAME:");
        Collections.sort(al);
        for(AuthorNameComparator name : al) System.out.println(name);

        System.out.println("\nSorting by Author AGE:");
        Collections.sort(al, new AuthorAgeComparator());
        for(AuthorNameComparator name : al) System.out.println(name);

        System.out.println("\nSorting by BOOKS TITLE:");
        Collections.sort(al, new BookNameComparator());
        for(AuthorNameComparator name : al) System.out.println(name);
    }
}
