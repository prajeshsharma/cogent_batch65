package collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private final String name;
    private final int rollNo;

    public Employee(String name, int id) {
        super();
        this.name = name;
        this.rollNo = id;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", id=" + rollNo + '}';
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
