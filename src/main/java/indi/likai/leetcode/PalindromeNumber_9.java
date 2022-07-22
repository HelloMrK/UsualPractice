package indi.likai.leetcode;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        PalindromeNumber_9 p=new PalindromeNumber_9();
        System.out.println(p.isPalindrome(12321));;
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int tmp=x;
        int rsv=0;
        while (tmp>0){
            rsv=rsv*10+tmp%10;
            tmp/=10;
        }
        return x ==rsv;
    }
}


