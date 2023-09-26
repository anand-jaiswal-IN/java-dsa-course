package method;

import java.util.Arrays;

public class Functions {
    static int a = 99;

    public static void main(String[] args) {
        
        int a = 10;
        int b = a;
        System.out.println(b); // 10
        b = 20;
        System.out.println(a); // 10
        System.out.println(b); // 20
        

        int[] arr = {1,2,3,4};
        int[] arr2 = arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        arr2[0] = 10;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


        Integer n = 5;
        Integer m = n;
        m = 10;
        System.out.println(m);
        System.out.println(n);
    }

    static void swapNumbers(int a , int b) {
        int temp = a+b;
        b = temp-b;
        a = temp-a;
    }
    
}
