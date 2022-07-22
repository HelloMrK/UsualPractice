package indi.likai.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb")==3);
        System.out.println(l.lengthOfLongestSubstring("pwwkew")==3);
        System.out.println(l.lengthOfLongestSubstring(" ")==1);
        System.out.println(l.lengthOfLongestSubstring("")==0);
    }



    public int lengthOfLongestSubstring(String s) {
        int rst = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Set<Character> set = new HashSet();
            for (int j = i; j < chars.length; j++) {
                int previousLength = set.size();
                set.add(chars[j]);

                if (previousLength == set.size()) {
                    rst = rst > set.size() ? rst : previousLength;
                    break;
                }
                rst = rst > set.size() ? rst : set.size();
            }
        }
        return rst;
    }

}
