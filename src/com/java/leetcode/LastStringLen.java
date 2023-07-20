package com.java.leetcode;

public class LastStringLen {
    public static int lengthOfLastWord(String s) {
        s=s.trim();

        int len=s.length();
        if(len==1) return 1;
        int count=0;
        while(len !=0 && s.charAt(len-1)!=' ' ){
            count++;
            len--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   Hello"));
    }
}
