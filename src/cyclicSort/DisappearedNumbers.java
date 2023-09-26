package cyclicSort;

import java.util.ArrayList;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = { 4,3,2,7,8,2,3,1 };
        ArrayList<Integer> dist =  disappearedNumbers(arr);
        System.out.println(dist);
    }

    public static ArrayList<Integer> disappearedNumbers(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != index + 1 && arr[index] != arr[arr[index] - 1]) {
                swap(arr, index, arr[index] - 1);
            } else
                index++;
        }

        ArrayList<Integer> disAppNums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                disAppNums.add(i+1);
            }
        }
        return disAppNums;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
