package abstraction;

public class CompartmentTest {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < compartments.length; i++)
            switch ((int) (Math.random() * 4 + 1)) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        for (Compartment compartment : compartments) compartment.notice();
    }
}
