package indi.likai.leetcode;

public class ImplementStr_28 {
    public static void main(String[] args) {
        ImplementStr_28 imp=new ImplementStr_28();
        System.out.println(imp.strStr("a","a"));

    }
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (i+needle.length()<=haystack.length()
                    && haystack.charAt(i)==needle.charAt(0)
                    && haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
