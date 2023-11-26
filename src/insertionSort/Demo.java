package insertionSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {5,4,9,8,7};
        int[] arr2 = selectionSort(arr);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0) {
                if (arr[j - 1] > arr[j]) {
                    // swap occur
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else break;
                j--;
            }
        }
        return arr;
    }
}
