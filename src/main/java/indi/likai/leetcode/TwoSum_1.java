package indi.likai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        TwoSum_1 twoSum1 =new TwoSum_1();

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{target-nums[i],i};
            }
            map.put(nums[i],i);
        }

        return new int[2];
    }
}
