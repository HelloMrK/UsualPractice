package indi.likai.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        LongestCommonPrefix_14 l=new LongestCommonPrefix_14();
        String[] strs=new String[]{"flower","flower","flower","f","flower","flower","flower"};
        System.out.println(l.longestCommonPrefix(strs));
    }


    public String longestCommonPrefix(String[] strs) {
        String rst="";
        boolean b=true;
        int pointer=0;
        while (b){
            Set<Character> set=new HashSet<>();
            for (int i = 0; i < strs.length; i++) {
                //指针长度超过了字符串长度
                if (pointer>=strs[i].length()){
                    b=false;
                    break;
                }

                set.add(strs[i].charAt(pointer));
            }
            if (set.size()!=1 || !b){
                break;
            }
            rst+=set.iterator().next();
            pointer++;
        }

        return rst;
    }
}
