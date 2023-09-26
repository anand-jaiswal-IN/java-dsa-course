package cyclicSort;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 6, 8, 4, 5, 3, 2 };
        int dNum = duplicateNumber(arr);
        System.out.println(dNum);
    }

    public static int duplicateNumber(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != index + 1 && arr[index] != arr[arr[index] - 1]) {
                swap(arr, index, arr[index] - 1);
            } else
                index++;
        }
        System.out.println(Arrays.toString(arr));
        int duplicateNum = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                duplicateNum = arr[i];
                break;
            }
        }
        return duplicateNum;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
