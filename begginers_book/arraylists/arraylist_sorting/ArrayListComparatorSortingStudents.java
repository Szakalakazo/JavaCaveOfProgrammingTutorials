package begginers_book.arraylists.arraylist_sorting;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparatorSortingStudents {
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

        ArrayList<Student2> arrayList2 = new ArrayList<>();
        arrayList2.add(new Student2(223, "Tommy", 26));
        arrayList2.add(new Student2(245, "Roy", 24));
        arrayList2.add(new Student2(209, "Alice", 32));

        System.out.println("Sorting by age:");
        Collections.sort(arrayList2, Student2.StuAge);
        for(Student2 str : arrayList2) System.out.println(str);

        System.out.println("Sorting by name:");
        arrayList2.sort(Student2.StuNameComparator);
        for(Student2 str : arrayList2) System.out.println(str);

        System.out.println("Sorting by rollno:");
        arrayList2.sort(Student2.StuRollNoComparator);
        for(Student2 str : arrayList2) System.out.println(str);





    }
}
