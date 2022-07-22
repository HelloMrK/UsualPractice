package indi.likai.leetcode;

public class AddBinary_67 {
    public static void main(String[] args) {
        AddBinary_67 addb=new AddBinary_67();
        System.out.println(addb.addBinary("100","110010"));
    }
    public String addBinary(String a, String b) {
        String rst="";
        int idx=0;
        int carry=0;
        while(carry!=0 ||a.length()-idx>0 || b.length()-idx>0 ){
            int addentA=0;
            if (a.length()-idx>0){
                addentA=Integer.valueOf(a.substring(a.length()-1-idx,a.length()-idx));
            }
            int addentB=0;
            if (b.length()-idx>0){
                addentB=Integer.valueOf(b.substring(b.length()-1-idx,b.length()-idx));

            }
            rst=(addentA+addentB+carry)%2+rst;
            carry=(addentA+addentB+carry)/2;
            idx++;
        }
        return rst;
    }
}
