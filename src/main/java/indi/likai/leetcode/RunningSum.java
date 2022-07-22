package indi.likai.leetcode;

public class RunningSum {
    public static void main(String[] args) {
        RunningSum rs=new RunningSum();
        System.out.println(rs.runningSum(new int[]{1,2,3,4})[3]);
    }
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
                nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
