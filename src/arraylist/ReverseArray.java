package arraylist;

import java.util.ArrayList;
public class ReverseArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(54);
        arr.add(55);
        arr.add(56);
        arr.add(57);
        arr.add(12);

        System.out.println(arr);

        int loopAtLast;
        if(arr.size()%2==0) {
            loopAtLast =arr.size()/2;
        }else {
            loopAtLast =arr.size()/2 + 1;
        }
        for(int i=0; i<loopAtLast; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size()-1-i));
            arr.set(arr.size()-1-i, temp);
        }

        System.out.println(arr);


    }
}
