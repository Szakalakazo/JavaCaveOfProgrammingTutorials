package begginers_book.arraylists;


import java.util.ArrayList;
import java.util.Collections;

class Student /*implements Comparable*/{
    private String name;
    private int rollNo;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    @Override
    public int compareTo(Student compareStudent) {
        int comparAge = ((Student)compareStudent).getAge();
    }*/
}

public class SortingUsingComparableAndComparator {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(223, "Chaitanya", 26));
        arrayList.add(new Student(245, "Rahul", 24));
        arrayList.add(new Student(209, "Ajeet", 32));


    }
}
