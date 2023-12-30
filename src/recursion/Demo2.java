package recursion;

public class Demo2 {
    public static void main(String[] args) {
        callMe(5);
    }   
    public static void callMe(int n) {
        if(n==0) return;
        callMe(n-1);
        System.out.println(n);
    }

}
