import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(10);
        System.out.println(n);
    }
}
