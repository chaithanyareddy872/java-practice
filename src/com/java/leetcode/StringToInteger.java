package com.java.leetcode;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToInteger {
    public static void main(String[] args) {
        String stringval=" .932 dlfaskfjsk !234";
        extractnum(stringval);
    }
    public static void extractnum(String stringval){
        String[] stringarray=stringval.split(" ");
        for (String i:stringarray
             ) {
            if(Pattern.matches(".?[0-9]+",i)){
                System.out.println(i);

            }

        }
        System.out.printf("");
    }
}
