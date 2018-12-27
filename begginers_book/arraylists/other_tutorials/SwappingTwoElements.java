package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingTwoElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("111");
        al.add("222");
        al.add("333");
        al.add("444");
        al.add("555");
        al.add("666");

        System.out.println("Array before swapping:");
        for(String element: al) System.out.println(element);

        //Swapping 2nd(index 1) element with the 5th(index 4) element
        Collections.swap(al,1,3);

        System.out.println("Array after swapping:");
        for(String element: al) System.out.println(element);
    }

}
