package collection;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookDaoImpl bookDaoImplementation = new BookDaoImpl();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu\n1: add a book\n2: update book\n3: search by ID\n4: print books\n5: remove books\n6: quit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) bookDaoImplementation.createBook();
            else if (choice == 2) bookDaoImplementation.updateBook();
            else if (choice == 3) bookDaoImplementation.findBook();
            else if (choice == 4) bookDaoImplementation.printBook();
            else if (choice == 5) bookDaoImplementation.deleteBook();
        } while (choice != 6);
    }
}
