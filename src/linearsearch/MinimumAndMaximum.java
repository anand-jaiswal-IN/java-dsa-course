package linearsearch;
import java.util.Random;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Random ran = new Random();

        int[] arr = {ran.nextInt(10), ran.nextInt(10), ran.nextInt(10), ran.nextInt(10)};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];

            }   
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) {
                min = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
