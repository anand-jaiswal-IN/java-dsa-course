package bitmanupulation;

public class FindiTHBit {
    public static int getBit(int number, int position) {
        /*
         * ---------To find iTh bit of a number --------------
         * 
         * positions (iTh bit) -> 6 5 4 3 2 1
         * binary form of a number -> 1 0 0 0 1 1
         * 
         * if we want to know the 4th bit of a number
         * then left shift 1 by 3 bit. Final mask bit is like -> 1000
         * 
         * now taking AND with number(100011) and mask binary number (1000)
         * 
         * 100011
         * AND 001000
         * = 000000 -> i.e. bit at 4th position is 0
         * 
         * now taking AND with number(100011) and mask binary number (10)
         * 
         * 100011
         * AND 000010
         * = 000010 -> i.e. bit at 2nd position is 1 (result we get is not 0)
         * 
         */
        int mask = 1 << (position - 1);
        return ((number & mask) == 0) ? 0 : 1;
    }

    public static void main(String[] args) {
        int a = 35; // in binary -> 100011
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " position : " + getBit(a, i));
        }
        // System.out.println(r);
        // System.out.println(r1);
    }
}
