package cogent_batch65;

public class StringDemo {
    public static void main(String[] args) {
        if (args.length == 0) return;
        String s = args[0];
        System.out.println("The length is: " + s.length());
        System.out.println("The string in uppercase: " + s.toUpperCase());
        System.out.println(isPalindrome(s) ? "The string is a palindrome" : "The string is not a palindrome");
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        return true;
    }
}