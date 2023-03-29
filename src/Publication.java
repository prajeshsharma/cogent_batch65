public class Publication {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return Math.round(100 * price) / 100.00;
    }

    public void setPrice(double price) {
        this.price = Math.round(100 * price) / 100.00;
    }

    public double sell(int count) {
        return count * price;
    }
}
