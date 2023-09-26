package cyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 3,2,3,4,6,5 };
        int[] n = setMismatch(arr);
        System.out.println(Arrays.toString(n));
    }

    public static int[] setMismatch(int[] arr) {
        int[] toReturn = new int[2];

        int index = 0;
        while (index < arr.length) {
            if(arr[index] != index+1 && arr[index] != arr[arr[index]-1]){
                swap(arr, index, arr[index]-1);
            }else index++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                toReturn[1] = i+1;
                toReturn[0] = arr[i];
                break;
            }
        }

        return toReturn;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
