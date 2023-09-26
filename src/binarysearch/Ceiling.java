package binarysearch;

import java.util.Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 9, 10, 15, 19 }; // total 7 elements
        int target = -1;
        int[] ceil = ceilingOfArr(arr, target);
        int[] floor = floorOfArr(arr, target);
        System.out.println(Arrays.toString(ceil));
        System.out.println(Arrays.toString(floor));
    }

    public static int[] ceilingOfArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        if(target>arr[end]) { // when target element is larger than the last element of array
            return new int[] {0, -1};
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;   // 3 => 9'

            if (target == arr[mid]) {
                int[] toReturn = { target, mid };
                return toReturn;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1; // 4 => 10
            }
        }
        int[] toReturn = {arr[start], start};
        return toReturn;
        
    }

    public static int[] floorOfArr(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        if(target < arr[start]) {
            return new  int[] {0, -1};
        }
        while(start<=end){
            int mid = start + (end -start) / 2;

            if(target == arr[mid]){
                return new int[] {target, mid};
            }else if (target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid +1;
            }
        }
        return new int[] {arr[end], end};

    }
}