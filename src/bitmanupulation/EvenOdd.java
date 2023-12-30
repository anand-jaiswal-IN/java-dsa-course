// odd even problem using bit manupulation

package bitmanupulation;

import java.util.Scanner;

public class EvenOdd {
    // there is number let say 22 - in binary it is 10110
    // let another number be 25 - in binary it is 11001

    // every even number in binary ends with 0 and every odd number in binary ends
    // with 1

    // ---------- that is we have to check only last digit of binary transformation
    // of that number---------
    // to do the above task we have to OR by 1 with that number
    /*
     * 10110
     * AND 00001 (1 in integer)
     * get 00000 (0 in integer) -> it means it is even
     * 
     * 11001
     * AND 00001 (1 in integer)
     * get 00001 (1 in integer)-> it means it is odd
     */

     public static boolean checkEven(int n){
        if((n&1) == 0) return true;
        else return false;
     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            boolean result = checkEven(i);
            System.out.println(i +" "+ result);
        }
    }
}
