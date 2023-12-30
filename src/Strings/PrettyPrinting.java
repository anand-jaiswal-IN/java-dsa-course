package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float n = 45.356f;
        System.out.println(n);    
        System.out.printf("String is %.2f\n", n); // this is called named placeholders
        System.out.printf("%.2f %n", Math.PI);
        String name = "Anand";
        String place = "Bahadurganj";
        System.out.printf("My name is %s. I live in %s %n", name, place);
        
    }

}
