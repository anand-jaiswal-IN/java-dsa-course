package binarysearch;

public class CountOfRotation {
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};

        int req = countRotation(arr);
        System.out.println(req);
    }
    public static int countRotation(int[] arr) {
        if (arr.length==1)  {
           return 0;
       }
       else {
           int counter =0;
           while(arr[counter] <= arr[counter+1]) {
               if(counter == arr.length-2) {
                   return 0;
               }
               counter++;
           }
           return counter+1;
       }
    }
}
