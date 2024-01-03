package bitmanupulation;

public class CheckNonReapeatedNumber {

    /*
     * --------------concept--------------
     * 
     * 0 XOR 0 = 0
     * 1 XOR 0 = 1 
     * 0 XOR 1 = 1 
     * 1 XOR 1 = 0
     * 
     *      01010 (10 in integer)
     * XOR  10010 (18 in integer)
     *    = 11000 (24 in integer)
     * 
     *      10111 (23 in integer)
     * XOR  10111 (23 in integer)
     *    = 00000 (0 in integer) 
     * 
     *      100010 (34 in integer)
     * XOR  000000 (0 in integer)
     *      100010 (34 in integer)
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 3, -4, 5, 10, 4, -4 };
        int r = arr[0];
        for (int i = 1; i < arr.length; i++) {
            r ^= arr[i];
        }
        System.err.println("Non-reapeated Number is : " + r);
    }
}
