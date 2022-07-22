package indi.likai.leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        RichestCustomerWealth rcw=new RichestCustomerWealth();
        int[][] accounts=new int[][]{{1,2,3},{3,2,1,6}};
        System.out.println(rcw.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int rst=0;
        for (int[] item:accounts
             ) {
            int tmp=0 ;
            for (int i = 0; i < item.length; i++) {
                tmp+=item[i];
            }
            if (tmp>=rst){
                rst=tmp;
            }
        }
        return rst;

    }
}
