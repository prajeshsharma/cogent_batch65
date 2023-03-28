package crud;

import java.util.Scanner;

public class BookDao {
    public void create(Book[] books, int i) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Please enter book ID");
        book.setId(sc.nextLine());
        System.out.println("Please Enter Book name");
        book.setName(sc.nextLine());
        System.out.println("Please Enter Book price");
        book.setPrice(sc.nextDouble());
        sc.nextLine();
        books[i] = book;
    }

    public void read(Book[] books) {
        for (Book book : books)
            if (book != null)
                System.out.println(book.toString());
    }

    public void update(Book[] books, String id) {
        System.out.println("ID is: " + id );
        Scanner sc = new Scanner(System.in);
        for (Book book : books)
            if (id.equals(book.getId())) {
                System.out.println("Please Enter Book name");
                book.setName(sc.nextLine());
                System.out.println("Please Enter Book price");
                book.setPrice(sc.nextDouble());
                sc.nextLine();
                return;
            }
        System.out.println("ID does not exist");
    }

    public void delete(Book[] books, String id) {
        for (int i = 0; i < books.length; i++)
            if (id.equals(books[i].getId())) {
                books[i] = null;
                return;
            }
        System.out.println("ID does not exist");
    }

}
