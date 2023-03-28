package inheritance;

public class Parent extends Person {
    public Parent(String person) {
        super(person);
    }

    public void behavior() {
        System.out.println(getName() + " respects us");
    }
}
