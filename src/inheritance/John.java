package inheritance;

public class John {
    public static void main(String[] args) {
        Person person;
        person = new Children("John");
        person.behavior();
        person = new Parent("William");
        person.behavior();
    }
}
