package lambdaAndFunctionalInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 4));
        students.add(new Student(2, "Tom", 5));
        Predicate<Integer> predicate = s -> s == 2;

    for (Student student : students)
        if (predicate.test(student.getRollNo()))
            System.out.println(student.toString());

    }
}

class Student {
    private final int rollNo;
    private final String name;
    private final int className;

    public Student(int rollNo, String name, int className) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", className=" + className +
                '}';
    }
}
