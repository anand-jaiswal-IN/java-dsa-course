package bitmanupulation;

public class ResetiTHBit {
    public static int resetBit(int number, int position){
        /*
         * ----------------Resetting bit means that changing bit to 0----------------
         * 
         *      1 1 0 0 1 0 1
         * AND  1 1 1 0 1 1 1
         * =    1 1 0 0 1 0 1
         * 
         *      1 1 0 0 1 0 1
         * AND  1 0 1 1 1 1 1
         * =    1 0 0 0 1 0 1
         * 
         */
        int mask = ~(1 << (position-1));
        return (number & mask); 
    }
    public static void main(String[] args) 
    {
        int a = 56; // 111000 in binary
        int r = resetBit(a, 3); // 111000
        int r2 = resetBit(a, 4); // 110000
        System.out.println(r);
        System.out.println(r2);
    }
}
