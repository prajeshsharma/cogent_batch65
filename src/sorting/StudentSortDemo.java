package sorting;

import java.util.*;

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kris", 21));
        students.add(new Student("Pinky", 2));
        students.add(new Student("Golu", 13));
        students.add(new Student("Babloo", 10));
        students.add(new Student("Madhu", 14));
        students.add(new Student("Gyanendra", 1088));
        students.add(new Student("Diprendra", 1073));
        students.add(new Student("Birendra", 1220));
        students.add(new Student("Tribuvan", 1188));

        System.out.println(students);
         Collections.sort(students);
        System.out.println("\n" + students);
        students.sort(new SortByName());
        System.out.println("\n" + students);

    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
