package recursion;

public class Fib {

    public static int fibonacciOf(int n){
        if(n==1){
            return 0;
        }else if(n==2) return 1;

        return fibonacciOf(n-2) + fibonacciOf(n-1);
    }
    public static int fiboFormula(int n){
        return  (int)((Math.pow( ((1 + Math.sqrt(5))/2), n) - Math.pow( ((1 - Math.sqrt(5))/2), n))/Math.sqrt(5));
    }
    public static void main(String[] args) {
        int a = fibonacciOf(5);
        System.out.println(a);
    }
}
