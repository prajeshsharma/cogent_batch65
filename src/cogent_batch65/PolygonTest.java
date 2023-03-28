package cogent_batch65;
import esg.itp.shape.*;

public class PolygonTest {
    public static void main(String[] args) {
        Polygon square = new Square(7.3f);
        Polygon rectangle = new Rectangle(65, 73);
        square.display();
        rectangle.display();
    }
}
