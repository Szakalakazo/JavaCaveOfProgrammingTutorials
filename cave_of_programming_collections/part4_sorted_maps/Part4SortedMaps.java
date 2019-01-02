package cave_of_programming_collections.part4_sorted_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Part4SortedMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap, "hashMap");
        testMap(linkedHashMap, "linkedHashMap");
        testMap(treeMap,"treeMap");

    }

    private static void testMap(Map<Integer, String> map, String type) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        System.out.println("\n" + type);
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key: " + key + "; value: " + value);
        }
    }
}
