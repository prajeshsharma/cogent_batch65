package esg.itp.shape;

public class Rectangle implements Polygon {
    private final float length;
    private final float breadth;
    private float area;
    private float perimeter;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        calcArea();
        calcPeri();
    }

    @Override
    public void calcArea() {
        area  = length * breadth;
    }

    @Override
    public void calcPeri() {
        perimeter = 2 * length + 2 * breadth;
    }

    @Override
    public void display() {
        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }
}
