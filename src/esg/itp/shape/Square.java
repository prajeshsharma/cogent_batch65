package esg.itp.shape;

public class Square implements Polygon {
    private final float side;
    private float area;
    private float perimeter;

    public Square(float side) {
        this.side = side;
        calcArea();
        calcPeri();
    }

    @Override
    public void calcArea() {
        area = side * side;
    }

    @Override
    public void calcPeri() {
        perimeter = 4 * side;
    }

    @Override
    public void display() {
        System.out.println("Square Area = " + area);
        System.out.println("Square Perimeter = " + perimeter);
    }
}
