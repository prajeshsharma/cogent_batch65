package abstraction;

public class BikeTest {
    public static void main(String[] args) {
        HarleyDavidson b = new HarleyDavidson();
        b.changeCadence(73);
        b.changeGear(5);
        b.speedUp(25);
        b.printStates();
    }
}
