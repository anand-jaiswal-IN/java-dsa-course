package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = { 1 };
        ArrayList<Integer> dNum = duplicateNumber(arr);
        System.out.println(dNum);
    }

    public static ArrayList<Integer> duplicateNumber(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != index + 1 && arr[index] != arr[arr[index] - 1]) {
                swap(arr, index, arr[index] - 1);
            } else
                index++;
        }
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
