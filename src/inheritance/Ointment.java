package inheritance;

import inheritance.Medicine;

public class Ointment extends Medicine {
    private final String usage;

    public Ointment(String name, String address, String usage) {
        super(name, address);
        this.usage = usage;
    }

    public void displayLabel() {
        super.displayLabel();
        System.out.println("usage: " + usage);
    }

}
