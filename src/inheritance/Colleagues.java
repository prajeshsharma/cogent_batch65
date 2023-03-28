package inheritance;

public class Colleagues extends Person {
    public Colleagues(String person) {
        super(person);
    }

    public void behavior() {
        System.out.println(getName() + " is professional with us");
    }
}
