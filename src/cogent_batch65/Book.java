package cogent_batch65;

public class Book extends Publication {
    private String id;
    private String author;

    public Book() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + "\nName: " + getTitle() + '\n' +
                "Price: " + getPrice() + "\nAuthor: " + author;
    }
}
