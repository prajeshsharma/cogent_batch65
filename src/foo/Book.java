package foo;

public class Book {
    private String title;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = 100 * (Math.round(price) / 100.0);
    }

    @Override
    public String toString() {
        return title + "\t\t\t" + "Rs." + price;
    }
}
