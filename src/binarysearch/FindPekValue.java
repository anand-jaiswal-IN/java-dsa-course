package binarysearch;

public class FindPekValue {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 8, 7, 4, 3, 1 };
        int req = findPeakValue(arr);
        System.out.println(req);
        System.out.println(arr[req]);
    }

    public static int findPeakValue(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;

            if (arr[middle] > arr[middle + 1]) {
                 end = middle;
            } else {
               start = middle+1;
            }

        }
        return start;
    }

}
