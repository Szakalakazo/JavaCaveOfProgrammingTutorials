package begginers_book.arraylists.arraylist_add_remove;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        //Adding elements to list
        arrayList1.add("Hi");
        arrayList1.add("hello");
        arrayList1.add("String");
        arrayList1.add("Test");
        System.out.println(arrayList1);

        //ArrayList2 of Strings
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Text1");
        arrayList2.add("Text2");
        arrayList2.add("Text3");
        arrayList2.add("Text4");

        //Adding arrayList2 to arrayList1
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        //Adding arrayList2 to arrayList1 at index
        arrayList1.addAll(1,arrayList2);
        System.out.println(arrayList1);





    }
}
