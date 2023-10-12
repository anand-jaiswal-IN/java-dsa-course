package recursion;

public class ReduceToZero {
    public static void main(String[] args) {
        int a = numberOfSteps(0, 0);
        System.out.println(a);
    }

    public static int numberOfSteps(int n, int countStep) {
        if (n == 1)
            return countStep+1;
        if (n % 2 == 0) { // even number
            return numberOfSteps(n / 2, ++countStep);
        }
        return numberOfSteps((n - 1) / 2, countStep += 2);
    }
}
