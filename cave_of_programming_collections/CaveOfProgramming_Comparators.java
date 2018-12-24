package cave_of_programming_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person2 {
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

class StringLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class CaveOfProgramming_Comparators {
    public static void main(String[] args) {
        //////////////////*Sorting Strings*//////////////////
        List<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("snake");
        animals.add("mongoose");

        /*Using Collection*/
        Collections.sort(animals, new StringLengthComparator());

        /*Using List*/
        animals.sort(new ReverseAlphabeticalComparator());

        /*Displaying items in list*/
        for (String animal : animals) System.out.println(animal);

        //////////////////*Sorting Numbers*//////////////////
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(34);
        numbers.add(32);
        numbers.add(1);
        numbers.add(444);

        /*Soring numbers*/
        Collections.sort(numbers);
        /*Displaying items in list*/
        for (int number : numbers) System.out.println(number);

        /*Sorting numbers in reverse order*/
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        /*Displaying items in list*/
        for (int number : numbers) System.out.println(number);

        //////////////////*Arbitrary Objects*//////////////////

        List<Person2> people = new ArrayList<Person2>();
        people.add(new Person2(3, "Bob"));
        people.add(new Person2(2, "Sue"));
        people.add(new Person2(1, "Joe"));
        people.add(new Person2(4, "Clare"));

        /*Displaying items in list*/
        System.out.println("List before sorting: ");
        for (Person2 person : people) System.out.println(person);

        /*Sorting list in ID order*/
        System.out.println("List after sorting by ID: ");
        Collections.sort(people, new Comparator<Person2>() {
            public int compare(Person2 p1, Person2 p2) {
                if (p1.getId() > p2.getId()) return 1;
                else if (p1.getId() < p2.getId()) return -1;
                return 0;
            }
        });
        /*Displaying items in list*/
        for (Person2 person : people) System.out.println(person);

        /*Sorting list in name order*/
        System.out.println("List after sorting by name: ");
        Collections.sort(people, new Comparator<Person2>() {
            @Override
            public int compare(Person2 p1, Person2 p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        /*Displaying items in list*/
        for (Person2 person : people) System.out.println(person);




    }
}
