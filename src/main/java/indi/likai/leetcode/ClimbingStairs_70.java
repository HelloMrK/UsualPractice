package indi.likai.leetcode;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        ClimbingStairs_70 c = new ClimbingStairs_70();
        System.out.println(c.climbStairs(5));
    }


    public int climbStairs(int n) {
        int rst = 0;
        if (n < 1) {
            rst = 0;
        } else if (n == 1) {
            rst = 1;
        } else if (n == 2) {
            rst = 2;
        } else {
            //Dynamic Programming
            int x = 2;//n-1
            int y = 1;//n-2

            for (int i = 3; i <= n; i++) {
                rst = x + y;
                y = x;
                x = rst;
            }
        }
        return rst;
    }
}
