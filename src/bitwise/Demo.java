package bitwise;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + isEven(i));
        }
    }
    public static boolean isEven(int n)
    {
        if((int)(n & 1)  == 1) return false;
        return true;
    }
}
