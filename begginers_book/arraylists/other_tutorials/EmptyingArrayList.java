package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;

public class EmptyingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        for (int i = 0; i < 1E5; i++) {
            al1.add(i);
        }

        long startClear = System.currentTimeMillis();
        al1.clear();
        long stopClear = System.currentTimeMillis();

        System.out.println("Time taken to clear ArrayList: " + (stopClear - startClear) + " ms.");

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for (int i = 0; i < 1E5; i++) {
            al2.add(i);
        }

        long startRemoveAll = System.currentTimeMillis();
        al2.removeAll(al2);
        long stopRemoveAll = System.currentTimeMillis();

        System.out.println("Time taken to removeAll ArrayList: " + (stopRemoveAll - startRemoveAll) + " ms.");
        System.out.println(".clear() method more efficient!!!");

        ////////Checking whether array is empty
        System.out.println("Is array 1 empty? " + al2.isEmpty());


        ArrayList<Integer> arrayList = new ArrayList<Integer>((int) (100));
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.trimToSize();
        System.out.println("ArrayList after trimming: " + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, i*i*i);
        }
        System.out.println("ArrayList after set() method: " + arrayList);


    }
}
