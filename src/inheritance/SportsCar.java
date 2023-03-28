package inheritance;

public class SportsCar extends Car {
    private final int airBalloonType;

    public SportsCar(String name, int speed, int noOfGears, int airBalloonType, String gearStatus) {
        super(name, speed, noOfGears, gearStatus);
        this.airBalloonType = airBalloonType;
    }

    public void display() {
        super.display();
        airBalloonType();
    }

    private void airBalloonType() {
        System.out.println("The air balloon type is " + airBalloonType);
    }
}
