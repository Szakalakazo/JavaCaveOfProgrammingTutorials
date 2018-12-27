package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;

public class JoiningCombiningArrays {
    public static void main(String[] args) {
        //First Array
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AL1 : E1");
        arrayList.add("AL1 : E2");
        arrayList.add("AL1 : E3");
        arrayList.add("AL1 : E4");

        //Second ArrayList
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("AL2 : E1");
        arrayList2.add("AL2 : E2");
        arrayList2.add("AL2 : E3");

        //New ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.addAll(arrayList);
        al.addAll(arrayList2);
        //Displaying elements of the joined ArrayList
        for (String temp : al) {
            System.out.println(temp);
        }

    }
}
