package inheritance;

public class Medicine {
    private final String name;
    private final String address;

    public Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayLabel() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

}
