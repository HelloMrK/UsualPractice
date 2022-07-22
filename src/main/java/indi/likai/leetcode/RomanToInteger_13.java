package indi.likai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        RomanToInteger_13 romanToInteger13 = new RomanToInteger_13();
        System.out.println(romanToInteger13.romanToInt("MCMXCIV"));
    }


    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] romanCharArray = s.toCharArray();
        int rst = 0;
        for (int i = romanCharArray.length - 1; i >= 0; i--) {
            int temp = map.get(romanCharArray[i]);

            //compare with the previous
            if (i > 0 && map.get(romanCharArray[i]) > map.get(romanCharArray[i - 1])) {
                temp -= map.get(romanCharArray[i - 1]);
                i--;
            }
            rst += temp;
        }
        return rst;
    }

}
