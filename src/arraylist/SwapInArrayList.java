package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapInArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
               
        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        swap(arr, 1, 2);
        System.out.println(arr);
        sc.close();
    }
    public static void swap(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);

        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
}
