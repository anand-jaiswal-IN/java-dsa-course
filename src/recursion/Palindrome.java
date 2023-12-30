package recursion;

public class Palindrome {
    public static void main(String[] args) {
        // boolean a = checkPalindrome2(3123);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " : " + checkPalindrome(i));
        }
        // System.out.println(a);
    }

    public static boolean checkPalindrome(int n) {
        return (n == reverseNumber(n));
    }

    public static int reverseNumber(int n) {
        if (n % 10 == n)
            return n;
        int digit = (int) Math.log10(n);
        return (n % 10) * (int) Math.pow(10, digit) + reverseNumber(n / 10);

    }

    public static boolean checkPalindrome2(int n) {
        if (n == 0)
            return true;
        int digit = (int) Math.log10(n) + 1;
        if ((int) (n / Math.pow(10, digit - 1)) != n % 10)
            return false;

        int newNum = (int)(n % (int) Math.pow(10, digit - 1)) / 10;
        return checkPalindrome(newNum);

    }
}
