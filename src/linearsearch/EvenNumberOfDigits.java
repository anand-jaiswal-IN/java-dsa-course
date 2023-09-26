package linearsearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {

        int count = 0;


        int[] nums = {12,345,2,6,7896};

        for (int n : nums) {
            int counter = 0;
            while(n>0) {
                n=n/10;
                counter++;

            }
            if(counter%2==0) {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
