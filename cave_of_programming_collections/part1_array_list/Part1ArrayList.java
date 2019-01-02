package cave_of_programming_collections.part1_array_list;

import java.util.ArrayList;

public class Part1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        //Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1");
        //Index for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        //Removing items
        numbers.remove(numbers.size() - 1);

        //This is VERY slow
        numbers.remove(0);

        System.out.println("\nIteration #2");
        for (Integer value : numbers) System.out.println(value);
    }
}
