package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountOfParathasisSubString {
    public static int longestValidParentheses(String s) {
        if(s.length()==0 || s.length() == 1) return 0;
        int count1=0,count2=0;
        Stack<Character> charstack=new Stack();
        List<Integer> countingval=new ArrayList();
        for(int i=0;i<s.length();i++){
            if(charstack.empty()) {
                charstack.push(s.charAt(i));
                continue;
            }
            else if(charstack.peek()=='('){
                if(s.charAt(i) == ')') {
                    count1 +=2;
                    charstack.pop();
                }
                else {
                    charstack.push(s.charAt(i));
                }
                continue;
            }
            else if(charstack.peek()==')') {
                if (s.charAt(i) == ')') {
                    charstack.clear();
                    count2 = count2 > count1 ? count2 : count1;
                    count1 = 0;
                }
                else {
                    charstack.clear();
                    charstack.push(s.charAt(i));
                    count2 = count2 > count1 ? count2 : count1;
                }
            }
        }
        count2=count2>count1?count2:count1;
        return count2;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }
}
