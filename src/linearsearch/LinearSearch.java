package linearsearch;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(linearSearch(arr, 34));
        System.out.println(isFound(arr, 34));

        int[] nums = { 58, 69, 36, 14, 85 };
        int h = linearSearchInRange(nums, 36, 3, 4);
        System.out.println(h);

    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static boolean isFound(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;

    }

    public static int linearSearchInRange(int[] arr, int value, int index1, int index2) {
        {
            for (int i = index1; i <= index2; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        }
    }
}
