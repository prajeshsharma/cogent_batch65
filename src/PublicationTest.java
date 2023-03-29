public class PublicationTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setId("B100");
        b1.setAuthor("John");
        b1.setPrice(12.99);
        b1.setTitle("Where's Waldo");

        Magazine m1 = new Magazine();
        m1.setIssue("March 2, 2023");
        m1.setTitle("People's Magazine");
        m1.setPrice(0.73);

        System.out.println(m1.sell(3));
        System.out.println(b1.sell(2));
    }
}
