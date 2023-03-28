package serialisation;

import java.io.Serializable;

public class Student implements Serializable {
    private final int rollNumber;
    private final int age;
    private final String name;
    private final String address;

    public Student(int rollNumber, int age, String name, String address) {
        super();
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
