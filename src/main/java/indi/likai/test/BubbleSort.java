package indi.likai.test;

public class BubbleSort {
    public static void main(String[] args) {


        int[] nums={1,3,5,1,2,66,87,19};

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (nums[i]<nums[j]){
                    int tmp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
