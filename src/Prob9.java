public class Prob9 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
        arr[15] = sum(arr);
        arr[16] = Math.round(average(arr));
        arr[17] = smallest(arr);
        System.out.println(arr[15]);
        System.out.println(arr[16]);
        System.out.println(arr[17]);
    }

    private static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 15; i++)
            min = Math.min(arr[i], min);
        return min;
    }

    private static int average(int[] arr) {
        int sum  = 0;
        for (int i = 0; i < 15; i ++)
            sum += arr[i];
        return (int) Math.round(sum / 15.0);
    }

    private static int sum(int[] arr) {
        int sum  = 0;
        for (int i = 0; i < 15; i ++)
            sum += arr[i];
        return sum;
    }
}
