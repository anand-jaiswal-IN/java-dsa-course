package Strings;

public class Series {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
            // System.out.println(series.hashCode());
        }
        String n = new String("anand");
        String a = new String("anand");
        // System.out.println(n.hashCode());
        // System.out.println(a.hashCode());
        int[] arr = { 4, 2, 5, 6 };
        int[] arr2 = { 4, 2, 5, 6 };
        // System.out.println(n == a);
        System.out.println(n.getClass());
    }
}
