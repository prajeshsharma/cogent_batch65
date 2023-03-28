package cogent_batch65;

public class HarleyDavidson implements Bike {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        this.speed -= decrement;
    }


    public void printStates() {
        System.out.println("Cadence: " + this.cadence);
        System.out.println("Gear: " + this.gear);
        System.out.println("Speed: " + this.speed);
    }
}
