package binarysearchin2darray;

import static binarysearchin2darray.TwoDArray.*;

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {

        int[][] arr = createSqaureMatrix(3);
        printMatrix(arr);
        int[] req = searchInMatrix(arr, 10);
        System.out.println(Arrays.toString(req));

    }

    public static int[] searchInMatrix(int[][] arr, int target) {

        int lastRowIndex = arr.length-1;
        int lastColIndex = arr[0].length-1;

        int row = 0;
        int col = 0;

        while(row < arr.length && col>=0) {
            int middleRowIndex = (row + lastColIndex)/2;
            int middleColIndex = (col + lastColIndex)/2;

            if(target<arr[middleRowIndex][middleColIndex]) {
                if(target<arr[middleRowIndex-1][lastColIndex] ) {
                    row = middleColIndex;
                }
                if(target<arr[lastRowIndex][middleColIndex-1]){
                    col = middleColIndex;
                }

            }
            else if(target>arr[middleRowIndex][middleColIndex]){
                if(target>arr[middleRowIndex-1][lastColIndex] ) {
                    row = middleColIndex;
                }
                if(target>arr[lastRowIndex][middleColIndex-1]){
                    col = middleColIndex;
                }
            }else{
                return new int[] {middleRowIndex, middleColIndex};
            }
        }

        return new int[] {-1,-1};

    }
}

// 1 2 6 7
// 4 5 8 10
// 9 11 16 18
