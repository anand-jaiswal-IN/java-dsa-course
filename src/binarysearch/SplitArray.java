package binarysearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int req = splitArray(arr, 2);
        System.out.println(req);
    }

    public static int splitArray(int[] arr, int k) {

        // here start is the maximum value of element in array and end is the sum of all
        // elements in array
        int start = arr[0];
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }


        //binary search
        while (start < end) {
            
            int pieces = 1;
            int mid = start + (end - start) / 2;
            int sum = 0;


            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    pieces++;
                    sum = arr[i];
                } else {
                    sum += arr[i];
                }
            }

           if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;

    }

}
