package mergeSort;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 7, 2, 1, 10, 65, 55, 44, 43 };
        int[] newArr = mergeSort(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        // three pointer i am taking here for left , right and mix array
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // there happens when all the elements of one array will get finished but
        // another array have some elements
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
