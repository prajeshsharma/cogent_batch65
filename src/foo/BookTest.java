package foo;

import java.util.Scanner;

public class BookTest {
    private static Book[] books;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many do books you want? ");
        books = new Book[sc.nextInt()];
        createBook();
        showBooks();
    }

    public static void showBooks() {
        System.out.println("Book Title\t\t\tPrice");
        for (Book book : books) System.out.println(book.toString());
    }

    public static void createBook() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            Book book = new Book();
            System.out.print("What is the title of the Book? ");
            book.setTitle(sc.nextLine());
            System.out.print("What is the price of the Book? ");
            book.setPrice(sc.nextDouble());
            sc.nextLine();
            books[i] = book;
        }
    }
}
