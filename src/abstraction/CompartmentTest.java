package abstraction;

public class CompartmentTest {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < compartments.length; i++) {
            int n = (int) (Math.random() * 4 + 1);
            if (n == 1) compartments[i] = new FirstClass();
            else if (n == 2) compartments[i] = new Ladies();
            else if (n == 3) compartments[i] = new General();
            else if (n == 4) compartments[i] = new Luggage();
        }
        for (Compartment compartment : compartments) compartment.notice();
    }
}
