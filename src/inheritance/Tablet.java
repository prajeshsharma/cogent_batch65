package inheritance;

public class Tablet extends Medicine {
    private final int dosage;

    public Tablet(String name, String address, int dosage) {
        super(name, address);
        this.dosage = dosage;
    }

    public void displayLabel() {
        super.displayLabel();
        System.out.println("dosage: " + dosage);
    }

}
