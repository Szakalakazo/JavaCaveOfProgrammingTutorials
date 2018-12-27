package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;

class Student{
    private String studentName;
    private int studentAge;

    Student(String studentName, int studentAge){
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Name is: " + this.studentName + ", age is: " + this.studentAge;
    }
}

public class OverrideToStringArray {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Bob", 22));
        al.add(new Student("Joe", 23));
        al.add(new Student("Sue", 24));
        al.add(new Student("Mike", 22));
        al.add(new Student("Julliet", 25));
        for(Student student : al) System.out.println(student);



    }
}
