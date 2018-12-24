package random_exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(50);

        //Retrieving
        System.out.println("Last item: " + numbers.get(2));

        //Indexed for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + " is: " + numbers.get(i));
        }

        //Romving numbers from end of list -- FASTER
        numbers.remove(numbers.size()-1);

        //Removing items from beggining VERY SLOW -- it createc a copy of new array
        numbers.remove(0);

        System.out.println("\nIteration number 2");
        for (Integer values : numbers)
            System.out.println("Number at index " + values + " is: " + values);

        //List interface...
        List<String> values = new ArrayList<String>();





    }
}
