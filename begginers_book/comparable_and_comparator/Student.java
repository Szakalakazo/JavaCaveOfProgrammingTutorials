package begginers_book.comparable_and_comparator;

public class Student implements Comparable<Student> {
    private String studentName;
    private int rollNo;
    private int studentAge;

    public Student(int rollNo, String studentName, int studentAge) {
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


    /*Sorting by studens age*/
    @Override
    public int compareTo(Student s1) {
        int compareAge = s1.getStudentAge();
        /*Acceding order*/
        return this.studentAge - compareAge;
    }

    public int compareToRoll(Student s1) {
        int compareRoll = s1.getRollNo();
        /*Acceding order*/
        return this.rollNo - compareRoll;
    }



    @Override
    public String toString() {
        return "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
    }
}
