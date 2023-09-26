package binarysearch;

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr = { 3,5,3,2,0 };
        int target = 0;
        int req = findInMountainArray(arr, target);
        System.out.println(req);

    }

    public static int findInMountainArray(int[] arr, int target) {

        int peak = peakValueMountainArray(arr);

        int start = 0;
        int end = peak;

        // for asc order of array [1,2,3,4,5]

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle]) {  // 4>3
                start = middle+1;
            } else if (target < arr[middle]) {  // 3<4
                end = middle-1;
            }
        }

        start = peak;
        end = arr.length - 1;

        // for desc order array [5,3,1]
        while (start <= end) {
            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                return middle;
            } else if (target > arr[middle]) { // 5>3
                end = middle-1;
            } else if (target < arr[middle]) {
                start = middle+1;
            }
        }

        return -1;
    }

    public static int peakValueMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // int peak = -1;

        while (start < end) {
            int middle = (start + end) / 2;

            if (arr[middle - 1] < arr[middle]) { // asc order

                if (arr[middle] > arr[middle + 1]) {
                    return middle;
                }
                start = middle;

            } else if (arr[middle] > arr[middle + 1]) { // desc
                end = middle;

            }

        }
        return -1;
    }
};