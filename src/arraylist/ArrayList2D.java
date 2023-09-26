package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // initalisation of arraylist
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<Integer>());
        }

        Scanner sc = new Scanner(System.in);

        // assigning the values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                arr.get(i).add(sc.nextInt());
            }
        }
        sc.close();
        System.out.println(arr);

    }
}
