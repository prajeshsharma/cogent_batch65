package collection;

public class Book {
    private int id;
    private String title;
    private double price;

    public Book() {}

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = Math.round(100 * price) / 100.0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=$" + String.format("%.2f", price) +
                '}';
    }
}
