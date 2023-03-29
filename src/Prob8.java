public class Prob8 {
    public static void main(String[] args) {
        if (args.length < 2) return;
        System.out.println("Your first number is " + args[0]);
        System.out.println("Your second number is " + args[1]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a < 1 || a > 40 || b < 1 || b > 40) {
            System.out.println("Numbers must be between 1 and 40");
            return;
        }
        int[] arr = new int[5];
        for (int j = 0; j < 5; j++)
            arr[j] = (int) (Math.random() * 40 + 1);

        boolean firstExists = false;
        boolean secondExists = false;
        for (int i : arr) {
            if (i == a) firstExists = true;
            if (i == b) secondExists = true;
        }
        if (firstExists && secondExists) System.out.println("It's Bingo!");
    }
}
