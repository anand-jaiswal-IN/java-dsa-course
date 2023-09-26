public class JustForCode {
    public static void main(String[] args) {

        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] nums) {
        int i = 1;
        while(true) {
            for (int j = 0; j < nums.length; j++) {
                if(i==nums[j]) break;
                if (j==nums.length-1) return i;
            }
            i++;
        }
        
    }
}