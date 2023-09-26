package method;

import java.util.Arrays;

class Variable_arguments {
    public static void main(String[] args) {
        // int nums []  = {1,2,3,4,5,6};
        // sumOfIntegers(nums);
        letsCallFunc(1,2,"hello","normal");
    }
    public static void sumOfIntegers(int ...n) {
        int sum = 0;
        for(int i = 0; i<n.length; i++) {
            sum += n[i];
        }
        System.out.println(sum);
    }
    public static void letsCallFunc(int a,int b, String ...v) { //variable length arguments always be at last.
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}