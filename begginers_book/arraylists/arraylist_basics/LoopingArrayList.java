package begginers_book.arraylists.arraylist_basics;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(14);
        arrayList.add(7);
        arrayList.add(39);
        arrayList.add(40);


        /*For loop*/
        System.out.println("1. For loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        /*Advanced for loop*/
        System.out.println("\n2. Advanced for loop");
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        /*While loop*/
        System.out.println("\n3. While loop");
        int counter = 0;
        while (counter < arrayList.size()){
            System.out.println(arrayList.get(counter));
            counter++;
        }

        /*Looping array using iterator*/
        System.out.println("\n4. Iterator");
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
