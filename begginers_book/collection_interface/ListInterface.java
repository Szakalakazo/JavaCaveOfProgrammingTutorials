package begginers_book.collection_interface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String>a1 = new ArrayList<String>();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList a1 Elements");
        System.out.print("\t" + a1);

        List<String>a2 = new ArrayList<String>();
        a2.add("Dog");
        a2.add("Cat");
        a2.add("Fish");
        System.out.println("\nArrayList a2 Elements");
        System.out.println("\t" + a2);

        //void add(int index, Object obj)
        a1.add(3,"Zara");
        System.out.println("\nArrayList Elements");
        System.out.println("\t" + a1);

        //boolean addAll(int index, Collection c)
        a1.addAll(1,a2);
        System.out.println("\nArrayList Elements");
        System.out.println("\t" + a1);

        //Object get(int index)
        System.out.println(a1.get(1));

        //int indexOf(Object obj)
        System.out.println(a1.indexOf("Fisqh"));

        //int lastIndexOf(Object obj)
        System.out.println(a1.lastIndexOf("Zara"));

        //Object remove(int index)
        a1.remove(4);
        System.out.println(" ArrayList a1 Elements");
        System.out.println("\t" + a1);

        //Object set(int index, Object obj)
        a1.set(0,"ZeroKurde");
        System.out.println(" ArrayList a1 Elements");
        System.out.println("\t" + a1);




    }
}
