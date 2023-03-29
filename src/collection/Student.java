package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    private final ArrayList<String> names;

    private final Scanner sc = new Scanner(System.in);

    public Student(ArrayList<String> names) {
        this.names = names;
    }

    public void setName() {
        System.out.println("Enter name to add");
        names.add(sc.nextLine());
    }

    public void searchName(String name) {
        System.out.println("Enter name to search");
        int index = names.indexOf(name);
        if (index == -1) System.out.println(name + " is not in list");
        else System.out.println(name + " is at index " + index );
    }

    public void searchName(int index) {
        if (index > 0 || index < names.size() - 1) {
            System.out.println("Please enter a valid index");
        }
        System.out.println("name at index " + index + " is " + names.get(index));
    }

    public void printNames() {
        Iterator<String> itr = names.listIterator();
        while (itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println();
    }

    public void removeName(String name) {
        int index = names.indexOf(name);
        if (index == -1) System.out.println(name + " is not in list");
        else names.remove(index);
    }
}
