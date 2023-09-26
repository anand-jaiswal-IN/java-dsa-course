package linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,78,45,32},
            {85,36,14,35},
            {45,36,75,98}
        };

        int target = 14;
        int[] coordinates = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(coordinates));

        System.out.println(largestValue(arr));
        
    }
    public static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
            
        }        
        return new int[] {-1, -1};
    }
    public static int largestValue(int[][] args) {
        int max = args[0][0];

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                if(max < args[i][j]) {
                    max = args[i][j];
                }
            }
        }
        return max;
    }
}
