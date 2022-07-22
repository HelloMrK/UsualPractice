package indi.likai.leetcode;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        SearchInsertPosition_35 sip=new SearchInsertPosition_35();
        System.out.println(3>>2);
        System.out.println(sip.searchInsert(new int[]{1,3,5,6},2));
    }

    public int searchInsert(int[] nums, int target) {
        return searchInsert(0,nums.length-1,nums,target);
    }
    private int searchInsert(int lp,int rp,int[] nums,int target){
        if (lp>rp ){
            return lp;
        }

        if (nums[lp+(rp-lp)/2]==target){
            return lp+(rp-lp)/2;
        }
        if (nums[lp+(rp-lp)/2]>target){
            return searchInsert(lp,lp+(rp-lp)/2-1,nums,target);
        }
        else{
            return searchInsert(lp+(rp-lp)/2+1,rp,nums,target);
        }
    }
}

