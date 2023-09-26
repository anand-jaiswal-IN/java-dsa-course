// https://leetcode.com/problems/richest-customer-wealth/description/

package linearsearch;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {1,3,7}, {1,9,5}};

        
    }
    public static int maximumWealth(int[][] accounts) {

        int[] accountBal = new int[accounts.length];

        //traverse through accounts
        for (int i = 0; i < accounts.length; i++) {
            int Bal = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                Bal+=accounts[i][j];
            }
            accountBal[i] = Bal;
        }

        //maximum balance
        int max = accountBal[0];
        for (int i = 0; i < accountBal.length; i++) {
            if(max<accountBal[i]) {
                max = accountBal[i];
            }
        }

        return max;
    }
}
