package recursion;

public class Factorial {
    public static void main(String[] args) {
        int a = productOfDigits(45);
        System.out.println(a);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int sumTill(int n) {
        if (n == 1)
            return 1;
        return n + sumTill(n - 1);
    }
    public static int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
    public static int productOfDigits(int n){
        if(n%10==n) return n;
        return n%10 * productOfDigits(n/10);
    }
}
