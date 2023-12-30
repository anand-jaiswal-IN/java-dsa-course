package recursion;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        sc.close();
        boolean is = checkSorted(arr, 0, 1);
        System.out.println(is);
    }
    public static boolean checkSorted(int[] arr, int index0, int index1){
        if(arr.length == index1) return true;
        if(arr[index0] > arr[index1]) return false;
        return checkSorted(arr, ++index0, ++index1);
    }
}
