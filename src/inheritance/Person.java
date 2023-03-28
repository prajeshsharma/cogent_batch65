package inheritance;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void behavior() {
        System.out.println("I am " + name);
    }
}
