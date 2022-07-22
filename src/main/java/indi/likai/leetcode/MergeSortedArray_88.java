package indi.likai.leetcode;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        MergeSortedArray_88 mer=new MergeSortedArray_88();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        while (m>0&&n>0){
            if (nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }else{
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while(n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }


    }
}
