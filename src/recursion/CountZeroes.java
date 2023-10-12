package recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int a = countZeroes(1024000500);
        System.out.println(a);
    }

    public static int countZeroes(int n) {
        return helperCountZeroes(n, 0);
    }

    public static int helperCountZeroes(int n, int noOfZeroes) {
        if (n == 0)
            return noOfZeroes ;
        if (n % 10 == 0)
            ++noOfZeroes;
        return helperCountZeroes(n / 10, noOfZeroes);
    }
}
