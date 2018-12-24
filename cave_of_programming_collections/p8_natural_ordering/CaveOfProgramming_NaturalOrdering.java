package cave_of_programming_collections.p8_natural_ordering;

import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();

        ///////*CoP example*///////
        //if(len1 > len2) return 1;
        //else if(len1 < len2) return -1;
        //else return 0;

        ///////*Can be replaced with this*///////////
        return len1 > len2 ? 1 : len1 < len2 ? -1 : name.compareTo(person.name);

        ///////*Can be overwritten with
//        return Integer.compare(len1, len2);
    }
}

public class CaveOfProgramming_NaturalOrdering {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        SortedSet<Person> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        //Collections.sort(list); cannot apply to Person object - not collection

        System.out.println("***Elements in list***");
        showElements(list);
        System.out.println("***Elements in set***");
        showElements(set);
    }

    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joe"));
        col.add(new Person("Bob"));
        col.add(new Person("Sue"));
        col.add(new Person("Clare"));
        col.add(new Person("Tommy"));
    }

    private static void showElements(Collection<Person> col) {
        for (Person element : col) System.out.println(element);
    }
}
