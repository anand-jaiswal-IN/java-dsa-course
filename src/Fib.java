public class Fib {

    public static int fibonacciOf(int n){
        if(n==1){
            return 0;
        }else if(n==2) return 1;

        return fibonacciOf(n-2) + fibonacciOf(n-1);
    }
    public static void main(String[] args) {
        int a = fibonacciOf(14);
        System.out.println(a);
    }
}
