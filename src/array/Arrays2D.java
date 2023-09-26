package array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = takeInput(3, 3);
    
    
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

    public static int[][] takeInput(int row, int col){

        int[][] arr = new int[row][col];

        Scanner sc = new Scanner(System.in);
        

        for(int i = 0; i<row; i++) {
            for(int j =0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;

    }
}
