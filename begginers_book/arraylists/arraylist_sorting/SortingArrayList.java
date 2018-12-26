package begginers_book.arraylists.arraylist_sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {

        //////////String ArrayLists//////////////
        ArrayList<String> listOfCountries = new ArrayList<>();
        addElement(listOfCountries);

        System.out.println("\n***Unsorted list***");
        System.out.println(listOfCountries);

        System.out.println("\n***Sorted list***");
        Collections.sort(listOfCountries);
        System.out.println(listOfCountries);

        System.out.println("\n***List sorted in decreasing order***");
        //Collections.sort(listOfCountries, Collections.reverseOrder());
        listOfCountries.sort(Collections.reverseOrder());
        System.out.println(listOfCountries);

        //////////Integer ArrayLists//////////////
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(111);
        arrayList.add(1);
        arrayList.add(71);
        arrayList.add(5);

        System.out.println("\n***Integer ArrayList before sorting***");
        System.out.println(arrayList);
        Collections.sort(arrayList);

        System.out.println("***Integer ArrayList after sorting***");
        System.out.println(arrayList);

    }

    private static void addElement(Collection<String> col){
        col.add("India");
        col.add("USA");
        col.add("Poland");
        col.add("China");
        col.add("Russia");
    }
}
