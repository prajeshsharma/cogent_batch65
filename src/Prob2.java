public class Prob2 {
    public static void main(String[] args) {
        if (args.length < 2) return;
        System.out.print(args[0] + " " + args[1]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int i = 0; i < 13; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
