package method;

import java.util.Scanner;

public class Function_Examples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();


        System.out.println(isPrime(n));

    }
    public static boolean isAmstrong(int original) {
        int sum = 0;
        int n = original;
        while(n>0) {
            int rem =n%10;
            n /= 10;
            sum+= rem*rem*rem;
        }
        return sum == original;
    }

    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        int i = 2;
        while(i<n) {
            if(n%i==0) {
                return false;
            }
            i++;
        }
        return true;

    }
}
