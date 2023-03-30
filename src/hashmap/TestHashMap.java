package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        Student students = new Student(map);

        int choice;
        do {
            System.out.println("Menu" +
                    "\n1: add a add" +
                    "\n2: print names" +
                    "\n3: print roll number given a name" +
                    "\n4: print all values" +
                    "\n5: print size" +
                    "\n6: remove" +
                    "\n7: quit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) students.setName(); //add name
            else if (choice == 2) students.printNames(); // print names
            else if (choice == 3) { // get roll number by name
                System.out.println("What is the name?");
                students.getName(sc.nextLine());
            } else if (choice == 4) students.printNamesKeySet(); // print all values using keyset
            else if (choice == 5) students.printSize(); // print size
            else if (choice == 6) {
                System.out.println("What is the name to remove?");
                students.remove(sc.nextLine());
            }
        } while (choice >= 1 && choice <= 6);
    }
}
