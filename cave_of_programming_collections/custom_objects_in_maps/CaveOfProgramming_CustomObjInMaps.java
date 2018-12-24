package cave_of_programming_collections.custom_objects_in_maps;

import java.util.*;

class Person3{
    private int id;
    private String name;

    Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "{ID is: " + id + ", name is:  " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return id == person3.id && name.equals(person3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CaveOfProgramming_CustomObjInMaps {
    public static void main(String[] args) {
        Person3 person1 = new Person3(0, "Bob");
        Person3 person2 = new Person3(2, "Sue");
        Person3 person3 = new Person3(1, "Mike");
        Person3 person4 = new Person3(2, "Sue");

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("one", 1);

        for(String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<String> set = new LinkedHashSet<>();
        set.add("dog");
        set.add("cat");
        set.add("lion");
        set.add("cat");

        System.out.println(set);

        System.out.println("Person Map class sorting ");
        Map<Person3, Integer> map2 = new LinkedHashMap<Person3, Integer>();
        map2.put(person1,1);
        map2.put(person2,2);
        map2.put(person3,3);
        map2.put(person4,1);

        for(Person3 key : map2.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("Person class set sorting");
        Set<Person3> set2 = new LinkedHashSet<>();
        set2.add(person1);
        set2.add(person2);
        set2.add(person3);
        set2.add(person4);

        System.out.println(set2);



    }
}
