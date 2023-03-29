import gl.itp.hyp65.cs65.Prajesh.*;

public class GreeterTest {
    public static void main(String[] args) {
        Advisor a = new Advisor();
        for (String arg : args) {
            Greeter g = new Greeter(arg);
            g.sayHello();
        }
        a.getAdvice();
        for (int i = args.length - 1; i >= 0; i--) {
            Greeter g = new Greeter(args[i]);
            g.sayGoodbye();
        }
    }
}
