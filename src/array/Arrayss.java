package array;
import java.util.Arrays;

public class Arrayss {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(nums));
        changeValue(nums, 0, 99);
        System.out.println(Arrays.toString(nums));

    }

    public static void changeValue(int[] arr, int index, int value) {
        arr[index] = value;
    }

}

// arrays are mutable in java that means we can change the value of object while
// string are immutable