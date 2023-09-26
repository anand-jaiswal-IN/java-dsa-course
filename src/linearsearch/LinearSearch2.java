package linearsearch;



public class LinearSearch2 {
    public static void main(String[] args) {
        String str = "Anand jaiswal";

        


        char value = 'a';
        for (char ch : str.toCharArray()) {
            if(ch == value) {
                System.out.println(value);
            }
        }
        
    }
}
