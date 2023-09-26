package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<size; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();

        
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

    }

    
}
