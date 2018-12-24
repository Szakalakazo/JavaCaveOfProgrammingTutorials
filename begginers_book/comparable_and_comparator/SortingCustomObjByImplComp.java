package begginers_book.comparable_and_comparator;


import java.util.ArrayList;
import java.util.Collections;


public class SortingCustomObjByImplComp {
    public static void main(String[] args) {
        //List of objects of Author class
        ArrayList<Author> al = new ArrayList<Author>();
        al.add(new Author("Henry","Miller", "Tropic of Cancer"));
        al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
        al.add(new Author("Frank","Miller", "300"));
        al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
        al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */

        Collections.sort(al);
        for(Author item : al) System.out.println(item.toString());

        //List of objects of Employee class
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Kowalski", 42));
        employees.add(new Employee(2, "Błachut", 28));
        employees.add(new Employee(3, "Starzak", 32));
        employees.add(new Employee(4, "Karas", 55));


        System.out.println("\nSorting by employee name:");
        Collections.sort(employees,Employee::compareToName);
        for(Employee worker : employees) System.out.println(worker.toString());

        System.out.println("\nSorting by employee age:");
        Collections.sort(employees,Employee::compareToAge);
        for(Employee worker : employees) System.out.println(worker.toString());

        System.out.println("\nSorting by employee ID:");
        Collections.sort(employees);
        for(Employee worker : employees) System.out.println(worker.toString());


    }
}
