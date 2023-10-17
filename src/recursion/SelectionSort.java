package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 11, 3, 2, 1, 9, 7, 8, 10, 4, 6, 5 };
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int n, int maxIndex, int col) {
        if (n == 0)
            return;
        if (col < n) {
            if (arr[col] > arr[maxIndex]) {
                selectionSort(arr, n, col, col + 1);
            } else
                selectionSort(arr, n, maxIndex, col + 1);
        } else {
            // swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[n-1];
            arr[n-1] = temp;
            selectionSort(arr, n - 1, 0, 0);
        }

    }
}
