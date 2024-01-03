package bitmanupulation;

public class FindRightMostSetBit {
    public static int findRightMostSetBit(int number) {

        int position = 1;
        while (true) {
            int mask = 1 << (position-1);
            if((number & mask) != 0) break;
            position++;
        }
        return (int)Math.pow(2, position-1);
    }

    public static void main(String[] args) {
        int a = 343; // 101010111
        int b = 936; // 1110101000
        int c = 6; // 110;
        System.out.println(findRightMostSetBit(a));
        System.out.println(findRightMostSetBit(b));
        System.out.println(findRightMostSetBit(c));
    }
}
