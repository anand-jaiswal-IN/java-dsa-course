package bubbleSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {  };
        bubbleSort(arr);
        String a = Arrays.toString(arr);
        System.out.println(a);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean swapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if(!swapped) break;
        }
    }
}