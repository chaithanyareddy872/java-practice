package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowString {
    public static int maxsubarray(String stringval){
        if(stringval.equals(" ") || stringval.length()==1) return 1;
        char first;
        Set<Character> uniquesubarrayset=new HashSet<>();
        int i=0,maxlen=0,indexoffirst=0;
        while (i<stringval.length()){
            first=stringval.charAt(i);
            if(!uniquesubarrayset.add(first)){
                if(maxlen<uniquesubarrayset.size()) maxlen= uniquesubarrayset.size();
                uniquesubarrayset.clear();
                i=stringval.indexOf(first,indexoffirst)+1;
                indexoffirst=i;
            }
            else{
                if (maxlen<uniquesubarrayset.size()) maxlen= uniquesubarrayset.size();
                i++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        System.out.println(maxsubarray("abcabcbb"));
    }
}
