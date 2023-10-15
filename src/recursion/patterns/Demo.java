package recursion.patterns;

public class Demo {
    public static void main(String[] args) {
        // printingRowWisePatterns(5, 5, 0);
        printTriangle(100, 1, 0);

    }

    public static void printingRowWisePatterns(int n, int r, int c) {
        if (n == 0) {
            return;
        }

        if (r == c) {
            System.out.println();
            printingRowWisePatterns(n - 1, r - 1, 0);
        } else {

            System.out.print("* ");
            printingRowWisePatterns(n, r, ++c);
        }
    }

    public static void printTriangle(int n, int r, int c) {
        if (n == 0)
            return;

        if (c == r) {
            if (n != 1) {
                System.out.println();
            }
            printTriangle(n - 1, r + 1, 0);
        } else {
            System.out.print("* ");
            printTriangle(n, r, c + 1);
        }
    }
}
