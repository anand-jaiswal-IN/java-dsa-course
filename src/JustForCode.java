public class JustForCode {
    public static void main(String[] args) {
        int n = 100;
        int k = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            i = i + k;
            System.out.println(i);
        }
    }
}