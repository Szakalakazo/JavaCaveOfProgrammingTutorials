package begginers_book.arraylists.arraylist_sorting;

import java.util.Comparator;

public class Student2 {
    private String studentName;
    private int rollNo;
    private int studentAge;

    public Student2(int rollNo, String studentName, int studentAge) {
        this.rollNo = rollNo;
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    /*Comparator for sorting the list by Student Name*/
    public static Comparator<Student2> StuNameComparator = new Comparator<Student2>() {

        public int compare(Student2 s1, Student2 s2) {
            String StudentName1 = s1.getStudentName().toUpperCase();
            String StudentName2 = s2.getStudentName().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Student2> StuRollNoComparator = new Comparator<Student2>() {
        @Override
        public int compare(Student2 s1, Student2 s2) {
            int rollNo1 = s1.getRollNo();
            int rollNo2 = s2.getRollNo();
            return rollNo1 - rollNo2;
        }};

    /*Comparator for sorting the list by age*/
    public static Comparator<Student2> StuAge = new Comparator<Student2>() {
        @Override
        public int compare(Student2 s1, Student2 s2) {
            return s1.getStudentAge() - s2.getStudentAge();
        }};

    @Override
    public String toString() {
        return "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
    }
}
