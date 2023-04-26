package hashmap;

import java.util.*;

public class Student implements Comparator<Student> {
    private final HashMap<String, String> studentNames; // <name, rollNo>
    private final Scanner sc = new Scanner(System.in);

    public Student(HashMap<String, String> empNames) {
        this.studentNames = empNames;
    }

    public void setName() {
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter roll no.");
        String rollNo = sc.nextLine();
        studentNames.put(name, rollNo);
    }

    public void printNames() {
        System.out.println(studentNames.keySet());
    }

    public void getName(String key) {
        System.out.println(studentNames.getOrDefault(key, "This student does not exist"));
    }

    public void printNamesKeySet() {
        Set<String> k = studentNames.keySet();
        for (String key : k) System.out.println("name: " + key + " roll number:" + studentNames.get(key));
    }

    public void printSize() {
        System.out.println(studentNames.size());
    }

    public void remove(String key) {
        if (!studentNames.containsKey(key)) System.out.println("This student does not exists");
        studentNames.remove(key);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
