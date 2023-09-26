package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

        // int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        // int[] arr = { 5, 7, 8, 10, 14, 16, 19 };
        int[] arr = {4,4,4,4,4};
        int target = 7;

        int foundAt = binarySearch(arr, target);
        System.out.println(foundAt);

    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) { // if arr is ascending

            int mid = (start + end) / 2;

            while (start <= end) {
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
            }
            return -1;
        }

        else if (arr[start] > arr[end]) { // if arr is descending
            int mid = (start + end) / 2;

            while (start <= end) {
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
            }
            return -1;
        }
        else {
            return 0;
        }

    }
}