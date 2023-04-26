package inheritance;

public class CartTest {
    public static void main(String[] args) {
        Car c = new SportsCar("Lexus LC", 73, 10, 2, "automatic");
        Car c1 = new Car("Toyota Camry", 50, 6,  "manual");
        System.out.println(c);
        System.out.println(c1);
    }
}
