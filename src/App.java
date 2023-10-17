public class App {
    public static void main(String[] args) throws Exception {
        callMe(0);
    }
    public static void callMe(int a){
        if(a==0) return;
        System.out.println("hello world");
        if(true) System.out.println("helllo buddy");
    }
}
