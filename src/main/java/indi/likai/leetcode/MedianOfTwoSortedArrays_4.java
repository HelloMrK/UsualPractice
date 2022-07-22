package indi.likai.leetcode;

public class MedianOfTwoSortedArrays_4 {
    public static void main(String[] args) {
        MedianOfTwoSortedArrays_4 m=new MedianOfTwoSortedArrays_4();
        System.out.println(m.findMedianSortedArrays(new int[]{},new int[]{}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength=nums1.length+nums2.length;
        int LPoint=(totalLength-1)/2;
        int RPoint=LPoint+(totalLength%2==1?0:1);
        int currLPoint=0;
        int sum=0;
        for (int i = 0; i < totalLength; i++) {
            int temp=0;
            if (currLPoint>nums1.length-1){
                temp=nums2[i-currLPoint];

            } else if (i-currLPoint>nums2.length-1) {
                temp=nums1[currLPoint];
                currLPoint++;
            } else if (nums1[currLPoint]<=nums2[i-currLPoint]){
                temp=nums1[currLPoint];
                currLPoint++;
            }else {
                temp=nums2[i-currLPoint];
            }
            if (LPoint==i){
                sum=temp;
                if (LPoint==RPoint){
                    break;
                }
            }

            if (RPoint==i && LPoint<=RPoint){
                sum+=temp;
            }
        }

        return sum/(LPoint==RPoint?1.0:2.0);
    }
}
