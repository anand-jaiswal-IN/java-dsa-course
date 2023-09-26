package cyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0,3,1 };
        int re = missingNumber(arr);
        System.out.println(re);
    }

    public static int missingNumber(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if ((arr[index] != index) && (arr[index] != arr.length)) {
                swap(arr, arr[index], index);
            } else
                index++;
        }
        System.out.println(Arrays.toString(arr));
        int missed = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                missed = i;
                break;
            }
        }
        return missed;

    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
