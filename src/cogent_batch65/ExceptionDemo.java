package cogent_batch65;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
           int a = Arithmetic.division(4, 0);
           System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("undefined");
        } catch (NumberFormatException e) {
            System.out.println("Make your argument an integer");
        } finally {
            System.out.println("This will always print");
        }

    }



}

class Arithmetic {
    public static int division(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
