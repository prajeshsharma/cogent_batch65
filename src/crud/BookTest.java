package crud;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = null;
        BookDao dao = new BookDao();
        int choice;
        do {
            System.out.println("******MENU*******\nEnter a number");
            System.out.println("1-Create");
            System.out.println("2-Read");
            System.out.println("3-Update");
            System.out.println("4-Delete");
            System.out.println("5-exit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) { // create
                System.out.println("How many records do you want to add?");
                books = new Book[sc.nextInt()];
                for (int i = 0; i < books.length; i++)
                    dao.create(books, i);
            } else if (choice == 2) { // read
                if (books == null) System.out.println();
                else dao.read(books);
            } else if (choice == 3) { // update
                if (books == null) System.out.println("Please enter a record first");
                else {
                    System.out.println("Enter ID of book that you want to update");
                    String id = sc.nextLine();
                    dao.update(books, id);
                }
            } else if (choice == 4) { // delete (set as null)
                if (books == null) System.out.println("Please enter a record first");
                else {
                    System.out.println("Enter ID of book that you want to delete");
                    String id = sc.nextLine();
                    dao.delete(books, id);
                }
            }
        } while (choice != 5);
        System.out.println("Goodbye!!!");
    }
}
