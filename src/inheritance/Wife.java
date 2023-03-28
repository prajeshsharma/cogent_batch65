package inheritance;

public class Wife extends Person {
    public Wife(String person) {
        super(person);
    }

    public void behavior() {
        System.out.println(getName() + " loves me");
    }
}
