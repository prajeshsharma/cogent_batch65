package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDaoImpl implements BookDao {
    Scanner sc = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    @Override
    public void createBook() {
        System.out.println("Enter book title");
        String title = sc.nextLine();
        System.out.println("Enter book price");
        double price = sc.nextDouble();
        sc.nextLine();
        Book b = new Book(books.size(), title, price);
        books.add(b);
        System.out.println("Book created with ID: " + (books.size() - 1));
    }

    @Override
    public void updateBook() {
        System.out.println("Enter ID of book");
        int id = sc.nextInt();
        sc.nextLine();
        for (Book book : books)
            if (book.getId() == id) {
                System.out.println("Enter new title");
                book.setTitle(sc.nextLine());
                System.out.println("Enter new price");
                book.setPrice(sc.nextDouble());
                sc.nextLine();
                return;
            }
        System.out.println("ID not found");
    }

    @Override
    public void deleteBook() {
        System.out.println("Enter ID of book");
        int id = sc.nextInt();
        sc.nextLine();
        for (Book book : books)
            if (book.getId() == id) {
                books.remove(book);
                return;
            }
        System.out.println("ID not found");
    }

    @Override
    public void findBook() {
        System.out.println("Enter ID of book");
        int id = sc.nextInt();
        sc.nextLine();
        for (Book book : books)
            if (book.getId() == id) {
                System.out.println(book.toString());
                return;
            }
        System.out.println("ID not found");
    }

    @Override
    public void printBook() {
        for (Book book : books) System.out.println(book.toString());
    }
}
