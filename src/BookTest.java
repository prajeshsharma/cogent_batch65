import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            Book b1 = new Book();
            System.out.println("Enter book id:");
            b1.setId(sc.nextLine());
            System.out.println("Enter book name:");
            b1.setTitle(sc.nextLine());
            System.out.println("Enter author name:");
            b1.setAuthor(sc.nextLine());
            System.out.println("Enter book price:");
            b1.setPrice(sc.nextDouble());
            sc.nextLine();
            books[i] = b1;
        }

        for (Book book : books)
            System.out.println(book.toString() + '\n');
    }
}
