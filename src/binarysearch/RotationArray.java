package binarysearch;

public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {1 };
        // int rotateNumber = 2;
        // int[] rotateArray = rotateArray(arr, rotateNumber);
        int req = search(arr, 0);

        // System.out.println(Arrays.toString(rotateArray));
        System.out.println(req);
    }

    public static int search(int[] nums, int target) {
        int pivot = pivotInRotatedArray(nums);
        // return pivot;
        if (binarySearch(nums, target, 0, pivot) != -1) {
            return binarySearch(nums, target, 0, pivot);
        } else {
            return binarySearch(nums, target, pivot+1, nums.length - 1);
        }

    }

    public static int[] rotateArray(int[] arr, int rotateNumber) {

        for (int j = 0; j < rotateNumber; j++) {

            int lastElem = arr[arr.length - 1];

            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = lastElem;

        }
        return arr;

    }

    public static int pivotInRotatedArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;

            if (arr[middle] > arr[middle + 1]) {
                return middle;
            } else if (arr[middle - 1] > arr[middle]) {
                return middle - 1;
            } else if (arr[middle] < arr[start]) {
                end = middle - 1;
            } else if (arr[middle] >= arr[start]) {
                start = middle;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;


            // [1,2,3,4,5] , target = 6

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {//(arr[mid] < target) {
                start = mid;
            }
        }
        return -1;
    }
}
