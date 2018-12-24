package cave_of_programming_collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CaveOfProgramming_Maps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap = new TreeMap<Integer, String>();

        testMaps(treeMap);
    }

    private static void testMaps(Map<Integer,String> testMap){
        testMap.put(9, "Fox");
        testMap.put(2, "Snake");
        testMap.put(3, "Wolf");
        testMap.put(4, "Bear");
        testMap.put(11, "Dog");
        testMap.put(1, "Cat");

        for(Integer key : testMap.keySet()) {
            String value = testMap.get(key);
            System.out.println(key + ": " + value);
        }

    }
}
