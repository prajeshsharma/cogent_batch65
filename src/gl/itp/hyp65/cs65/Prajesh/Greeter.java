package gl.itp.hyp65.cs65.Prajesh;

public class Greeter {
    private final String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name + '!');
    }

    public void sayGoodbye() {
        System.out.println("Goodbye " + name + '!');
    }

}
