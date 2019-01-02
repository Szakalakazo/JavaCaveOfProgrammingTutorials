package cave_of_programming_collections.part3_hash_map;

import java.util.HashMap;
import java.util.Map;

public class Part3HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(8,"Eight");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");

        map.put(77,"Hello");

        String text = map.get(6);

        System.out.println(text);

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + "; value: " + value);
        }


    }
}
