package indi.likai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz =new FizzBuzz();

    }
    public List<String> fizzBuzz(int n) {
        List<String> rstList=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0&&i%5==0){
                rstList.add("FizzBuzz");
            }else if (i%3==0){
                rstList.add("Fizz");
            }else if (i%5==0){
                rstList.add("Buzz");
            }else{
                rstList.add(Integer.toString(i));
            }
        }
        return rstList;
    }
}
