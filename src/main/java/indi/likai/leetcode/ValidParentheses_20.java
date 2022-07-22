package indi.likai.leetcode;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        ValidParentheses_20 v=new ValidParentheses_20();
    }
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        for (char c :s.toCharArray()
             ) {
            if (c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('  ){
                stack.pop();
            }else if(c==']' && !stack.isEmpty() && stack.peek()=='['  ){
                stack.pop();
            }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'  ){
                stack.pop();
            }else{
                return false;
            }
            return stack.isEmpty();


        }

        return true;
    }
}
