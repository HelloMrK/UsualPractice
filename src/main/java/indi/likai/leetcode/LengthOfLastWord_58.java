package indi.likai.leetcode;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        LengthOfLastWord_58 l=new LengthOfLastWord_58();
        System.out.println(l.lengthOfLastWord("      "));
    }
    public int lengthOfLastWord(String s) {
        int rst=0;
        boolean startCalcFlag=false;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                if (!startCalcFlag){
                    startCalcFlag=true;
                }
                rst++;
            }
            if (s.charAt(i)==' '&&startCalcFlag){
                break;
            }
        }

        return rst;
    }
}
