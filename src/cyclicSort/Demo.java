package cyclicSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 4, 6, 2, 1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, arr[i] - 1, i);
            } else
                i++;
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
