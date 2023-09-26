package recursion;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci2(i));
        }
    }
    public static void messageMe(String msg, int times){
        if(times == 0) {
            return;
        }
        System.out.println(msg);
        messageMe(msg, times-1);
    }
    public static void fibonacci(int a, int b, int times){
        if (times == 0)return;

        System.out.println(a+b);
        fibonacci2(3);
    }
    public static int fibonacci2(int whichFibo){
        if(whichFibo < 2){
            return whichFibo;
        }
        return fibonacci2(whichFibo-1)+fibonacci2(whichFibo-2);
    }
}
