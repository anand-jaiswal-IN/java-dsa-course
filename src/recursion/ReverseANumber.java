package recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        // String a = reverseNumber(764823, "");
        // String a = reverseNumber2(353600);
        // int a = reverseNumber3(45018732, 0);
        // int a = reverseNumber4(123456001, 9);
        int a = reverseNumber5(123400);
        System.out.println(a);
    }

    public static String reverseNumber(int n, String rev) {
        if (n == 0)
            return rev;
        rev = rev + Integer.toString(n % 10);
        return reverseNumber(n / 10, rev);
    }

    public static String reverseNumber2(int n) {
        if (n % 10 == n)
            return Integer.toString(n);
        return Integer.toString(n % 10) + reverseNumber2(n / 10);
    }

    public static int reverseNumber3(int n, int rev) {
        if (n == 0)
            return rev;
        rev = rev * 10 + n % 10;
        return reverseNumber3(n / 10, rev);
    }

    public static int reverseNumber4(int n, int noOfDigits) {
        if (Integer.toString(n).length() != noOfDigits)
            return 0;
        if (n % 10 == n)
            return n;
        return (n % 10) * (int) Math.pow(10, noOfDigits - 1) + reverseNumber4(n / 10, noOfDigits - 1);
    }

    public static int reverseNumber5(int n) {
        if (n % 10 == n)
            return n;
        // int digit = Integer.toString(n).length();
        int digit = (int) Math.log10(n);
        return (n % 10) * (int) Math.pow(10, digit) + reverseNumber5(n / 10);

    }
}
