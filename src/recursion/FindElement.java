package recursion;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 3, 1 };
        int whatToFind = 3;
        boolean is = searchInArray(arr, whatToFind, 0);
        int findAt = findElemIndex(arr, whatToFind, 0);
        // ArrayList<Integer> allElem = findAllElemIndex(arr, whatToFind, 0, new
        // ArrayList<Integer>());
        ArrayList<Integer> allElem = findAllElemIndex2(arr, whatToFind, 0);
        System.out.println(is);
        System.out.println(findAt);
        System.out.println(allElem);
    }

    public static boolean searchInArray(int[] arr, int elem, int index) {
        if (index == arr.length)
            return false;
        return arr[index] == elem || searchInArray(arr, elem, ++index);
    }

    public static int findElemIndex(int[] arr, int elem, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == elem)
            return index;
        else
            return findElemIndex(arr, elem, ++index);
    }

    public static ArrayList<Integer> findAllElemIndex(int[] arr, int elem, int index, ArrayList<Integer> toReturn) {
        if (index == arr.length)
            return toReturn;
        if (arr[index] == elem)
            toReturn.add(index);
        return findAllElemIndex(arr, elem, ++index, toReturn);
    }
    
    public static ArrayList<Integer> findAllElemIndex2(int[] arr, int elem, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == elem)
            list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllElemIndex2(arr, elem, ++index);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
