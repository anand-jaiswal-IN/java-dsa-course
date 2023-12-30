package bitmanupulation;

public class CheckNonReapeatedNumber {

    /*
     * --------------concept--------------
     * 
     * 0 XOR 0 = 1
     * 1 XOR 0 = 0 
     * 0 XOR 1 = 0 
     * 1 XOR 1 = 1
     * 
     *      01010 (10 in integer)
     * XOR  10010 (18 in integer)
     *    = 00101 (5 in integer)
     * 
     *      10111 (23 in integer)
     * XOR  10111 (23 in integer)
     *    = 11111
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 3, 5, 10, 4 };
        int r = arr[0];
        for (int i = 1; i < arr.length; i++) {
            r ^= arr[i];
        }
        System.err.println("Non-reapeated Number is : " + r);
    }
}
