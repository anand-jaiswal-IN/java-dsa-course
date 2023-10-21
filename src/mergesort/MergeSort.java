package mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = { 3 };
        int[] arr2 = { 1 };
        int[] arr3 = mergeSort(new int[arr1.length + arr2.length], 0, arr1, 0, arr2, 0);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeSort(int[] newArr, int newArrIndex, int[] arr1, int arr1Index, int[] arr2, int arr2Index) {
        if (newArrIndex >= newArr.length)
            return newArr;

        if (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                newArr[newArrIndex] = arr1[arr1Index];
                newArr = mergeSort(newArr, newArrIndex + 1, arr1, arr1Index + 1, arr2, arr2Index);
            } else {
                newArr[newArrIndex] = arr2[arr2Index];
                newArr = mergeSort(newArr, newArrIndex + 1, arr1, arr1Index, arr2, arr2Index + 1);
            }
        } else {
            if (arr1Index >= arr1.length) {
                newArr[newArrIndex] = arr2[arr2Index];
                mergeSort(newArr, newArrIndex + 1, arr1, arr1.length - 1, arr2, arr2Index + 1);
            } else if (arr2Index >= arr2.length) {
                newArr[newArrIndex] = arr1[arr1Index];
                mergeSort(newArr, newArrIndex + 1, arr1, arr1Index + 1, arr2, arr2.length - 1);
            } else
                return newArr;
        }
        return newArr;
    }
}
