package binarysearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 8, 9, 7, 10, 17, 18, 21, 26 };
        int target = 3;
        int foundAt = searchRange(arr, target);
        System.out.println(foundAt);
    }

    public static int searchRange(int[] arr, int target) {
        int start = 0, end = 1;

        
        // concising within a range

        try {
            while (target > arr[end]) { // i am assuming at my array is much more longer
            start = end + 1;
            end = start * 2;
        }
        } catch (Exception e) {
            end = arr.length-1;
        }

        

        // apply binary search in this range
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;

    }
}
