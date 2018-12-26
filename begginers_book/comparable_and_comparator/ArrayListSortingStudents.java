package begginers_book.comparable_and_comparator;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingStudents {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(223, "Tommy", 26));
        arrayList.add(new Student(245, "Roy", 24));
        arrayList.add(new Student(209, "Alice", 32));

        System.out.println("Sorting by age:");
        Collections.sort(arrayList);
        for(Student str : arrayList) System.out.println(str);

        System.out.println("Sorting by rollNo:");
        arrayList.sort(Student::compareToRoll);
        for(Student str : arrayList) System.out.println(str);
    }
}
