package cave_of_programming_collections.part7_sorting_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
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
        return "NAME is: " + name + ": ID is: " + id;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) return 1;
        else if (len1 < len2) return -1;
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Part7SortingLists {
    public static void main(String[] args) {

        /////////////// Sorting Strings ///////////////////////
        List<String> animals = new ArrayList<>();
        animals.add("mongoose");
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("lion");
        animals.add("elephant");

        //Collections.sort(animals, new StringLengthComparator());
        animals.sort(new ReverseAlphabeticalComparator());

        for (String animal : animals) System.out.println(animal);


        /////////////// Sorting Numbers ///////////////////////
        List<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(3);
        numbers.add(40);
        numbers.add(1);
        numbers.add(7);
        numbers.add(72);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        System.out.println(numbers);


        /////////////// Sorting Arbitrary Objects ///////////////////////

        List<Person> people = new ArrayList<>();
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));


        //Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()) return 1;
                else if (p1.getId() < p2.getId()) return -1;
                return 0;
            }
        });
        System.out.println("\nSoring by Id");
        for (Person person : people) System.out.println(person);

        //Sort in order of name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println("\nSoring by name");
        for (Person person : people) System.out.println(person);


    }
}
