package indi.likai.leetcode;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransomNote=new RansomNote();
        System.out.println(ransomNote.canConstruct("aab","baa"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean rst=true;
        for (int i = 0; i <magazine.length() ; i++) {
            String ch=String.valueOf(magazine.charAt(i));
            if (ransomNote.contains(ch)){
                ransomNote=ransomNote.replaceFirst(ch,"");
            }
            if (ransomNote.length()==0){
                rst=true;
                break;
            }
        }
        return rst;
    }
}
