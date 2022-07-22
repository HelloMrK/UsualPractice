package indi.likai.leetcode;

public class RemoveElement_27 {
    public static void main(String[] args) {
        RemoveElement_27 re=new RemoveElement_27();
        int[] exp={3,2,2,3};
        System.out.println(re.removeElement(exp,3));

    }

    public int removeElement(int[] nums, int val) {
        int idx=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=val){
                nums[idx]=nums[i];
                idx++;
            }
        }

        return idx;
    }
}
