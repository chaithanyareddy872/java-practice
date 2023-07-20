package com.java.leetcode;

public class CommonStringStarting {
    public static int strStr(String haystack, String needle) {
        int start=0;
        for(int i=0;i<haystack.length();i++){
            if (((i+needle.length())<haystack.length()+1) && haystack.substring(i,i+needle.length()).equals(needle)) return i;
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }
}
