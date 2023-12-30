package cyclicSort;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1,1};
        
        System.out.println(firstMissingPositive(arr));
        // System.out.println(Arrays.toString(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int index = 0;
        while(index<arr.length){
            if(arr[index] != index+1 && arr[index] > 0 && arr[index] <= arr.length && arr[index] != arr[arr[index]-1]){
                swap(arr, index, arr[index]-1);
            }else index++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
