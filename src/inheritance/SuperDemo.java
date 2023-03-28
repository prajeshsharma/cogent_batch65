package inheritance;

public class SuperDemo {
    public static void main(String[] args) {
        B b = new B(73, 27);
        b.show();
    }
}

class A {
    int a;

    public A(int a) {
        this.a = a;
    }

}

class B extends A {
    int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    void show() {
        System.out.println(a + "\n" + b);
    }
}

