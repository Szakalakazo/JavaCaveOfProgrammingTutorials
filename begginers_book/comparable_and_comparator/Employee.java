package begginers_book.comparable_and_comparator;

public class Employee implements Comparable<Employee> {
    int id;
    String empName;
    int empAge;

    public Employee(int id, String empName, int empAge) {
        this.id = id;
        this.empName = empName;
        this.empAge = empAge;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.id > employee.id) return 1;
        else if (this.id < employee.id) return -1;
        return 0;

    }

    public int compareToAge(Employee employee) {
        if (this.empAge > employee.empAge) return 1;
        else if (this.empAge < employee.empAge) return -1;
        return 0;
    }

    public int compareToName(Employee employee) {
        return this.empName.compareTo(employee.empName);
    }

    @Override
    public String toString() {
        return "Employee name: " + empName + ", Employee age: " + empAge + ", Employee ID: " + id;
    }
}
