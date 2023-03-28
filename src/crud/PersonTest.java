package crud;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = null;
        PersonDao dao = new PersonDao();
        int choice;

        do {
            System.out.println("******MENU*******\nEnter a number");
            System.out.println("1-Create");
            System.out.println("2-Print");
            System.out.println("3-Exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("How many records do you want to add?");
                int count = sc.nextInt();
                people = new Person[count];
                for (int i = 0; i < people.length; i++) dao.create(people, i);
            } else if (choice == 2) {
                assert people != null;
                dao.read(people);
            }
        } while (choice != 3);
        System.out.println("Goodbye!");
    }
}
