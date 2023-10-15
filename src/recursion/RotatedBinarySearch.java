package recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4, };
        int target = 7;
        int findAt = search(arr, target, 0, arr.length - 1);
        System.out.println(findAt);
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (target == arr[m])
            return m;

        if (arr[s] <= arr[m]) { // if array is sorted from start to middle
            if (target >= arr[s] && target <= arr[m]) { // target is in between of start and middle
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }

        }
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m - 1);
    }

}
