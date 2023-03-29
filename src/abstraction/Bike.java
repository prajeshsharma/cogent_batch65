package abstraction;

public interface Bike {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBreaks(int decrement);

}
