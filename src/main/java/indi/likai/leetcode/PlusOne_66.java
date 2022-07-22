package indi.likai.leetcode;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        PlusOne_66 p=new PlusOne_66();
        System.out.println(p.plusOne(new int[]{9,9})[2]);
    }
    public int[] plusOne(int[] digits) {
        boolean carryFlag=true;
        for (int i = digits.length-1 ; i >=0; i--) {
            digits[i]+=carryFlag?1:0;
            if (digits[i]==10){
                digits[i]=0;
                carryFlag=true;
            }else{
                carryFlag=false;
            }
        }
        if (carryFlag){
            int[] newDigits=new int[digits.length+1];
            newDigits[0]=1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i]=digits[i-1];
            }
            digits=newDigits;
        }
        return digits;
    }
}
