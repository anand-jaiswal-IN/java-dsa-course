package bitmanupulation;

class LeftRightShift {
    public static void main(String[] args) {

        /*
         * let the number be 10 - in binary 1010
            if we left shift i.e. << 10100 (shift one bit left side)
                number gets doubled
            if we right shift i.e. >> 0101 (shift one bit right side)
                number gets half
         * 
         */


        int a = 10; //1010
        System.out.println(a<<1); // left shift i.e. 10100 - 20
        System.out.println(a>>1); // right shift i.e. 0101 - 5
    }
}