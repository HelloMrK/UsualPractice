package indi.likai.leetcode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 r=new RemoveDuplicatesFromSortedArray_26();
        int[] exp={0,1,1,2,2,3,3,4};
        System.out.println(r.removeDuplicates(exp));
    }


    public int removeDuplicates(int[] nums) {
        if (nums.length<1){
            return 1;
        }
        int idx=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[idx]!=nums[i]){
                idx++;
                nums[idx]=nums[i];
            }
        }

        return idx+1;
    }
}
