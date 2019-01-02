package cave_of_programming_collections.part2_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndListInterface {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();


        //Adding items at the end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        /*
        //Add items elsewhere
        for (int i = 0; i < 1E5; i++) {
            list.add(0,i);
        }
        */
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);

    }
}
