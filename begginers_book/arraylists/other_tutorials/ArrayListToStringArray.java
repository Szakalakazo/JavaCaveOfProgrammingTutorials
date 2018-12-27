package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;

public class ArrayListToStringArray {
    public static void main(String[] args) {


        /*Method 1: Manual way of conversion using ArrayList get() method*/
        /*ArrayList declaration and initialization*/
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("String1");
        arrayList.add("String2");
        arrayList.add("String3");
        arrayList.add("String4");

        /*ArrayList to String array*/
        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        for(String element : array) System.out.println(element);

        /*Method2: Conversion using toArray() method*/
        /*ArrayList declaration and initialization*/
        ArrayList<String> alNames= new ArrayList<String>();
        alNames.add("Anet");
        alNames.add("Mike");
        alNames.add("Bob");
        alNames.add("John");


        /*ArrayList to Array Conversion */
        long start1 = System.currentTimeMillis();
        String[] names = alNames.toArray(new String[1]);
        long stop1 = System.currentTimeMillis();
        System.out.println("Time without declared size: " + (stop1-start1));


        long start2 = System.currentTimeMillis();
        String[] names2 = alNames.toArray(new String[alNames.size()]);
        long stop2 = System.currentTimeMillis();

        System.out.println("Time with declared size: " + (stop2-start2));
        for(String person : names) System.out.println(person);
    }
}
