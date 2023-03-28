package abstraction;

public abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {

    @Override
    void notice() {
        System.out.println("This is first class $$$$");
    }
}

class Ladies extends Compartment {

    @Override
    void notice() {
        System.out.println("This is ladies ♀");
    }
}

class General extends Compartment {

    @Override
    void notice() {
        System.out.println("This is general");
    }
}

class Luggage extends Compartment {

    @Override
    void notice() {
        System.out.println("This is luggage\uD83E\uDDF3");
    }
}