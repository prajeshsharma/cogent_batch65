package inheritance;

public class SportsCar extends Car {
    private final int airBalloonType;

    public SportsCar(String name, int speed, int noOfGears, int airBalloonType, String gearStatus) {
        super(name, speed, noOfGears, gearStatus);
        this.airBalloonType = airBalloonType;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "The air balloon type is " + airBalloonType;
    }

}
