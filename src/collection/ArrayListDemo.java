package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Sheldon");
        names.add("Shiva");
        names.add("John");
        names.add("William");

        Student student = new Student(names);


        int choice;

        do {
            System.out.println("Menu\n1: add a name\n2: search by name\n3: search by index\n4: print names\n5: remove name\n6: quit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                student.setName();
            } else if (choice == 2) {
                System.out.println("Which name do you want to search");
                student.searchName(sc.nextLine());
            } else if (choice == 3) {
                System.out.println("Which index do you want to search");
                student.searchName(sc.nextInt());
                sc.nextLine();
            } else if (choice == 4) {
                student.printNames();
            } else if (choice == 5) {
                System.out.println("Which name do you want to remove");
                student.removeName(sc.nextLine());
            }
        } while (choice >= 1 && choice <= 5);

    }
}
