package crud;

public class Book {
    private String id;
    private String name;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = Math.round(100 * price) / 100.00;
    }

    @Override
    public String toString() {
        return "Book{id='" + id + "', name='" + name + "', price=$" + String.format("%.2f", price) + '}';
    }
}
