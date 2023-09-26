package binarysearchin2darray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = createSqaureMatrix(3);
        printMatrix(arr);

    }

    public static int[][] create2DArray(int row, int col) {
        int[][] arr = new int[row][col];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public static int[][] createSqaureMatrix(int n) {
        int[][] arr = new int[n][n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        sc.close();

        return arr;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
