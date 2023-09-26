package selectionSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = { 9,5,1 };
        selectionSort(arr);
        String a = Arrays.toString(arr);
        System.out.println(a);
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int max = arr[0];
            int indexOfMax = 0;

            for (int j = 0; j < arr.length - i; j++) {
                if (max < arr[j]) {

                    max = arr[j];
                    indexOfMax = j;
                }

            }

            // swap max with required space
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[indexOfMax] = temp;
        }
    }
}
