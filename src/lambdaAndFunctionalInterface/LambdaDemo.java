package lambdaAndFunctionalInterface;

public class LambdaDemo {
    public static void main(String[] args) {
        MyInterface mi = (s) -> (s.length());
        System.out.println(mi.lengthOfString("Lil Jhola"));
    }
}

interface MyInterface {
    int lengthOfString(String s);
}
