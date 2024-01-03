package bitmanupulation;

public class SetTheiTHBit {
    public static int changeBit(int number, int position) {
        int mask = 1 << (position - 1);
        return (number|mask);
    }
    /*
     * ----------set the bit to 1-------------
     * 
     *    100111
     * OR 001000
     * =  101111 (changed the 4th bit to 1)
     * 
     *    100111
     * OR 000100
     * =  100111 (Here 3rd bit is already 1 so no change occured)
     * 
     */

    public static void main(String[] args) {
        int a = 35; // 100011
        int res = changeBit(a, 3); // 100111
        System.err.println(res);
    }
}
