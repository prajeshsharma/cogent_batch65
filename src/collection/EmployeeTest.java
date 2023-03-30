package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee ("Sheldon", 73));
        employees.add(new Employee ("Raj", 43));
        employees.add(new Employee ("Leonard", 1));
        employees.add(new Employee ("Howard", 679));


        System.out.println(employees);
    }
}
