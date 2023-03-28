package inheritance;

public class Car {
    private final String name;
    private final int speed;
    private final int noOfGears;
    private final String gearStatus;

    public Car(String name, int speed, int noOfGears, String gearStatus) {
        this.name = name;
        this.speed = speed;
        this.noOfGears = noOfGears;
        this.gearStatus = gearStatus;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " is a " + gearStatus + " transmission with a starting speed of " + speed + " and " +
                noOfGears + " gears.");
    }
}
