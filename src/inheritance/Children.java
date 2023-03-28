package inheritance;

public class Children extends Person {
    public Children(String name) {
        super(name);
    }

    public void behavior() {
        System.out.println(getName() + " cares for us");
    }
}
