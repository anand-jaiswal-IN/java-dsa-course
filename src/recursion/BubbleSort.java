package recursion;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 2, 1, 8, 6, 7 };
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n, int col) {
        if (n == 0)
            return;
        if (n > col) {
            if (arr[col] > arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, n, col+1);
        }else{
            bubbleSort(arr, n-1, 0);
        }
    }
}