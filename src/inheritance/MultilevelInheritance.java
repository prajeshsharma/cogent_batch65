package inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.showGrandfatherAge();
    }

}

class Grandfather {
    int grandfatherAge;

    public Grandfather(int grandfatherAge) {
        this.grandfatherAge = grandfatherAge;
    }

    public void showGrandfatherAge() {
        System.out.println("Grandfather age is " + this.grandfatherAge);
    }
}

class Father extends Grandfather {
    int fatherAge;
    public Father(int fatherAge) {
        super(fatherAge + 30);
        this.fatherAge = fatherAge;
    }
    public void showFatherAge() {
        System.out.println("Father age is " + this.fatherAge);
    }
}

class Son extends Father {
    int sonAge;
    public Son(int sonAge) {
        super(sonAge + 30);
        this.sonAge = sonAge;
    }

    public void showSonAge() {
        System.out.println("Son age is " + this.sonAge);
    }
}
