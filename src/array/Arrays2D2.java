package array;
public class Arrays2D2 {
    public static void main(String[] args) {
        int[][] arr = {
            {4,3,6},
            {6,7},
            {1,2,3,6}
        };

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
