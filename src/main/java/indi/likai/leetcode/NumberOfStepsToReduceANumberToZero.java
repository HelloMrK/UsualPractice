package indi.likai.leetcode;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero n=new NumberOfStepsToReduceANumberToZero();
        System.out.println(n.numberOfSteps(123));
    }
    public int numberOfSteps(int num) {
        int rst=0;
        while (num!=0){
            num=num%2==0?num/2:num-1;
            rst++;
        }
        return rst;
    }
}
