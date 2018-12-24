package begginers_book.collection_interface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<Integer, String>();
        m1.put(1,"Sue");
        m1.put(2,"Roy");
        m1.put(4,"Tom");
        m1.put(3,"Ed");
        System.out.println(m1);
        System.out.println(m1.containsKey(3));
        System.out.println(m1.containsValue("Bob"));
        System.out.println(m1.get(2));
        System.out.println(m1.hashCode());
        System.out.println("Is m1 empty? " + m1.isEmpty());

        m1.put(1,"Anna");
        System.out.println(m1);
        System.out.println(m1.size());

    }
}
