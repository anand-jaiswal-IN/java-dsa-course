package Strings;
import java.util.Arrays;
public class Exercise {
    public static void main(String[] args) {
        String str = "pbr.mno";
        // String ne = reverseWords("pqr.mno");

        System.out.println(Arrays.toString(str.split(".", 0)));
    }

    public static String reverseWords(String S) {
        String[] words = S.split(".");
        for (int i = 0; i < words.length / 2; i++) {
            swap(words, i, words.length / 2 - i);
        }
        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            newS.append(words[i] + ".");
        }
        return newS.toString();
    }

    public static void swap(String[] words, int index1, int index2) {
        String temp = words[index1];
        words[index1] = words[index2];
        words[index2] = temp;
    }
}
